package sort;

public abstract class Merge {

	private static void topDownSplitMerge(int[] B, int startI, int endI, int[] A) {
		if (endI - startI < 2) // if run size == 1
			return; // consider it sorted
		// split the run longer than 1 item into halves
		int middleI = (startI + endI) / 2;

		// recursively sort both runs from array A[] into B[]
		topDownSplitMerge(A, startI, middleI, B); // sort the left run
		topDownSplitMerge(A, middleI, endI, B); // sort the right run

		// merge the resulting runs from array B[] into A[]
		topDownMerge(B, startI, endI, middleI, A);
	}

	private static void topDownMerge(int[] A, int startI, int endI, int middleI, int[] B) {
		int i = startI, j = middleI;

		for (int k = startI; k < endI; k++) {
			// If left run head exists and is <= existing right run head.
			if (i < middleI && (j >= endI || A[i] <= A[j])) {
				B[k] = A[i];
				i = i + 1;
			} else {
				B[k] = A[j];
				j = j + 1;
			}
		}
	}

	public static void sort(int[] numbers) {

		int[] temp = new int[numbers.length];
		System.arraycopy(numbers, 0, temp, 0, numbers.length);

		topDownSplitMerge(temp, 0, numbers.length, numbers);
	}
}
