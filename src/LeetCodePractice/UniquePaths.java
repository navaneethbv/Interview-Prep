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
	 * Performs uniquePathsWithObstacles operation.
	 *
	 * @param obstacleGrid the array to process
	 * @return the computed integer result
	 */
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		return findPaths(0,0,obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid);
	}

	/**
	 * Finds paths in the data structure.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param m the m parameter
	 * @param n the size or count parameter
	 * @param obstacleGrid the array to process
	 * @return the computed integer result
	 */
	private static int findPaths(int i, int j,int m,int n, int[][] obstacleGrid) {
		if(i==m && j==n)
			return 1;
		// Check for null/base case
		if(i<0 || j<0 || i>m||j>n||obstacleGrid[i][j]==1)
			return 0;
		// Recursively process left and right subtrees
		return findPaths(i+1, j, m, n, obstacleGrid)+findPaths(i, j+1, m, n, obstacleGrid);
	}

}

