package eBayPrep;

/**
 * Implementation of Missing Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MissingNumber{
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
	 * Performs missingNumber operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int missingNumber(int[] nums) {
		int n=nums.length;
		int sum=(n*(n+1))/2;
		int arraySum=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			arraySum+=nums[i];
		}
		return (-arraySum+sum);

	}
}

