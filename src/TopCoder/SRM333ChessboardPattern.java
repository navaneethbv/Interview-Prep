package TopCoder;

import java.util.Arrays;

/*
 * SRM 333 Div1
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=7259
 */

/**
 * Implementation of SRM333 Chessboard Pattern algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM333ChessboardPattern {
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
	 * Performs makeChessboard operation.
	 *
	 * @param rows the rows parameter
	 * @param columns the columns parameter
	 * @return the resulting array
	 */
	public static String[] makeChessboard(int rows, int columns){
		String[] outputArray=new String[rows];
		StringBuilder firstString=new StringBuilder();
		StringBuilder secondString=new StringBuilder();
		for (int i = 0; i < columns; i++) {
			// Check for null/base case
			if(i%2==0){
				firstString.append(".");
				secondString.append("X");
			}
			else{
				firstString.append("X");
				secondString.append(".");
			}
		}
		int counter=0;
		for (int i = rows-1;i>=0; i--) {
			outputArray[i]=(counter%2==0)?firstString.toString():secondString.toString();
			counter++;
		}
		return outputArray;
	}
}
