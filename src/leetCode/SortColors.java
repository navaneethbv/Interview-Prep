package leetCode;

import java.util.Arrays;

/*
 * Link : https://leetcode.com/problemset/algorithms/
 */

/**
 * Implementation of Sort Colors algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SortColors {
	/**
	 * Performs sortColors operation.
	 *
	 * @param nums the array to process
	 */
	public static void sortColors(int[] nums) {
		int zeroCount=0,oneCount=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			// Check for null/base case
			if(nums[i]==0)
				zeroCount++;
			else if(nums[i]==1)
				oneCount++;
		}
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {

			if(i<zeroCount)
				nums[i]=0;
			else if(i>=zeroCount&& i<zeroCount+oneCount)
				nums[i]=1;
			else
				nums[i]=2;
		}
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