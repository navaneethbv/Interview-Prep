package LeetCodePerformancePractice;

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
		System.out.println(searchMatrix(new int[][]{
			{1,   3,  5,  7},
			{10, 11, 16, 20},
			{23, 30, 34, 50}
		}, 31));

	}
	/**
	 * Searches for matrix.
	 *
	 * @param matrix the array to process
	 * @param target the target value
	 * @return true if condition is met, false otherwise
	 */
	public static boolean searchMatrix(int[][] matrix, int target) {
		int row=0,col=matrix[0].length-1;
		while(row<matrix.length && col>=0)
		{
			if(matrix[row][col]==target)
				return true;
			if(matrix[row][col]>target)
				col--;
			else
				row++;
		}
		return false;
	}

}
