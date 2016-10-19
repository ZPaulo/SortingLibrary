package sort;

public abstract class Sort {
	
	static final int SIZE = 20;
	
	public static void sort(int[] array){
		if(array.length < SIZE)
			Insertion.sort(array);
		else
			Merge.sort(array);
	}
	

	
	public static void main(String[] args){
		int[] a1 = new int[]{5,4,3,2,1,0};
		int[] a2 = a1.clone();
		
		int[] a3 = Merge.sort(a1,true);
		//Merge.sort(a1);
		for(int i : a3)
			System.out.println(i);
		
		Insertion.sort(a2);
	}
}
