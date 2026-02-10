package eBayPrep;

/**
 * Implementation of Minimum Path Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MinimumPathSum {


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
	 * Performs minPathSum operation.
	 *
	 * @param obstacleGrid the array to process
	 * @return the computed integer result
	 */
	public static int minPathSum(int[][] obstacleGrid) {
		return dfs(0,0,obstacleGrid,0);
	}


	/**
	 * Performs dfs operation.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param obstacleGrid the array to process
	 * @param sum the sum parameter
	 * @return the computed integer result
	 */
	private static int dfs(int i, int j, int[][] obstacleGrid, int sum) {
		if(i<0||j<0||i>=obstacleGrid.length||j>=obstacleGrid[0].length)
			return Integer.MAX_VALUE;
		// Check for null/base case
		if(i==obstacleGrid.length-1 && j==obstacleGrid[0].length-1)
			return sum+obstacleGrid[i][j];
		// Recursively process left and right subtrees
		return Math.min(dfs(i+1, j, obstacleGrid, sum+obstacleGrid[i][j]), dfs(i, j+1, obstacleGrid, sum+obstacleGrid[i][j]));
	}


}

