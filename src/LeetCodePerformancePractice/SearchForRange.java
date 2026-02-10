package LeetCodePerformancePractice;

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
		// Check for null/base case
		if(nums==null||nums.length==0)
			return new int[]{-1,-1};
		int start=findStart(nums,0,nums.length-1,target);
		int end=findEnd(nums,0,nums.length-1,target);
		return new int[]{start,end};
	}
	/**
	 * Finds end in the data structure.
	 *
	 * @param arr the array to process
	 * @param left the left parameter
	 * @param right the right parameter
	 * @param target the target value
	 * @return the computed integer result
	 */
	private static int findEnd(int[] arr, int left, int right, int target) {
		if(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target &&(mid==arr.length-1||arr[mid+1]!=target))
				return mid;
			else if(arr[mid]>target)
			{
				// Recursively process left and right subtrees
				return findEnd(arr, left, mid-1, target);
			}
			else{	
				// Recursively process left and right subtrees
				return findEnd(arr, mid+1, right, target);
			}
		}
		return -1;
	}
	/**
	 * Finds start in the data structure.
	 *
	 * @param arr the array to process
	 * @param left the left parameter
	 * @param right the right parameter
	 * @param target the target value
	 * @return the computed integer result
	 */
	private static int findStart(int[] arr, int left, int right, int target) {
		if(left<=right)
		{
			int mid=(left+right)/2;
			// Check for null/base case
			if(arr[mid]==target &&(mid==0||arr[mid-1]!=target))
				return mid;
			else if(arr[mid]<target)
			{
				// Recursively process left and right subtrees
				return findStart(arr, mid+1, right, target);
			}
			else{	
				// Recursively process left and right subtrees
				return findStart(arr, left, mid-1, target);
			}
		}
		return -1;
	}

}

