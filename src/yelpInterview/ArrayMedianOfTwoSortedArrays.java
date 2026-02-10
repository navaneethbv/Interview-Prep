package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Median Of Two Sorted Arrays algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayMedianOfTwoSortedArrays {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds median in the data structure.
	 *
	 * @param arr1 the array to process
	 * @param arr2 the array to process
	 * @return the computed integer result
	 */
	private static int findMedian(int[] arr1, int[] arr2) {

		if(arr1.length==1)
		{
			return (arr1[0]+arr2[0])/2;
		}
		else if(arr1.length==2)
		{
			return (Math.max(arr1[0], arr2[0]) + Math.min(arr1[1], arr2[1]))/2;
		}
		int median1=arr1.length%2==0?arr1[arr1.length/2]:(arr1[arr1.length/2]+arr1[arr1.length/2-1])/2;
		int median2=arr2.length%2==0?arr1[arr1.length/2]:(arr2[arr2.length/2]+arr2[arr1.length/2-1])/2;
		if(median1==median2)
			return median1;
		else if(median1>median2)
		{	if(arr1.length%2!=0)
			// Recursively process left and right subtrees
			return findMedian(Arrays.copyOf(arr1, arr1.length/2), Arrays.copyOfRange(arr2, arr2.length/2,arr2.length));
		return findMedian(Arrays.copyOf(arr1, (arr1.length/2)-1), Arrays.copyOfRange(arr2, (arr2.length/2)-1,arr2.length));
		}else{
			if(arr1.length%2!=0)
				// Recursively process left and right subtrees
				return findMedian(Arrays.copyOf(arr1, arr1.length/2), Arrays.copyOfRange(arr2, arr2.length/2,arr2.length));
			return findMedian(Arrays.copyOf(arr2, (arr2.length/2)-1), Arrays.copyOfRange(arr1, (arr1.length/2)-1,arr1.length));
		}
	}






}