package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Segregate01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArraySegregate01 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs segregate operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] segregate(int[] inputArray) {
		int noOfZeroes=0,noOfOnes=0;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			// Check for null/base case
			if(inputArray[i]==0)
				noOfZeroes++;
			else
				noOfOnes++;
		}
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			if(noOfZeroes>0)
				inputArray[i]=0;
			else
				inputArray[i]=1;
			noOfZeroes--;
		}
		return inputArray;
	}


}