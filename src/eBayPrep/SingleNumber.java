package eBayPrep;

/**
 * Implementation of Single Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SingleNumber {
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
	 * Performs singleNumber operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int singleNumber(int[] nums) {
		if(nums.length==1)
			return nums[0];
		int output=nums[0];
		for (int i = 1; i < nums.length; i++) {
			output^=nums[i];
		}
		return output;
	}
}

