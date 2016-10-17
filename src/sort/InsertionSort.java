package sort;

public abstract class InsertionSort {
	public static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j=i;
			while (j>0 && a[j-1]> a[j]) {
				int temp = a[j];
				a[j]=a[j-1];
				a[--j]=temp;
			}
		}
	}
}
