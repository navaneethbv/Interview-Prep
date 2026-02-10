package yelpInterview;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Implementation of Matrix Print Unique Rows algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixPrintUniqueRows {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int mat[][] = {{0, 1, 0, 0, 1},
					   {1, 0, 1, 1, 0},
					   {0, 1, 0, 0, 1},
					   {1, 0, 1, 0, 0}
		};
		printUniqueRows(mat);
	}

	/**
	 * Performs printUniqueRows operation.
	 *
	 * @param mat the array to process
	 */
	private static void printUniqueRows(int[][] mat) {
		HashSet<String> str=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			StringBuilder sb=new StringBuilder();
			// Inner loop to check combinations
			for (int j = 0; j < mat[0].length; j++) {
				sb.append(mat[i][j]);
			}
			
			if(!str.contains(sb.toString())){
				System.out.println(Arrays.toString(mat[i]));
				str.add(sb.toString());
			}
		}
	}





}