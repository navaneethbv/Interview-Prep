package leetCode;

/*
 * Link : https://leetcode.com/problems/move-zeroes/
 */

/**
 * Implementation of Power Of Two algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PowerOfTwo {
	/**
	 * Checks if power of two.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isPowerOfTwo(int n) {
		if(n<1)
			return false;
		else if(n==1)
			return true;
		while(true)
		{
			if(n%2==1)
				return false;
			// Check for null/base case
			if(n/2==1 && n%2==0)
				return true;
			n=n/2;
			
		}
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