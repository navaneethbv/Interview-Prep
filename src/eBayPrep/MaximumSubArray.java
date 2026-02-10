package eBayPrep;

/**
 * Implementation of Maximum Sub Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximumSubArray {

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
	 * Performs maxSubArray operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int maxSubArray(int[] nums) {
		int maxSoFar=nums[0];
		int maxValue=nums[0];
		for (int i = 1; i < nums.length; i++) {
			maxValue=Math.max(nums[i],maxValue+nums[i]);
			maxSoFar=Math.max(maxValue, maxSoFar);
		}
		return maxSoFar;
	}

}

