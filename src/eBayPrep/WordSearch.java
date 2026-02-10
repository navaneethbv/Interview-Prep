package eBayPrep;

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
		System.out.println(exist(new char[][]{	
			{'A','B','C','E'},
			{'S','F','C','S'},
			{'A','D','E','E'}},"ABCCED"));
		System.out.println(exist(new char[][]{	
			{'A','B','C','E'},
			{'S','F','C','S'},
			{'A','D','E','E'}},"SEE"));
		System.out.println(exist(new char[][]{
			{'A','B','C','E'},
			{'S','F','C','S'},
			{'A','D','E','E'}},"ABCB"));
		System.out.println(exist(new char[][]{
			{'A','A'}},"AA"));
		System.out.println(exist(new char[][]{
			{'A','B','C','E'},
			{'S','F','E','S'},
			{'A','D','E','E'}},"ABCESEEEFS"));
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
				// Check for null/base case
				if(board[i][j]==word.charAt(0))
				{
					if(wordExists(i,j,board,word,0))
						return true;
				}
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
	 * @param word the word parameter
	 * @param stringIndex the stringIndex parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean wordExists(int i, int j, char[][] board, String word,int stringIndex) {

		if(i<0||j<0||i>board.length-1||j>board[0].length-1||stringIndex>=word.length()
				||word.charAt(stringIndex)!=board[i][j])
		{
			return false;
		}
		if(word.charAt(stringIndex)==board[i][j] && stringIndex==word.length()-1)
			return true;
		char temp=board[i][j];
		board[i][j]='#';
		if (wordExists(i+1, j, board, word,stringIndex+1)||wordExists(i-1, j, board, word,stringIndex+1)
				||wordExists(i, j+1, board, word,stringIndex+1)||wordExists(i, j-1, board, word,stringIndex+1))
			return true;
		board[i][j]=temp;
		return false;
	}

}

