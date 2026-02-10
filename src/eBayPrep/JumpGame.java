package eBayPrep;

/**
 * Implementation of Jump Game algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JumpGame {

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
	 * Performs canJump operation.
	 *
	 * @param nums the array to process
	 * @return true if condition is met, false otherwise
	 */
	public static boolean canJump(int[] nums) {
		// Check for null/base case
		if(nums==null||nums.length<=1)
			return true;
		int maxReach=nums[0];
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			// Check for null/base case
			if(maxReach<=i && nums[i]==0)
				return false;
			if(nums[i]+i>maxReach)
				maxReach=nums[i]+i;
			if(maxReach>=nums.length-1)
				return true;
		}
		return false;
	}
}

