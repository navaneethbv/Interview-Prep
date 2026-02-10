package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/minimum-positive-points-to-reach-destination/
 */
/**
 * Implementation of Minimum Initial Points algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MinimumInitialPoints {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int mat[][] = { {-2,-3,3},
				{-5,-10,1},
				{10,30,-5}
		};
		System.out.println(findMinimumInitialPoints(mat));

	}



	/**
	 * Finds minimum initial points in the data structure.
	 *
	 * @param mat the array to process
	 * @return the computed integer result
	 */
	private static int findMinimumInitialPoints(int[][] mat) {
		int dp[][]=new int[mat.length][mat[0].length];
	    int m = mat.length, n = mat[0].length;
	    // Base case
	    dp[m-1][n-1] = mat[m-1][n-1] > 0? 1:
	                   Math.abs(mat[m-1][n-1]) + 1;
	 
	    for (int i = m-2; i >= 0; i--)
	         dp[i][n-1] = Math.max(dp[i+1][n-1] - mat[i][n-1], 1);
	    for (int j = n-2; j >= 0; j--)
	         dp[m-1][j] = Math.max(dp[m-1][j+1] - mat[m-1][j], 1);
	 
	    // fill the table in bottom-up fashion
	    for (int i=m-2; i>=0; i--)
	    {
	        for (int j=n-2; j>=0; j--)
	        {
	            int min_points_on_exit = Math.min(dp[i+1][j], dp[i][j+1]);
	            dp[i][j] = Math.max(min_points_on_exit - mat[i][j], 1);
	        }
	     }
	     return dp[0][0];
	}



	/**
	 * Performs printMatrix operation.
	 *
	 * @param s the array to process
	 */
	private static void printMatrix(int[][] s) {
		// Iterate through all elements
		for (int i = 0; i < s.length; i++) {
			System.out.println(Arrays.toString(s[i]));
		}

	}


}
