package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Matrix Modify Boolean Matrix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixModifyBooleanMatrix {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int mat[][] = { {1, 0, 0, 1},
					    {0, 0, 1, 0},
					    {0, 0, 0, 0},
		};	
		modifyMatrix(mat);
	}

	/**
	 * Performs modifyMatrix operation.
	 *
	 * @param mat the array to process
	 */
	private static void modifyMatrix(int[][] mat) {
		boolean rowFlag=false,colFlag=false;
		printMatrix(mat);
		// Iterate through all elements
		for (int i = 0; i < mat[0].length; i++) {
			// Check for null/base case
			if(mat[0][i]==1){
				rowFlag=true;
				break;
			}
		}
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			// Check for null/base case
			if(mat[i][0]==1){
				colFlag=true;
				break;
			}
		}

		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if(mat[i][j]==1)
				{
					mat[0][j]=1;
					mat[i][0]=1;
				}
			}
		}
		printMatrix(mat);
		
		for (int i = mat.length-1; i >=1;i--) {
			for (int j =  mat[0].length-1;j>=1; j--) {
				// Check for null/base case
				if(mat[0][j]==1||mat[i][0]==1)
					mat[i][j]=1;
			}
		}
		printMatrix(mat);
		
		if(rowFlag)
		{
			Arrays.fill(mat[0], 1);
		}
		if(colFlag)
		{
			// Inner loop to check combinations
			for (int j = 0; j < mat.length; j++) {
				mat[j][0]=1;
			}
		}
		printMatrix(mat);
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
		}System.out.println();

	}



}