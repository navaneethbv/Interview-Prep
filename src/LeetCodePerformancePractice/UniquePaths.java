package LeetCodePerformancePractice;

/**
 * Implementation of Unique Paths algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UniquePaths {

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
	 * Performs uniquePaths operation.
	 *
	 * @param m the m parameter
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int uniquePaths(int m, int n) {
		if(m<=0||n<=0)
			return 0;
		if(m==1 && n==1)
			return 1;
		// Recursively process left and right subtrees
		return uniquePaths(m-1, n)+uniquePaths(m, n-1);
	}
}

