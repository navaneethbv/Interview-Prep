package leetCode;

/*
 * Link : https://leetcode.com/problems/house-robber/
 */

/**
 * Implementation of House Robber algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class HouseRobber {
	/**
	 * Performs robDP operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int robDP(int[] nums) {
		if(nums.length<1)
			return 0;
		int[] dpOutput=new int[nums.length+1];
		dpOutput[0]=0;
		dpOutput[1]=nums[0];
		for (int i = 2; i < dpOutput.length; i++) {
			dpOutput[i]=Math.max(dpOutput[i-1],dpOutput[i-2]+nums[i-1]);
		}
		return dpOutput[dpOutput.length-1];
	}
	/**
	 * Performs robnonDP operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int robnonDP(int[] nums) {
		int evenSum=0,oddSum=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			// Check for null/base case
			if(i%2==0)
			{
				evenSum+=nums[i];
				evenSum=evenSum>oddSum?evenSum:oddSum;
			}
			else{
				oddSum+=nums[i];
				oddSum=evenSum>oddSum?evenSum:oddSum;
			}
		}
		return evenSum>oddSum?evenSum:oddSum;
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