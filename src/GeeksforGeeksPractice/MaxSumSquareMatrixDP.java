package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link: http://www.geeksforgeeks.org/ugly-numbers/
 */
/**
 * Implementation of Max Sum Square Matrix DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaxSumSquareMatrixDP {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int mat[][] =  {{0, 1, 1, 0, 1}, 
                {1, 1, 0, 1, 0}, 
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};
		findMaxSubMatrix(mat);
	}

	/**
	 * Finds max sub matrix in the data structure.
	 *
	 * @param mat the array to process
	 */
	private static void findMaxSubMatrix(int[][] mat) {
		int s[][]=new int[mat.length][mat[0].length];
		
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				// Check for null/base case
				if(i==0||j==0)
					s[i][j]=mat[i][j];
				else if(mat[i][j]==1)
				{
					s[i][j]=Math.min(s[i-1][j],Math.min(s[i-1][j-1], s[i][j-1]))+1;					
				}
				else
					s[i][j]=0;
			}
		}
		
		int max_i=0,max_j=0,maxSum=0;
		// Iterate through all elements
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[0].length; j++) {
				if(s[i][j]>maxSum)
				{
					maxSum=s[i][j];
					max_i=i;
					max_j=j;
				}
			}
		}
		
		
		
		for (int i = max_i; i >max_i-maxSum; i--) {
			for (int j = max_j; j >max_j-maxSum; j--) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

	



}
