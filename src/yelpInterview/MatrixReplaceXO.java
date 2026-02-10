package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Matrix Replace XO algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixReplaceXO {
	static char[][] mat;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		mat=new char[][]{{'X', 'O', 'X', 'X', 'X', 'X'},
			{'X', 'O', 'X', 'X', 'O', 'X'},
			{'X', 'X', 'X', 'O', 'O', 'X'},
			{'O', 'X', 'X', 'X', 'X', 'X'},
			{'X', 'X', 'X', 'O', 'X', 'O'},
			{'O', 'O', 'X', 'O', 'O', 'O'},
		};
		printMatrix(mat);
		mat=(replaceMatrix(mat));
		printMatrix(mat);
	}

	/**
	 * Performs replaceMatrix operation.
	 *
	 * @param mat the array to process
	 * @return the resulting array
	 */
	private static char[][] replaceMatrix(char[][] mat) {
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j]=='O')
					mat[i][j]='-';
			}
		}


		//first row
		// Iterate through all elements
		for (int i = 0; i < mat[0].length; i++) {
			// Check for null/base case
			if(mat[0][i]=='-')
				floodUtil(0,i,'-','O');
		}

		//first column
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			// Check for null/base case
			if(mat[i][0]=='-')
				floodUtil(i,0,'-','O');
		}

		//last row
		// Iterate through all elements
		for (int i = 0; i < mat[0].length; i++) {
			if(mat[mat.length-1][i]=='-')
				floodUtil(mat.length-1,i,'-','O');
		}

		//last column
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			// Check for null/base case
			if(mat[i][mat[0].length-1]=='-')
				floodUtil(i,mat[0].length-1,'-','O');
		}

		for (int i=0; i<mat.length; i++)
			for (int j=0; j<mat[0].length; j++)
				if (mat[i][j] == '-')
					mat[i][j] = 'X';
		return mat;
	}

	/**
	 * Performs floodUtil operation.
	 *
	 * @param x the x parameter
	 * @param y the y parameter
	 * @param prevV the prevV parameter
	 * @param newV the newV parameter
	 */
	private static void floodUtil(int x, int y, char prevV, char newV) {
		if (x < 0 || x >= mat.length || y < 0 || y >= mat[0].length)
			return;
		if (mat[x][y] != prevV)
			return;

		mat[x][y] = newV;

		floodUtil(x+1, y, prevV, newV);
		floodUtil(x-1, y, prevV, newV);
		floodUtil(x, y+1, prevV, newV);
		floodUtil(x, y-1, prevV, newV);

	}

	/**
	 * Performs printMatrix operation.
	 *
	 * @param mat the array to process
	 */
	private static void printMatrix(char[][] mat) {
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}	
		System.out.println();
	}





}