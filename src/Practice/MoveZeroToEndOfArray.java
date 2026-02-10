package Practice;

import java.util.ArrayList;

/**
 * Implementation of Move Zero To End Of Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MoveZeroToEndOfArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = {3,0,2,5,0,3,0,0,7,9};	
		
		System.out.println("The new array is "+createNewArray(array));
		System.out.println("The number of non-zero elements in the array is "+countNonZeroElements(array));
	}
	
	/**
	 * Counts the number of non zero elements.
	 *
	 * @param array the array to process
	 * @return the computed integer result
	 */
	public static int countNonZeroElements(int[] array){
		int count = 0;
		// Iterate through all elements
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0){
				count ++;
			}
		}
		return count;
	}
	
	/**
	 * Performs createNewArray operation.
	 *
	 * @param array the array to process
	 * @return the list of results
	 */
	public static ArrayList<Integer> createNewArray(int[] array) {
		ArrayList<Integer> list = new ArrayList<Integer>(array.length);
		// Iterate through all elements
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
