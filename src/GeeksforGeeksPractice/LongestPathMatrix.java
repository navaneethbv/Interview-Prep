package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/find-the-longest-path-in-a-matrix-with-given-constraints/
 */
/**
 * Implementation of Longest Path Matrix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LongestPathMatrix {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds longest path in the data structure.
	 *
	 * @param mat the array to process
	 * @return the computed integer result
	 */
	private static int findLongestPath(int[][] mat) {
		int result=-1;
		printMatrix(mat);
		int dp[][]=new int[mat.length][mat[0].length];
		// Iterate through all elements
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i],-1);
		}
		// Iterate through all elements
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				if(dp[i][j]==-1)
					findLongestCell(i,j,mat,dp);		
				result=Math.max(result,dp[i][j]);
			}
		}
		return result;
	}

	/**
	 * Finds longest cell in the data structure.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param mat the array to process
	 * @param dp the array to process
	 * @return the computed integer result
	 */
	private static int findLongestCell(int i, int j, int[][] mat, int[][] dp) {
		int rows=mat.length,cols=mat[0].length;
		if(i<0||i>=rows||j<0||j>=cols)
			return 0;
		if(dp[i][j]!=-1)
			return dp[i][j];
		
		if((mat[i][j]+1)==mat[i][j+1])
			// Recursively process left and right subtrees
			return dp[i][j]=1+findLongestCell(i, j+1, mat, dp);
		
		if(mat[i][j]==(mat[i][j-1]+1))
			// Recursively process left and right subtrees
			return dp[i][j]=1+findLongestCell(i, j-1, mat, dp);
		if(mat[i][j]==(mat[i-1][j]+1))
			// Recursively process left and right subtrees
			return dp[i][j]=1+findLongestCell(i-1, j, mat, dp);
		
		if((mat[i][j]+1)==mat[i+1][j])
			// Recursively process left and right subtrees
			return dp[i][j]=1+findLongestCell(i+1, j, mat, dp);

		

		

		return dp[i][j]=1;
		
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
