package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link: http://www.geeksforgeeks.org/find-the-longest-path-in-a-matrix-with-given-constraints/
 */
/**
 * Implementation of Longest Path Problem DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LongestPathProblemDP {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds max length in the data structure.
	 *
	 * @param cost the array to process
	 * @return the computed integer result
	 */
	private static int findMaxLength(int[][] cost) {
		int maxValue=1;
		int[][] dp= new int[cost.length][cost[0].length];
		// Iterate through all elements
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i],-1);
		}
		// Iterate through all elements
		for (int i = 0; i < cost.length; i++) {
			for (int j = 0; j < cost[0].length; j++) {
				if(dp[i][j]==-1)
					findLongestFromThisCell(i,j,cost,dp);
				maxValue=Math.max(maxValue, dp[i][j]);
			}
		}
		return maxValue;
	}

	/**
	 * Finds longest from this cell in the data structure.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param cost the array to process
	 * @param dp the array to process
	 * @return the computed integer result
	 */
	private static int findLongestFromThisCell(int i, int j, int[][] cost, int[][] dp) {
		if(i<0 || i>cost.length-1||j<0||j>cost[0].length-1)
			return 0;
		if(dp[i][j]!=-1)
			return dp[i][j];
		if ((cost[i][j] +1) == cost[i][j+1])
			// Recursively process left and right subtrees
			return dp[i][j] = 1 + findLongestFromThisCell(i,j+1,cost,dp);
		if (cost[i][j] +1 == cost[i][j-1])
			// Recursively process left and right subtrees
			return dp[i][j] = 1 + findLongestFromThisCell(i,j-1,cost,dp);
		if (cost[i][j] +1 == cost[i-1][j])
			// Recursively process left and right subtrees
			return dp[i][j] = 1 + findLongestFromThisCell(i-1,j,cost,dp);
		if (cost[i][j] +1 == cost[i+1][j])
			// Recursively process left and right subtrees
			return dp[i][j] = 1 + findLongestFromThisCell(i+1,j,cost,dp);
		return dp[i][j] = 1;
	}

}
