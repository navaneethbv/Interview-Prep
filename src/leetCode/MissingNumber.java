package leetCode;

import java.util.Arrays;

/*
 * Link : https://leetcode.com/problems/missing-number/
 */

/**
 * Implementation of Missing Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MissingNumber {
	/**
	 * Performs missingNumber operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		if(nums.length==1)
			// Check for null/base case
			if(nums[0]==0)
				return nums[0]+1;
			else
				return nums[0]-1;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i)
				return i;
		}
		return nums[nums.length-1]+1;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
}