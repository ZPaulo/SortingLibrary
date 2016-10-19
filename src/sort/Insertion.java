package sort;

/**
 * 
 *
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
		int[] p = null;
		int i = 0;
		if (positions) {
			p = new int[array.length];
			for (i = 0; i < p.length; i++)
				p[i] = i;
		}
		for (i = 1; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j - 1] > array[j]) {
				int temp = array[j];
				array[j] = array[j - 1];
				array[j] = temp;
				if (positions) {
					int ptemp = p[j];
					p[j] = p[j - 1];
					p[--j] = ptemp;
				}
			}
		}
		return p;

	}

}
