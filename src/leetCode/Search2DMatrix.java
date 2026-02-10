package leetCode;

/*
 * Link : https://leetcode.com/problems/search-a-2d-matrix/
 */

/**
 * Implementation of Search2 D Matrix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Search2DMatrix {
	/**
	 * Searches for matrix.
	 *
	 * @param matrix the array to process
	 * @param target the target value
	 * @return true if condition is met, false otherwise
	 */
	public static boolean searchMatrix(int[][] matrix, int target) {
		int rows=matrix.length;
		int cols=matrix[0].length;
		for (int i = 0; i < rows; i++) {
			if(matrix[i][cols-1]<target){
				continue;	
			}
			for (int j = cols-1; j >=0; j--) {
				if(matrix[i][j]==target)
					return true;
			}
			break;
		}
		return false;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int [][]matrix=new int[][]
				{{1,3,5,7},
					{10,11,16,20},
					{23,30,34,50}};
	System.out.println(searchMatrix(matrix, 3));
	}
}