package eBayPrep;

import java.util.Arrays;

/**
 * Implementation of Search For Range algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SearchForRange {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

	/**
	 * Searches for range.
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @return the resulting array
	 */
	public static int[] searchRange(int[] nums, int target) {
		int startPosition=findStart(nums,0,nums.length-1,target);
		int endPosition=findEnd(nums,0,nums.length-1,target);
		return new int[]{startPosition,endPosition};
	}

	/**
	 * Finds start in the data structure.
	 *
	 * @param arr the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @param target the target value
	 * @return the computed integer result
	 */
	private static int findStart(int[] arr, int low, int high, int target) {
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		// Check for null/base case
		if((arr[mid]==target)&&(mid==0 || arr[mid-1]!=target))
			return mid;
		else if(arr[mid]<target)
		{
			// Recursively process left and right subtrees
			return findStart(arr, mid+1, high, target);
		}
		else		
			// Recursively process left and right subtrees
			return findStart(arr, low, mid-1, target);
	}

	/**
	 * Finds end in the data structure.
	 *
	 * @param arr the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @param target the target value
	 * @return the computed integer result
	 */
	private static int findEnd(int[] arr, int low, int high, int target) {
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if((arr[mid]==target)&&(mid==arr.length-1 || arr[mid+1]!=target))
			return mid;
		else if(arr[mid]>target)
		{		
			// Recursively process left and right subtrees
			return findEnd(arr, low, mid-1, target);
		}
		else
			// Recursively process left and right subtrees
			return findEnd(arr, mid+1, high, target);
	}

}
