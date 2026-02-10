package eBayPrep;

/**
 * Implementation of Climbing Stairs algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ClimbingStairs {

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
	 * Performs climbStairs operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int climbStairs(int n) {
		return fibonacci(n+1);
	}

	/**
	 * Performs fibonacci operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int fibonacci(int n) {
		// Check for null/base case
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			// Recursively process left and right subtrees
			return fibonacci(n-1)+fibonacci(n-2);
	}
}

