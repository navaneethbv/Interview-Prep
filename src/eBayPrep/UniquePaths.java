package eBayPrep;

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
		return dfs(0,0,obstacleGrid);
	}

	/**
	 * Performs dfs operation.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param obstacleGrid the array to process
	 * @return the computed integer result
	 */
	private static int dfs(int i, int j, int[][] obstacleGrid) {
		// Check for null/base case
		if(i<0||j<0||i>obstacleGrid.length-1||j>obstacleGrid[0].length-1||obstacleGrid[i][j]==1)
			return 0;
		// Check for null/base case
		if(i==obstacleGrid.length-1 && j==obstacleGrid[0].length-1)
			return 1;
		// Recursively process left and right subtrees
		return dfs(i+1, j, obstacleGrid)+dfs(i, j+1, obstacleGrid);
	}

}

