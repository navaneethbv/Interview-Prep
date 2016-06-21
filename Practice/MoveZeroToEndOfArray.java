package Practice;

import java.util.ArrayList;

public class MoveZeroToEndOfArray {
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = {3,0,2,5,0,3,0,0,7,9};	
		
		System.out.println("The new array is "+createNewArray(array));
		System.out.println("The number of non-zero elements in the array is "+countNonZeroElements(array));
	}
	
	public static int countNonZeroElements(int[] array){
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0){
				count ++;
			}
		}
		return count;
	}
	
	public static ArrayList<Integer> createNewArray(int[] array) {
		ArrayList<Integer> list = new ArrayList<Integer>(array.length);
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0) {
				list.add(array[i]);
			}
		}
		for(int i = countNonZeroElements(array); i < array.length; i++) {
			list.add(0);
		}
		return list;
	}
}
