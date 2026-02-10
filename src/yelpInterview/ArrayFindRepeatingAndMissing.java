package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Find Repeating And Missing algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayFindRepeatingAndMissing {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds repeat missing in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] findRepeatMissing(int[] inputArray) {
		int[] outputArr=new int[2];
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[Math.abs(inputArray[i])-1]>0)
				inputArray[Math.abs(inputArray[i])-1]=-1*inputArray[Math.abs(inputArray[i])-1];
			else
				outputArr[0]=(Math.abs(inputArray[i]));
		}
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i]>0)
				outputArr[1]=(i+1);
		}
		
		return outputArr;
	}

}