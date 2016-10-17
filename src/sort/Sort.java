package sort;

public abstract class Sort {
	
	static final int SIZE = 20;
	
	public static void sort(int[] array){
		if(array.length < SIZE)
			Insertion.sort(array);
		else
			Merge.sort(array);
	}
}
