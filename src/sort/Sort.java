package sort;

/**
 *  Implements method capable of sorting integer arrays using insertion or merge sort.
 */
public abstract class Sort {

	static final int SIZE = 8;

	/**
	 * Sorts an integer array using either insertion sort or merge sort,
	 * depending on the array size Uses {@link sort(int[],boolean)} with boolean
	 * = false
	 * 
	 * @see sort(int[],boolean)
	 * @param array
	 *            array to be sorted
	 */
	public static void sort(int[] array) {
		sort(array, false);
	}

	/**
	 * Sorts an integer array using either insertion sort or merge sort,
	 * depending on the array size Optionally returns an array with the original
	 * element positions of the sorted array
	 * 
	 * @param numbers
	 *            array to be sorted
	 * @param positions
	 *            if true returns element positions, else returns null
	 * @return null or element positions before sorting
	 */
	public static int[] sort(int[] array, boolean positions) {
		if (array.length < SIZE)
			return Insertion.sort(array, positions);
		else
			return Merge.sort(array, positions);

	}
}
