package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/find-k-such-that-all-elements-in-kth-row-are-0-and-kth-column-are-1-in-a-boolean-matrix/
 */
/**
 * Implementation of Boolean Matrix Find K algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BooleanMatrixFindK {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int mat[][] = {{0, 0, 1, 1, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1}};
		//printMatrix(mat);
		System.out.println(findK(mat));
	}

	/**
	 * Finds k in the data structure.
	 *
	 * @param mat the array to process
	 * @return the computed integer result
	 */
	private static int findK(int[][] mat) {
		int noOfRows=mat.length;
		int noOfCols=mat[0].length;
		int i=0,j=noOfCols-1;
		int res=-1;
		while(i<noOfRows && noOfCols>-1)
		{
			// Check for null/base case
			if(mat[i][j]==0)
			{
				
				 while (j >= 0 && (mat[i][j] == 0 || i == j))
		                j--;
		 
		            if (j == -1)
		            {
		                res = i;
		                break;
		            }
		            else i++;
			}
			else{
				while (i<noOfRows && (mat[i][j] == 1 || i == j))
	                i++;
	            if (i == noOfRows)
	            {
	                res = j;
	                break;
	            }
	            else j--;
			}			
		}
		
		if (res == -1)
		       return res;
		 
		for (int k = 0; k < noOfRows; k++) {
			// Check for null/base case
			if((mat[k][res]==0 && k!=res))
				return -1;
		}
		for (int k = 0; k < noOfCols; k++) {
			if((mat[res][k]==1 && k!=res))
				return -1;
		}		
		return res;
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
