package sort;

public class InsertionSortion {
	public static void sort(int[] a){
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			int j;
			for (j = i-1; j>=0 && a[j] > x; j--) {
				a[j+1]=a[j];
			}
			a[j+1]=x;
		}
	}
}
