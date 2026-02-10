package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Matrix Maximum Square Sub Matrix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixMaximumSquareSubMatrix {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int mat[][] = {{0, 1, 1, 0, 1}, 
				{1, 1, 0, 1, 0}, 
				{0, 1, 1, 1, 0},
				{1, 1, 1, 1, 0},
				{1, 1, 1, 1, 1},
				{0, 0, 0, 0, 0}};
		findMatSubMatrix(mat);
	}

	/**
	 * Finds mat sub matrix in the data structure.
	 *
	 * @param mat the array to process
	 */
	private static void findMatSubMatrix(int[][] mat) {
		int sum[][]=new int[mat.length][mat[0].length];
		// Iterate through all elements
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[0].length; j++) {
				// Check for null/base case
				if(i==0||j==0)
					sum[i][j]=mat[i][j];
				else
					if(mat[i][j]==1)
						sum[i][j]=Math.min(sum[i][j-1],Math.min(sum[i-1][j], sum[i-1][j-1]))+1;
					else
						sum[i][j]=0;
			}
		}
		printMatrix(sum);
		int maxVal=Integer.MIN_VALUE,xIndex=-1,yIndex=-1;
		// Iterate through all elements
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[0].length; j++) {
				if(sum[i][j]>maxVal){
					maxVal=sum[i][j];
					xIndex=i;
					yIndex=j;
				}
			}
		}
		for(int i = xIndex; i > xIndex - maxVal; i--)
		{
			for(int j = yIndex; j > yIndex - maxVal; j--)
			{
				System.out.print(mat[i][j]+" ");
			}  
			System.out.println();
		}  

	}

	/**
	 * Performs printMatrix operation.
	 *
	 * @param sum the array to process
	 */
	private static void printMatrix(int[][] sum) {
		// Iterate through all elements
		for (int i = 0; i < sum.length; i++) {
			System.out.println(Arrays.toString(sum[i]));
		}

	}


}