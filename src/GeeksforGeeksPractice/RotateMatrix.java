package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/rotate-matrix-elements/
 */
/**
 * Implementation of Rotate Matrix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RotateMatrix {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int a[][] = { {1,  2,  3,  4},
				{5,  6,  7,  8},
				{9,  10, 11, 12},
				{13, 14, 15, 16}  };
		
		rotatematrix(a);
		printMatrix(a);
		a = new int[][]{{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		//rotatematrix(a);
	}


	/**
	 * Rotates the .
	 *
	 * @param mat the array to process
	 */
	private static void rotatematrix(int[][] mat) {
		
		//similar to spiral matrix print but store the elements
		int m=mat.length,n=mat[0].length;
		int row = 0, col = 0;
	    int prev, curr;
		 while (row < m && col < n)
		    {
		 
		        if (row + 1 == m || col + 1 == n)
		            break;
		        prev = mat[row + 1][col];
		 
		        for (int i = col; i < n; i++)
		        {
		            curr = mat[row][i];
		            mat[row][i] = prev;
		            prev = curr;
		        }
		        row++;
		        for (int i = row; i < m; i++)
		        {
		            curr = mat[i][n-1];
		            mat[i][n-1] = prev;
		            prev = curr;
		        }
		        n--;
		        if (row < m)
		        {
		            for (int i = n-1; i >= col; i--)
		            {
		                curr = mat[m-1][i];
		                mat[m-1][i] = prev;
		                prev = curr;
		            }
		        }
		        m--;
		        if (col < n)
		        {
		            for (int i = m-1; i >= row; i--)
		            {
		                curr = mat[i][col];
		                mat[i][col] = prev;
		                prev = curr;
		            }
		        }
		        col++;
		    }
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
