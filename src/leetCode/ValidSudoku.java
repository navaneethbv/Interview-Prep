package leetCode;

import java.util.HashMap;

/*
 * Link : https://leetcode.com/problems/valid-sudoku/
 */

/**
 * Implementation of Valid Sudoku algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ValidSudoku {
	/**
	 * Checks if valid sudoku.
	 *
	 * @param board the array to process
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isValidSudoku(char[][] board) {
		HashMap<Character, Integer> rowMap=new HashMap<>();
		HashMap<Integer, HashMap<Character, Integer>> columnMap=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < board[0].length; i++) {			
			rowMap=new HashMap<>();
			// Inner loop to check combinations
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]!='.'){
					if(rowMap.containsKey(board[i][j]))
						return false;
					else
						rowMap.put(board[i][j],1);				
					if(columnMap.containsKey(j))
					{
						if(columnMap.get(j).containsKey(board[i][j]))
							return false;
						else
							columnMap.get(j).put(board[i][j],1);
					}
					else{
						HashMap<Character,Integer> tempMap=new HashMap<>();
						tempMap.put(board[i][j],1);
						columnMap.put(j,tempMap);
					}
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			rowMap=new HashMap<>();
			for (int j = i / 3 * 3; j < i / 3 * 3 + 3; j++) {
				for (int k = i % 3 * 3; k < i % 3 * 3 + 3; k++) {
					if(board[j][k]!='.'){
						if(rowMap.containsKey(board[j][k])){
							System.out.println(i+"/"+j+"/"+k);
							return false;
						}
						else
							rowMap.put(board[j][k],1);
					}
				}
			}
		}
		return true;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		char sudokuArray[][]=new char[][]
				{
			{'5','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'},
				};


				/*for (int i = 0; i < sudokuArray.length; i++) {
					System.out.println(Arrays.toString(sudokuArray[i]));
				}*/
				System.out.println(isValidSudoku(sudokuArray));


	}
}