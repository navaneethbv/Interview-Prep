package GeeksforGeeksPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * Link : http://www.geeksforgeeks.org/find-the-largest-rectangle-of-1s-with-swapping-of-columns-allowed/
 */
/**
 * Implementation of Find Largest Rectangle algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindLargestRectangle {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int mat[][] = { {0, 1, 0, 1, 0},
				{0, 1, 0, 1, 1},
				{1, 1, 0, 1, 0}
		};
		findMaxRectangle(mat);

	}

	/**
	 * Finds max rectangle in the data structure.
	 *
	 * @param mat the array to process
	 * @return the computed integer result
	 */
	private static int findMaxRectangle(int[][] mat) {
		int hist[][]=new int[mat.length][mat[0].length];
		int cols=mat[0].length;
		int rows=mat.length;

		for (int i = 0; i < cols; i++) {
			hist[0][i]=mat[0][i];
			for (int j = 1; j < rows; j++) {
				hist[j][i] = (mat[j][i]==0)? 0: hist[j-1][i]+1;
			}
		}
		for (int i = 0; i < rows; i++) {
			Arrays.sort(hist[i]);
			StringBuilder sb=new StringBuilder(Arrays.toString(hist[i])).reverse();
		
			String str[]=sb.toString().replace("[","").replace("]","").split(",");
			// Inner loop to check combinations
			for (int j = 0; j < hist[0].length; j++) {
				hist[i][j]=Integer.parseInt(str[j].trim());
			}
		}
		
		int curr_area, max_area = 0;
	    for (int i=0; i<rows; i++)
	    {
	        for (int j=0; j<cols; j++)
	        {
	           curr_area = (j+1)*hist[i][j];
	            if (curr_area > max_area)
	                max_area = curr_area;
	        }
	    }
		printMatrix(hist);
	    return (max_area);
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
