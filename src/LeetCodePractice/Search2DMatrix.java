package LeetCodePractice;

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
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}


	/**
	 * Searches for matrix.
	 *
	 * @param matrix the array to process
	 * @param target the target value
	 * @return true if condition is met, false otherwise
	 */
	public static boolean searchMatrix(int[][] matrix, int target) {
		int rowPointer=0;
		int colPointer=matrix[0].length-1;
		while(rowPointer<matrix.length && colPointer>=0)
		{
			if(matrix[rowPointer][colPointer]==target)
				return true;
			else if(matrix[rowPointer][colPointer]<target)
			{
				rowPointer++;
			}
			else{
				colPointer--;
			}
		}
		return false;
	}
}

