package eBayPrep;

import java.util.Arrays;

/**
 * Implementation of Set Matrix Zeroes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SetMatrixZeroes {


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}


	/**
	 * Sets zeroes in the data structure.
	 *
	 * @param matrix the array to process
	 */
	public static void setZeroes(int[][] matrix) {
		boolean fillFirstRow=false,fillFirstCol=false;
		// Iterate through all elements
		for (int i = 0; i < matrix.length; i++) {
			// Check for null/base case
			if(matrix[i][0]==0)
				fillFirstCol=true;
		}
		// Iterate through all elements
		for (int i = 0; i < matrix[0].length; i++) {
			// Check for null/base case
			if(matrix[0][i]==0)
				fillFirstRow=true;
		}
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				// Check for null/base case
				if(matrix[i][j]==0)
				{
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				// Check for null/base case
				if(matrix[i][0]==0 || matrix[0][j]==0)
				{
					matrix[i][j]=0;
				}
			}
		}
		if(fillFirstRow)
		{
			// Iterate through all elements
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[0][i]=0;
			}
		}
		if(fillFirstCol)
		{
			// Iterate through all elements
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0]=0;
			}
		}
		// Iterate through all elements
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}

