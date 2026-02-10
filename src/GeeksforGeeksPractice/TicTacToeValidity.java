package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/validity-of-a-given-tic-tac-toe-board-configuration/
 */
/**
 * Implementation of Tic Tac Toe Validity algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TicTacToeValidity {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}
	static int winMatrix[][]=new int[][]{{0, 1, 2}, // Check first row.
		{3, 4, 5}, // Check second Row
		{6, 7, 8}, // Check third Row
		{0, 3, 6}, // Check first column
		{1, 4, 7}, // Check second Column
		{2, 5, 8}, // Check third Column
		{0, 4, 8}, // Check first Diagonal
		{2, 4, 6}};


		/**
		 * Performs checkValidity operation.
		 *
		 * @param board the array to process
		 * @return true if condition is met, false otherwise
		 */
		private static boolean checkValidity(char[] board) {
			//getXcount
			//getOcount
			boolean xWin=checkWin(board,'X');
			boolean oWin=checkWin(board,'O');
			int xCount=0,oCount=0;
			// Iterate through all elements
			for (int i = 0; i < board.length; i++) {
				if(board[i]=='X')
					xCount++;
				else if(board[i]=='O')
					oCount++;
			}

			if(xCount==oCount||xCount==oCount+1)
			{
				if(oWin)
				{
					if(xWin){
						return false;
					}
					if(xCount==oCount)
						return true;
					else
						return false;
				}
			}

			if(xWin && xCount!=oCount+1)
				return false;
			return true;
		}



		/**
		 * Performs checkWin operation.
		 *
		 * @param board the array to process
		 * @param c the c parameter
		 * @return true if condition is met, false otherwise
		 */
		private static boolean checkWin(char[] board, char c) {
			// Iterate through all elements
			for (int i = 0; i < winMatrix.length; i++) {
				// Check for null/base case
				if(board[winMatrix[i][0]]=='c'
						&& board[winMatrix[i][1]]=='c'
						&& board[winMatrix[i][2]]=='c')
					return true;
			}
			return false;

		}



		/**
		 * Performs printMatrix operation.
		 *
		 * @param s the array to process
		 */
		/*private static void printMatrix(int[][] s) {
			// Iterate through all elements
			for (int i = 0; i < s.length; i++) {
				System.out.println(Arrays.toString(s[i]));
			}

		}
*/

}
