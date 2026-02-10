package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Rotate Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayRotateArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Rotates the array.
	 *
	 * @param inputArray the array to process
	 * @param count the count parameter
	 * @return the resulting array
	 */
	private static int[] rotateArray(int[] inputArray, int count) {
		for (int i = 0; i < count; i++) {
			inputArray=rotate(inputArray);
		}
		return inputArray;
	}

	/**
	 * Rotates the .
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] rotate(int[] inputArray) {
		int temp=inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			inputArray[i]=temp^inputArray[i];
			temp=temp^inputArray[i];
			inputArray[i]=temp^inputArray[i];
		}
		inputArray[0]=temp;
		return inputArray;
	}
}