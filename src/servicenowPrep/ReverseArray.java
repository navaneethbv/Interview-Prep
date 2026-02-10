package servicenowPrep;

import java.util.Arrays;
import java.util.Stack;

/**
 * Implementation of Reverse Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseArray
{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs reverseArr operation.
	 *
	 * @param arr the array to process
	 * @return the resulting array
	 */
	private static int[] reverseArr(int[] arr) {
		Stack<Integer> stack=new Stack<Integer>();
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