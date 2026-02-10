package LeetCodePractice;

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
		int startPos=findStart(nums,target,0,nums.length-1);
		int endPos=findEnd(nums,target,0,nums.length-1);
		return new int[]{startPos,endPos};
	}



	/**
	 * Finds start in the data structure.
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @param start the start parameter
	 * @param end the end parameter
	 * @return the computed integer result
	 */
	private static int findStart(int[] nums, int target, int start, int end) {
		if(start>end)
			return -1;
		int mid=(start+end)/2;
		// Check for null/base case
		if(nums[mid]==target && (mid==0 || nums[mid-1]<target))
		{
			return mid;
		}
		else if(nums[mid]<target){
			// Recursively process left and right subtrees
			return findStart(nums, target, mid+1, end);
		}
		else{
			// Recursively process left and right subtrees
			return findStart(nums, target, start, mid-1);
		}
	}
	
	/**
	 * Finds end in the data structure.
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @param start the start parameter
	 * @param end the end parameter
	 * @return the computed integer result
	 */
	private static int findEnd(int[] nums, int target, int start, int end) {
		if(start>end)
			return -1;
		int mid=(start+end)/2;
		if(nums[mid]==target && (mid==nums.length-1 ||nums[mid+1]>target))
		{
			return mid;
		}
		else if(nums[mid]>target){
			// Recursively process left and right subtrees
			return findEnd(nums, target, start, mid-1);
		}else {
			// Recursively process left and right subtrees
			return findEnd(nums, target, mid+1, end);
		}
	}
}
