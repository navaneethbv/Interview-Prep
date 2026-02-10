package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Product Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayProductArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds product array in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] findProductArray(int[] inputArray) {
		int product=1;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			product*=inputArray[i];
		}
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i]=product/inputArray[i];
		}
		return inputArray;
	}

}