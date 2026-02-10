package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Matrix Create Matrix Alternate Chars algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixCreateMatrixAlternateChars {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int mat[][]=createMatrix(5,6);
		printMatrix(mat);
		System.out.println("*******");
		mat=createMatrix(4,4);
		printMatrix(mat);
		System.out.println("*******");
		mat=createMatrix(3,4);
		printMatrix(mat);
	}

	/**
	 * Performs createMatrix operation.
	 *
	 * @param rows the rows parameter
	 * @param cols the cols parameter
	 * @return the resulting array
	 */
	private static int[][] createMatrix(int rows, int cols) {
		int[][] mat=new int[rows][cols];
		int rowStart=0,rowEnd=rows,colStart=0,colEnd=cols;
		int value=1;
		while(rowStart<rowEnd && colStart<colEnd)
		{
			//start row
			for (int i = colStart; i < colEnd; i++) {
				mat[rowStart][i]=value;
			}
			rowStart++;

			//end column
			for (int i = rowStart; i < rowEnd; i++) {
				mat[i][colEnd-1]=value;
			}
			colEnd--;

			//end row
			if(rowStart<rowEnd)
			{
				for (int i = colEnd-1; i>=colStart; i--) {
					mat[rowEnd-1][i]=value;
				}
				rowEnd--;
			}

			//start column
			if(colStart<colEnd)
			{
				for (int i = rowEnd-1; i>=rowStart; i--) {
					mat[i][colStart]=value;
				}
				colStart++;
			}
			value=value==1?0:1;
		}
		return mat;
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