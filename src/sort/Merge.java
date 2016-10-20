package sort;

/**
 * Implements method capable of sorting integer arrays using insertion sort.
 */
public abstract class Merge {

	// Left run is A[iLeft :iRight-1].
	// Right run is A[iRight:iEnd-1 ].
	private static void BottomUpMerge(int A[], int iLeft, int iRight, int iEnd, int B[], int[] posA, int[] tempA){
		int i = iLeft, j = iRight;
		// While there are elements in the left or right runs...
		for (int k = iLeft; k < iEnd; k++) {
			// If left run head exists and is <= existing right run head.
			if (i < iRight && (j >= iEnd || A[i] <= A[j])) {
				B[k] = A[i];
				if(tempA != null)
					tempA[k] = posA[i];
				i = i + 1;
			} else {
				B[k] = A[j];
				if(tempA != null)
					tempA[k] = posA[j];
				j = j + 1;    
			}
		} 
	}

	/**
	 * Sorts an integer array numbers using merge sort
	 * Uses {@link #sort(int[],boolean)} with boolean = false
	 * @see #sort(int[],boolean)
	 * @param array array to be sorted
	 */
	public static void sort(int[] array) {
		sort(array, false);
	}

	/**
	 * Sorts an integer array numbers using merge sort. 
	 * Optionally returns an array with the original element positions of the sorted array
	 * @param array array to be sorted
	 * @param positions if true returns element positions, else returns null
	 * @return null or element positions before sorting
	 */
	public static int[] sort(int[] array, boolean positions) {

		int size = array.length;
		int[] temp = new int[size];
		int[] positionsArray = null, tempPositionsArray = null;
		if(positions){
			positionsArray = new int[size];
			tempPositionsArray=new int[size];
			for(int i = 0; i < size; i++)
				positionsArray[i] = i;
		}

		// Each 1-element run in A is already "sorted".
		// Make successively longer sorted runs of length 2, 4, 8, 16... until
		// whole array is sorted.
		for (int width = 1; width < size; width = 2 * width) {
			// Array A is full of runs of length width.
			for (int i = 0; i < size; i = i + 2 * width) {
				// Merge two runs: A[i:i+width-1] and A[i+width:i+2*width-1] to
				// B[]
				// or copy A[i:n-1] to B[] ( if(i+width >= n) )
				if(positions)
					BottomUpMerge(array, i, i + width < size ? i + width : size, i + 2 * width < size ? i + 2 * width : size, temp, positionsArray, tempPositionsArray);
				else
					BottomUpMerge(array, i, i + width < size ? i + width : size, i + 2 * width < size ? i + 2 * width : size, temp, null, null);
			}
			// Now work array B is full of runs of length 2*width.
			// Copy array B to array A for next iteration.
			// A more efficient implementation would swap the roles of A and B.
			System.arraycopy(temp, 0, array, 0, size);
			// Now array A is full of runs of length 2*width.
			if(positions)
				System.arraycopy(tempPositionsArray, 0, positionsArray, 0, size);
		}
		return positionsArray;
	}
}
