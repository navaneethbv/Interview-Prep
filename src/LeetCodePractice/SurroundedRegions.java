package LeetCodePractice;

import java.util.Arrays;

/**
 * Implementation of Surrounded Regions algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SurroundedRegions {

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
	 * Performs solve operation.
	 *
	 * @param board the array to process
	 */
	public static void solve(char[][] board) {
		for (int i = 1; i < board.length-1; i++) {
			for (int j = 1; j < board[0].length-1; j++) {
				if(board[i][j]=='O')
				{
					if(checkCell(board,i,j))
						board[i][j]='X';
				}
			}
		}
		
		// Iterate through all elements
		for (int i = 0; i < board.length; i++) {
			System.out.println(Arrays.toString(board[i]));
		}
	}
	/**
	 * Performs checkCell operation.
	 *
	 * @param board the array to process
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkCell(char[][] board, int i, int j) {
		if(i<0||i>board.length-1 || j<0 || j>board[0].length-1)
			return false;
		if(board[i][j]=='X'||(board[i-1][j]=='X' && board[i+1][j]=='X' && board[i][j-1]=='X'&& board[i][j+1]=='X'))
			return true;
		// Recursively process left and right subtrees
		return checkCell(board, i-1, j) && checkCell(board, i+1, j) &&checkCell(board, i, j-1) &&checkCell(board, i, j+1) ;
	}
}

