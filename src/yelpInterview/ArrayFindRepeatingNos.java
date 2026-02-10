package yelpInterview;

import java.util.HashSet;

/**
 * Implementation of Array Find Repeating Nos algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayFindRepeatingNos {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds nos in the data structure.
	 *
	 * @param inputArray the array to process
	 */
	private static void findNos(int[] inputArray) {
		HashSet<Integer> elementCount=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			if(elementCount.contains(inputArray[i]))
				System.out.println(inputArray[i]);
			else
				elementCount.add(inputArray[i]);
		}
	}
}