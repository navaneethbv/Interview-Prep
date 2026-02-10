package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Find Pair Difference algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayFindPairDifference {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds pair difference in the data structure.
	 *
	 * @param inputArray the array to process
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findPairDifference(int[] inputArray, int n) {
		Arrays.sort(inputArray);
		int low=0,high=inputArray.length-1;
		while(low<=high)
		{
			int diff=inputArray[high]-inputArray[low];
			if(diff==n)
				return true;
			if(diff>n)
				high--;
			else
				low++;
		}
		return false;
	}



}