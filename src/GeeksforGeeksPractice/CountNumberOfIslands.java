package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/count-number-islands-every-island-separated-line/
 */
/**
 * Implementation of Count Number Of Islands algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountNumberOfIslands {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		char mat[][] =  {{'O', 'O', 'O'},
				{'X', 'X', 'O'},
				{'X', 'X', 'O'},
				{'O', 'O', 'X'},
				{'O', 'O', 'X'},
				{'X', 'X', 'O'}
		};
		printMatrix(mat);
		System.out.println();
		System.out.println(countNoOfIslands(mat));
	}



	/**
	 * Counts the number of no of islands.
	 *
	 * @param mat the array to process
	 * @return the computed integer result
	 */
	private static int countNoOfIslands(char[][] mat) {
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if(mat[i][j]=='X')
					// Check for null/base case
					if((i==0||mat[i-1][j]=='O')&& (j==0||mat[i][j-1]=='O'))
						count++;
			}
		}
		return count;
	}



	/**
	 * Performs printMatrix operation.
	 *
	 * @param s the array to process
	 */
	private static void printMatrix(char[][] s) {
		// Iterate through all elements
		for (int i = 0; i < s.length; i++) {
			System.out.println(Arrays.toString(s[i]));
		}

	}


}
