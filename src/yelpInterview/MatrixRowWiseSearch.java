package yelpInterview;

/**
 * Implementation of Matrix Row Wise Search algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixRowWiseSearch {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int mat[][] = { {10, 20, 30, 40},
				{15, 25, 35, 45},
				{27, 29, 37, 48},
				{32, 33, 39, 50},
		};
		System.out.println(search(mat, 29));
	}

	/**
	 * Searches for .
	 *
	 * @param mat the array to process
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	private static boolean search(int[][] mat, int value) {
		int row=0,col=mat[0].length-1;
		while(row<mat.length && col>=0)
		{
			if(mat[row][col]==value)
			{
				return true;
			}else if(mat[row][col]>value)
			{
				col--;
			}else{
				row++;
			}
		}
		return false;
	}



}