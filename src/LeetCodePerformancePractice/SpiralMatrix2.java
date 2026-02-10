package LeetCodePerformancePractice;

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
		int[][] outputMatrix=new int[n][n];
		int top=0,left=0,right=n-1,bottom=n-1;
		int count=1;
		while(top<=bottom && left<=right)
		{
			for (int i = left; i <=right; i++) {
				outputMatrix[top][i]=count;
				count++;
			}
			top++;
			for (int i = top; i <=bottom; i++) {
				outputMatrix[i][right]=count;
				count++;
			}
			right--;
			if(top>bottom)
				continue;
			for (int i = right; i >=left; i--) {
				outputMatrix[bottom][i]=count;
				count++;
			}
			bottom--;
			if(left>right)
				continue;
			for (int i = bottom; i >=top; i--) {
				outputMatrix[i][left]=count;
				count++;
			}	
			left++;
		}
		return outputMatrix;
	}
}

