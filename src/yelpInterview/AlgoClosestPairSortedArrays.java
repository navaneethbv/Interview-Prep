package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Algo Closest Pair Sorted Arrays algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AlgoClosestPairSortedArrays {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds closest pair in the data structure.
	 *
	 * @param arr1 the array to process
	 * @param arr2 the array to process
	 * @param value the value value
	 * @return the computed integer result
	 */
	private static int findClosestPair(int[] arr1, int[] arr2,int value) {

		int mergedArray[]=new int[arr1.length+arr2.length];
		int arr2Index=0;
		// Iterate through all elements
		for (int i = 0; i < mergedArray.length; i++) {
			if(i<arr1.length)
			{
				mergedArray[i]=arr1[i];
			}
			else{
				mergedArray[i]=arr2[arr2Index];
				arr2Index++;
			}
		}
		Arrays.sort(mergedArray);
		int low=0,high=mergedArray.length-1;
		while(low<high)
		{
			int sum=mergedArray[low]+mergedArray[high];
			if(sum==value)
				return sum;
			else if(sum>value)
				high--;
			else
				low++;	
		}
		return mergedArray[low]+mergedArray[high];
	}

}

