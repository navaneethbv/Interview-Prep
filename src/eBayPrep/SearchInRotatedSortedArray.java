package eBayPrep;

import java.util.Arrays;

/**
 * Implementation of Search In Rotated Sorted Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SearchInRotatedSortedArray {

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
	 * Searches for .
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @return the computed integer result
	 */
	public static int search(int[] nums, int target) {
		// Recursively process left and right subtrees
		return searchIndex(nums,0,nums.length-1,target);
	}

	/**
	 * Searches for index.
	 *
	 * @param arr the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @param target the target value
	 * @return the computed integer result
	 */
	private static int searchIndex(int[] arr, int low, int high, int target) {
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(arr[mid]==target)
			return mid;
		if(arr[mid]>=arr[low]){
			if(target>=arr[low] && target<arr[mid]){
				// Recursively process left and right subtrees
				return searchIndex(arr, low,mid-1, target);
			}else{
				// Recursively process left and right subtrees
				return searchIndex(arr, mid+1, high, target);				
			}
		}		
		else
		{
			if(target>arr[mid] && target<=arr[high]){
				// Recursively process left and right subtrees
				return searchIndex(arr, mid+1, high, target);
			}else{
				// Recursively process left and right subtrees
				return searchIndex(arr, low, mid-1, target);				
			}
		}
	}
}
