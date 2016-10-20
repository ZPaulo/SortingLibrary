package sort;

/**
 * Implements method capable of sorting integer arrays using insertion sort.
 */
public abstract class Insertion {
	/**
	 * Sorts an array using the insertion sort algorithm. Uses
	 * {@link sort(int[],boolean) sort(array,positions)} by setting
	 * {@code positions} as {@code false}
	 * 
	 * @see sort(int[],boolean)
	 * @param array
	 *            array of integers to be sorted
	 */
	public static void sort(int[] array) {
		sort(array, false);
	}

	/**
	 * Sorts an array using the merge sort algorithm. Returns the original
	 * positions of the elements in the sorted array if {@code positions} is set
	 * as {@code true}.
	 * 
	 * @param array
	 *            array of integers to be sorted
	 * @param positions
	 *            if {@code true}, the method returns the original positions of
	 *            the elements in the sorted array, otherwise returns
	 *            {@code null}
	 * @return if {@code positions} is set as {@code true} returns the original
	 *         positions of the elements in the sorted array, otherwise returns
	 *         {@code null}
	 */
	public static int[] sort(int[] array, boolean positions) {
		int[] positionsArray = null;
		int i = 0;
		if (positions) {
			positionsArray = new int[array.length];
			for (i = 0; i < positionsArray.length; i++)
				positionsArray[i] = i;
		}
		for (i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {

				int temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
				if (positions) {
					int ptemp = positionsArray[j];
					positionsArray[j] = positionsArray[j - 1];
					positionsArray[j - 1] = ptemp;
				}
			}
		}
		return positionsArray;

	}

}
