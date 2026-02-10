package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Matrix Longest Path Matrix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixLongestPathMatrix {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int[][] mat=new int[][]{{1, 2, 9},
			{5, 3, 8},
			{4, 6, 7}};
			printMatrix(mat);
			System.out.println(findLongestIncreasing(mat));
			mat=new int[][]{{1, 2, 3},
				{6, 5, 4},
				{7, 8, 9}
			};
			printMatrix(mat);
			System.out.println(findLongestIncreasing(mat));
	}
	static boolean[][] visited;
	/**
	 * Finds longest increasing in the data structure.
	 *
	 * @param mat the array to process
	 * @return the computed integer result
	 */
	private static int findLongestIncreasing(int[][] mat) {
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				visited=new boolean[mat.length][mat[0].length];
				int val=getMaxCount(mat,i,j,visited);
				count=Math.max(count, val);
			}
		}
		return count+1;
	}

	/**
	 * Retrieves max count from the data structure.
	 *
	 * @param mat the array to process
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param visited the array to process
	 * @return the computed integer result
	 */
	private static int getMaxCount(int[][] mat, int i, int j, boolean[][] visited) {
		if(i<0||i>=mat.length||j<0||j>=mat[0].length||visited[i][j])
			return 0;
		// Check for null/base case
		if(i-1>=0 && mat[i-1][j]==mat[i][j]+1){
			visited[i][j]=true;
			// Recursively process left and right subtrees
			return 1+getMaxCount(mat, i-1, j, visited);
		}else if(i+1<mat.length && mat[i+1][j]==mat[i][j]+1){
			visited[i][j]=true;
			// Recursively process left and right subtrees
			return 1+getMaxCount(mat, i+1, j, visited);
		// Check for null/base case
		}else if(j-1>=0 && mat[i][j-1]==mat[i][j]+1){
			visited[i][j]=true;
			// Recursively process left and right subtrees
			return 1+getMaxCount(mat, i, j-1, visited);
		// Check for null/base case
		}else if(j+1<mat[0].length && mat[i][j+1]==mat[i][j]+1){
			visited[i][j]=true;
			// Recursively process left and right subtrees
			return 1+getMaxCount(mat, i, j+1, visited);
		}
		return 0;
	}

	/**
	 * Performs printMatrix operation.
	 *
	 * @param mat the array to process
	 */
	private static void printMatrix(int[][] mat) {
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}	
	}

}