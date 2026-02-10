package LeetCodePractice;

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
		int value=1;
		int [][]outputMatrix=new int[n][n];
		int left=0,right=n-1,top=0,bottom=n-1;
		while(left<=right && top<=bottom)
		{
			//toprrow
			for (int i = left; i <=right; i++) {
				outputMatrix[top][i]=value;
				value++;
			}
			top++;

			//rightcol
			for (int i = top; i <=bottom; i++) {
				outputMatrix[i][right]=value;
				value++;
			}
			right--;

			//bottomrow
			if(left<right){
				for (int i = right; i >=left; i--) {
					outputMatrix[bottom][i]=value;
					value++;
				}
				bottom--;
			}

			//leftcol
			if(top<bottom){
				for (int i = bottom; i >=top; i--) {
					outputMatrix[i][left]=value;
					value++;
				}
				left++;
			}
		}

		return outputMatrix;
	}
}

