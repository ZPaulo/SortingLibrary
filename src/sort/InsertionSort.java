package sort;

public class InsertionSort {
	public static void sort(int[] a){
		for (int i = 0; i < a.length; i++) {
			int j;
			for (j = i-1; j>=0 && a[j] > a[i]; j--)
				a[j+1]=a[j];
			a[j+1]=a[i];
		}
	}
}
