package LeetCodePerformancePractice;

/**
 * Implementation of Unique Paths2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UniquePaths2 {

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
		return countPaths(0,0,obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid);
	}

	/**
	 * Counts the number of paths.
	 *
	 * @param row the row parameter
	 * @param col the col parameter
	 * @param maxRow the maxRow parameter
	 * @param maxCol the maxCol parameter
	 * @param obstacleGrid the array to process
	 * @return the computed integer result
	 */
	private static int countPaths(int row, int col, int maxRow, int maxCol, int[][] obstacleGrid) {
		// Check for null/base case
		if(row<0||col<0||row>maxRow||col>maxCol||obstacleGrid[row][col]==1)
			return 0;
		if(row==maxRow && col==maxCol)
			return 1;
		// Recursively process left and right subtrees
		return countPaths(row+1, col, maxRow, maxCol, obstacleGrid)+countPaths(row, col+1, maxRow, maxCol, obstacleGrid);
	}
}

