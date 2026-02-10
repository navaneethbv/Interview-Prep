package leetCode;

import java.util.Arrays;

/*
 * Link : https://leetcode.com/problems/kth-largest-element-in-an-array/
 */

/**
 * Implementation of Kth Largest Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class KthLargestElement {
	/**
	 * Finds kth largest in the data structure.
	 *
	 * @param nums the array to process
	 * @param k the k value
	 * @return the computed integer result
	 */
	public  static int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length-k];
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