package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Two Elements Zero Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayTwoElementsZeroSum {

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
	 */
	private static void findPair(int[] inputArray) {
		Arrays.sort(inputArray);
		int left=0;
		int right=inputArray.length-1;
		int sum=0;
		int minSum=Integer.MAX_VALUE;
		while(left<right)
		{
			sum=inputArray[left]+inputArray[right];
			minSum=Math.min(Math.abs(sum), minSum);
			if(sum>0)
			{
				right--;
			}
			else{
				left++;
			}
		}
		System.out.println(minSum);

	}

}