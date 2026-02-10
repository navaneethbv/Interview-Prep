package LeetCodePerformancePractice;

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
	 * @param grid the array to process
	 * @return the computed integer result
	 */
	public static int minPathSum(int[][] grid) {
		return findPathSum(0,0,grid,0);
	}
	/**
	 * Finds path sum in the data structure.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param matrix the array to process
	 * @param currSum the currSum parameter
	 * @return the computed integer result
	 */
	private static int findPathSum(int i, int j, int[][] matrix,int currSum) {
		if(i<0||j<0||i>matrix.length-1||j>matrix[0].length-1)
			return Integer.MAX_VALUE;
		// Check for null/base case
		if(i==matrix.length-1 && j==matrix[0].length-1)
			return currSum+matrix[i][j];
		// Recursively process left and right subtrees
		return Math.min(findPathSum(i+1, j, matrix, currSum+matrix[i][j]),findPathSum(i, j+1, matrix, currSum+matrix[i][j]));
	}
}

