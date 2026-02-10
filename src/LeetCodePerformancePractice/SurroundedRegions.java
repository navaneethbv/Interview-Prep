package LeetCodePerformancePractice;

/**
 * Implementation of Surrounded Regions algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SurroundedRegions {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
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
	public void solve(char[][] board) {
		// Check for null/base case
		if(board==null||board.length==0)
			return;
		//right and left border
		// Iterate through all elements
		for (int i = 0; i < board.length; i++) {
			// Check for null/base case
			if(board[i][0]=='O')
				mergeboard(board,i,0);
			// Check for null/base case
			if(board[i][board[0].length-1]=='O')
				mergeboard(board,i,board[0].length-1);
		}
		// Iterate through all elements
		for (int i = 0; i < board[0].length; i++) {
			// Check for null/base case
			if(board[0][i]=='O')
				mergeboard(board,0,i);
			if(board[board.length-1][i]=='O')
				mergeboard(board,board.length-1,i);
		}

		// Iterate through all elements
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j]=='O')
					board[i][j]='X';
				else if(board[i][j]=='#')
					board[i][j]='O';
			}
		}
	}
	/**
	 * Performs mergeboard operation.
	 *
	 * @param board the array to process
	 * @param i the i parameter
	 * @param j the j parameter
	 */
	private void mergeboard(char[][] board, int i, int j) {
		if(i<0||j<0||i>board.length-1||j>board[0].length-1||board[i][j]!='O')
			return;
		board[i][j]='#';
		mergeboard(board, i+1, j);
		mergeboard(board, i-1, j);
		mergeboard(board, i, j+1);
		mergeboard(board, i, j-1);
	}
}
