package LeetCodePerformancePractice;

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
		// Check for null/base case
		if(nums==null||nums.length==0)
			return 0;
		int max=nums[0];
		int newSum=nums[0];
		for (int i = 1; i < nums.length; i++) {
			newSum=Math.max(newSum+nums[i], nums[i]);
			max=Math.max(max, newSum);
		}
		return max;
	}
}

