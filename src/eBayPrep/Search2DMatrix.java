package eBayPrep;

/**
 * Implementation of Search2 D Matrix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Search2DMatrix {


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Searches for matrix.
	 *
	 * @param matrix the array to process
	 * @param key the key value
	 * @return true if condition is met, false otherwise
	 */
	private static boolean searchMatrix(int[][] matrix, int key) {
		int rowPointer=0,colPointer=matrix[0].length-1;

		while(rowPointer<matrix.length && colPointer>=0)
		{
			if(matrix[rowPointer][colPointer]==key)
				return true;
			else if(matrix[rowPointer][colPointer]>key)
				colPointer--;
			else
				rowPointer++;	
		}
		return false;
	}



}

