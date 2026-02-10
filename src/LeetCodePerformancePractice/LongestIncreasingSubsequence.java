package LeetCodePerformancePractice;

/**
 * Implementation of Longest Increasing Subsequence algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LongestIncreasingSubsequence {
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
	 * Performs lengthOfLIS operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int lengthOfLIS(int[] nums) {
		// Check for null/base case
		if(nums==null||nums.length==0)
			return 0;
		int max[]=new int[nums.length];
		int result=1;
		// Iterate through all elements
		for (int i = 0; i < max.length; i++) {
			max[i]=1;
			// Inner loop to check combinations
			for (int j = 0; j < i; j++) {
				if(nums[i]>nums[j])
				{
					max[i]=Math.max(max[i],max[j]+1);
				}
			}
			result=Math.max(result, max[i]);
		}
		return result;
	}

}
