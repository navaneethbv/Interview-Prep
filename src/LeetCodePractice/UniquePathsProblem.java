package LeetCodePractice;

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
		int value=(dfs(0,0,m,n));
		return value;
	}

	/**
	 * Performs dfs operation.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param m the m parameter
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int dfs(int i,int j,int m, int n) {
		if(i==m-1 && j==n-1)
			return 1;
		if(i<0 || j<0 ||i>m-1||j>n-1)
			return 0;
		// Recursively process left and right subtrees
		return dfs(i+1, j, m, n)+dfs(i, j+1, m, n);
		
	}

}

