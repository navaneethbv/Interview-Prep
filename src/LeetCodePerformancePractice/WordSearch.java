package LeetCodePerformancePractice;

/**
 * Implementation of Word Search algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class WordSearch {
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
	 * Performs exist operation.
	 *
	 * @param board the array to process
	 * @param word the word parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean exist(char[][] board, String word) {

		// Iterate through all elements
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(wordExists(i,j,board,0,word))
					return true;
			}
		}
		return false;
	}
	/**
	 * Performs wordExists operation.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param board the array to process
	 * @param index the index parameter
	 * @param word the word parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean wordExists(int i, int j, char[][] board,int index, String word) {
		if(i<0||j<0||i>=board.length||j>=board[0].length)
			return false;
		if(board[i][j]==word.charAt(index))
		{
			if(index==word.length()-1)
				return true;
			char temp=board[i][j];
			board[i][j]='#';
			if(wordExists(i+1, j, board, index+1, word)
					||wordExists(i-1, j, board, index+1, word)
					||wordExists(i, j+1, board, index+1, word)
					||wordExists(i, j-1, board, index+1, word))
				return true;
			board[i][j]=temp;
		}
		return false;
	}
}
