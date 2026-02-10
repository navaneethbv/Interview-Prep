package LeetCodePerformancePractice;

import java.util.Arrays;

/**
 * Implementation of Maximum Product Sub Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximumProductSubArray {
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
	 * Performs maxProduct operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int maxProduct(int[] nums) {
		// Check for null/base case
		if(nums==null||nums.length==0)
			return 0;
		int min[]=new int[nums.length];
		int max[]=new int[nums.length];
		min[0]=nums[0];
		max[0]=nums[0];
		int result=max[0];
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]>0)
			{
				max[i]=Math.max(nums[i], max[i-1]*nums[i]);
				min[i]=Math.min(nums[i], min[i-1]*nums[i]);
			}
			else{
				max[i]=Math.max(nums[i], min[i-1]*nums[i]);
				min[i]=Math.min(nums[i], max[i-1]*nums[i]);
			}
			result=Math.max(result, max[i]);
		}
		System.out.println(Arrays.toString(max));
		System.out.println(Arrays.toString(min));

		return result;
	}
}
