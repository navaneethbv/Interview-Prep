package GeeksforGeeksPractice;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Link : http://www.geeksforgeeks.org/find-the-row-with-maximum-number-1s/
 */
/**
 * Implementation of Find Row Max Ones algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindRowMaxOnes {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int mat[][] = { {0, 0, 0, 1},
		        {0, 1, 1, 1},
		        {1, 1, 1, 1},
		        {0, 0, 0, 0}
		    };
		printMatrix(mat);
		System.out.println(findMaxRow(mat));
	}

	/**
	 * Finds max row in the data structure.
	 *
	 * @param mat the array to process
	 * @return the computed integer result
	 */
	private static int findMaxRow(int[][] mat) {
		int maxRow=-1,max=Integer.MIN_VALUE;
		
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				// Check for null/base case
				if(mat[i][j]==1 && ((mat[0].length-j)>max))
				{
					maxRow=i;
					max=mat[0].length-j;
					break;
				}
			}
		}
		return maxRow;
	}

	/**
	 * Performs printMatrix operation.
	 *
	 * @param s the array to process
	 */
	private static void printMatrix(int[][] s) {
		// Iterate through all elements
		for (int i = 0; i < s.length; i++) {
			System.out.println(Arrays.toString(s[i]));
		}

	}

}
