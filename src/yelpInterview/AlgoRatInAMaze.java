package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Algo Rat In A Maze algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AlgoRatInAMaze {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int[][] matrix=new int[][]{{1, 0, 0, 0},
			{1, 1, 0, 1},
			{0, 1, 0, 0},
			{1, 1, 1, 1}};
			System.out.println(isPathPresent(matrix));
			for (int i = 0; i < matrix.length; i++) {
				System.out.println(Arrays.toString(visited[i]));
			}
	}
	static boolean visited[][];
	/**
	 * Checks if path present.
	 *
	 * @param matrix the array to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPathPresent(int[][] matrix) {
		visited=new boolean[matrix.length][matrix[0].length];
		// Recursively process left and right subtrees
		return isPathPresentUtil(matrix,0,0);
	}
	/**
	 * Checks if path present util.
	 *
	 * @param matrix the array to process
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPathPresentUtil(int[][] matrix, int i, int j) {
		// Check for null/base case
		if(i<0||i>matrix.length-1||j<0||j>matrix[0].length||visited[i][j]||matrix[i][j]==0)
			return false;
		// Check for null/base case
		if(i==matrix.length-1 && j==matrix[0].length-1){
			visited[i][j]=true;
			return true;
		}
		visited[i][j]=true;
		// Recursively process left and right subtrees
		return isPathPresentUtil(matrix, i+1, j)|| isPathPresentUtil(matrix, i, j+1);
	}



}

