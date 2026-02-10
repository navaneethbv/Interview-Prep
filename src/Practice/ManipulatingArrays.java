package Practice;

import java.util.ArrayList;

public class ManipulatingArrays {
	
	public static void main(String[] args) throws Exception {
		int[] array = {3,2,4,9,7};
		//Scanner scan = new Scanner(System.in);
		//Use user input to enter data 
		int position = 2; int value = 5;
		//Comment the below lines one by one to test
		System.out.println("The new array after insertion is "+insert(array,position,value));
		System.out.println("The new array after deletion is "+delete(array,position));
		System.out.println("The element at position "+position+" is "+search(array,position));
	}
	
	/*
	 * Rules for inserting element into the array
	 * 1. If you have to insert at the position within the array length, move the elements to the right from the insert position.
	 * 2. If you have to insert at the position outside the array, null if no elements are present between array length
	 * and position else insert the value at the specified position.
	 */
	private static ArrayList<Integer> insert(int[] array, int position,int value) {
		int length = array.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(position < length) {
			for(int i = 0; i < position; i++) {
				list.add(array[i]);
			}
			list.add(value);
			for(int i = position + 1 ; i < length; i++) {
				list.add(array[i]);
			}
		}
		else if(position == length) {
			for(int i = 0 ; i < length; i++) {
				list.add(array[i]);
			}
			list.add(value);
		}
		else if(position > length) {
			for(int i = 0; i < array.length; i++) {
				list.add(array[i]);
			}
			for(int i = array.length; i < position; i++) {
				list.add(null);
			}
			list.add(value);
		}
		return list;
	}
	
	/*
	 * Rules for Deletion - 
	 * Deletion happens within the array length.
	 * 1. If the position doesn't appear within the array length, return cannot find the position.
	 * 2. If the position appears within the array length, then remove the element, move remaining elements to the left.
	 */
	private static ArrayList<Integer> delete(int[] array, int position) throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(position > array.length) {
			throw new Exception("Element to delete is not found at position "+position);
		}
		for(int i = 0 ; i < position; i++ ) {
			list.add(array[i]);
		}
		for(int i = position + 1 ; i < array.length; i++) {
			list.add(array[i]);
		}		
		return list;
	}
	
	/*
	 * Rules for Searching - 
	 * Return not found if element position doesn't appear within the array length, else return the element at the position
	 */
	private static int search(int[] array, int position) throws Exception {
		if(position > array.length) {
			throw new Exception("Element is not found at position "+position);
		}
		return array[position];
	}
	
}
