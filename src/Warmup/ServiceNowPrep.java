package Warmup;

import java.util.Arrays;
import java.util.Stack;

/**
 * Implementation of Service Now Prep algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ServiceNowPrep {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs reverse operation.
	 *
	 * @param arr the array to process
	 * @return the resulting array
	 */
	private static int[] reverse(int[] arr) {
		Stack<Integer> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			arr[i]=stack.pop();
		}
		return arr;
	}


}






