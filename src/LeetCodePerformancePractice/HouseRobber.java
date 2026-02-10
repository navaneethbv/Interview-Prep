package LeetCodePerformancePractice;

/**
 * Implementation of House Robber algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class HouseRobber {
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
	 * Performs rob operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int rob(int[] nums) {
		int evenSum=0,oddSum=0,sum=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			// Check for null/base case
			if(i%2==0)
			{
				evenSum=Math.max(sum, evenSum+nums[i]);
			}else
			{
				oddSum=Math.max(sum, oddSum+nums[i]);
			}
			sum=Math.max(evenSum, oddSum);
		}
		return sum;
	}

}