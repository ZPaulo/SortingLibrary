package main;
import sort.Merge;

public class HelloWorld {
	public static void main(String[] args){
		int[] array = new int[]{5,7,3,4,5};
		
		Merge.sort(array);
		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}
