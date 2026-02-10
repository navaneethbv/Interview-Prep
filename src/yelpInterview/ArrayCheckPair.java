package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Check Pair algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayCheckPair {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds pair in the data structure.
	 *
	 * @param inputArray the array to process
	 * @param sum the sum parameter
	 */
	private static void findPair(int[] inputArray, int sum) {
		Arrays.sort(inputArray);
		int left=0;
		int right=inputArray.length-1;
		while(left<=right)
		{
			if(inputArray[left]+inputArray[right]==sum){
				System.out.println(inputArray[left]+"/"+inputArray[right]);
				break;
			}
			else if(inputArray[left]+inputArray[right]>sum)
				right--;
			else
				left++;
		}
	}
}

