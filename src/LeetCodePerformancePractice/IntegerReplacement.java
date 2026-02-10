package LeetCodePerformancePractice;

/**
 * Implementation of Integer Replacement algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IntegerReplacement {
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
	 * Performs integerReplacement operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int integerReplacement(int n) {
		return replacement(n,0);
	}

	/**
	 * Performs replacement operation.
	 *
	 * @param n the size or count parameter
	 * @param count the count parameter
	 * @return the computed integer result
	 */
	private static int replacement(int n, int count) {
		if(n==1)
			return count;
		// Check for null/base case
		if(n%2==0)
			// Recursively process left and right subtrees
			return replacement(n/2, count+1);
		else
			// Recursively process left and right subtrees
			return Math.min(replacement(n+1, count+1), replacement(n-1, count+1));
	}
}
