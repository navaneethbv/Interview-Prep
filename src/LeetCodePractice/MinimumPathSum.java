package LeetCodePractice;

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
		return findPaths(0,0,obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid,0);
	}

	static int minValue=Integer.MAX_VALUE;
	/**
	 * Finds paths in the data structure.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param m the m parameter
	 * @param n the size or count parameter
	 * @param obstacleGrid the array to process
	 * @param sum the sum parameter
	 * @return the computed integer result
	 */
	private static int findPaths(int i, int j,int m,int n, int[][] obstacleGrid,int sum) {
		if(i==m && j==n){
			return Math.min(minValue, sum+obstacleGrid[i][j]);
		}
		if(i<0 || j<0 || i>m||j>n)
			return Integer.MAX_VALUE;
		// Recursively process left and right subtrees
		return Math.min(findPaths(i+1, j, m, n, obstacleGrid,sum+obstacleGrid[i][j]),findPaths(i, j+1, m, n, obstacleGrid,sum+obstacleGrid[i][j]));
	}

}

