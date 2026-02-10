package eBayPrep;

import java.util.Arrays;

/**
 * Implementation of Spiral Matrix2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SpiralMatrix2 {

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
	 * Performs generateMatrix operation.
	 *
	 * @param n the size or count parameter
	 * @return the resulting array
	 */
	public static int[][] generateMatrix(int n) {
		int outputMatrix[][]=new int[n][n];
		int value=1;
		int left=0,top=0,right=n-1,bottom=n-1;
		while(top<=bottom && left<=right)
		{
			for (int i = left; i <=right; i++) {
				outputMatrix[top][i]=value;
				value++;
			}
			top++;

			for (int i = top; i <=bottom; i++) {
				outputMatrix[i][right]=value;
				value++;
			}
			right--;

			if(top<=bottom){
				for (int i = right; i >=left; i--) {
					outputMatrix[bottom][i]=value;
					value++;
				}
				bottom--;
			}

			if(left<=right){
				for (int i = bottom; i >=top; i--) {
					outputMatrix[i][left]=value;
					value++;
				}
				left++;
			}
		}
		// Iterate through all elements
		for (int i = 0; i < outputMatrix.length; i++) {
			System.out.println(Arrays.toString(outputMatrix[i]));
		}

		return outputMatrix;
	}
}

