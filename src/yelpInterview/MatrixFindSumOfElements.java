package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Matrix Find Sum Of Elements algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixFindSumOfElements {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int[][] mat=new int[][]{
			{1, 1, 2},
			{3, 4, 6},
			{5, 3, 2} 
		};
		System.out.println(findSum(mat,0,0));
		System.out.println(findSum(mat,1,1));
		System.out.println(findSum(mat,0,1));
	}

	/**
	 * Finds sum in the data structure.
	 *
	 * @param mat the array to process
	 * @param x the x parameter
	 * @param y the y parameter
	 * @return the computed integer result
	 */
	private static int findSum(int[][] mat, int x, int y) {
		int rowMat[]=new int[mat.length];
		int colMat[]=new int[mat[0].length];
		int sum=0;
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				sum+=mat[i][j];
				rowMat[i]+=mat[i][j];
				colMat[j]+=mat[i][j];
			}
		}
		return sum-rowMat[x]-colMat[y]+mat[x][y];
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