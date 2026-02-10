package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Matrix Collect Max Points Using Traversals algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixCollectMaxPointsUsingTraversals {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int mat[][]={{3, 6, 8, 2},
				{5, 2, 4, 3},
				{1, 1, 20, 10},
		};
		printMatrix(mat);
		System.out.println(collectMaxPoints(mat));

	}
	static boolean visited[][];

	/**
	 * Performs collectMaxPoints operation.
	 *
	 * @param mat the array to process
	 * @return the computed integer result
	 */
	private static int collectMaxPoints(int[][] mat) {
		visited=new boolean[mat.length][mat[0].length];
		int startScore=maxStartPoints(mat,0,0);
		System.out.println(startScore);
		visited=new boolean[mat.length][mat[0].length];
		int endScore=maxEndPoints(mat,0,mat[0].length-1);
		System.out.println(endScore);
		return startScore+endScore;
	}

	/**
	 * Performs maxStartPoints operation.
	 *
	 * @param mat the array to process
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return the computed integer result
	 */
	private static int maxStartPoints(int[][] mat, int i, int j) {
		if(i<0||i>mat.length-1||j<0||j>mat[0].length-1||visited[i][j])
			return 0;
		// Check for null/base case
		if(i==mat.length-1 && j==0)
			return mat[i][j];
		visited[i][j]=true;
		// Recursively process left and right subtrees
		return mat[i][j]+Math.max(maxStartPoints(mat, i+1, j), Math.max(maxStartPoints(mat, i+1, j-1),maxStartPoints(mat, i+1, j+1)));
	}

	/**
	 * Performs maxEndPoints operation.
	 *
	 * @param mat the array to process
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return the computed integer result
	 */
	private static int maxEndPoints(int[][] mat, int i, int j) {
		if(i<0||i>mat.length-1||j<0||j>mat[0].length-1||visited[i][j])
			return 0;
		// Check for null/base case
		if(i==mat.length-1 && j==mat[0].length-1)
			return mat[i][j];
		visited[i][j]=true;
		// Recursively process left and right subtrees
		return mat[i][j]+Math.max(maxEndPoints(mat, i+1, j), Math.max(maxEndPoints(mat, i+1, j-1),maxEndPoints(mat, i+1, j+1)));
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
		System.out.println();
	}

}