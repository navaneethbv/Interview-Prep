package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Construct Array Pair Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayConstructArrayPairSum {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds array pair sum in the data structure.
	 *
	 * @param pair the array to process
	 * @param n the size or count parameter
	 * @return the resulting array
	 */
	private static int[] findArrayPairSum(int[] pair,int n) {
		int arr[]=new int[n];
		arr[0] = (pair[0]+pair[1]-pair[n-1]) / 2;
		for (int i=1; i<n; i++)
			arr[i] = pair[i-1]-arr[0];
		return arr;
	}




}