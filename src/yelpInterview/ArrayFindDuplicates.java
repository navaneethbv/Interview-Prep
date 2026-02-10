package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Find Duplicates algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayFindDuplicates {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds duplicates in the data structure.
	 *
	 * @param inputArray the array to process
	 */
	private static void findDuplicates(int[] inputArray) {
		int[] signArray=Arrays.copyOf(inputArray, inputArray.length);
		// Iterate through all elements
		for (int i = 0; i < signArray.length; i++) {
			if(signArray[inputArray[i]]<0)
				System.out.println(inputArray[i]);
			else
				signArray[inputArray[i]]=-1*inputArray[i];
		}
	}

}