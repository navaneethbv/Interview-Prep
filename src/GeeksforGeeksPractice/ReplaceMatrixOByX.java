package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/flood-fill-algorithm-implement-fill-paint/
 */
/**
 * Implementation of Replace Matrix O By X algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReplaceMatrixOByX {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		char mat[][]={{'X', 'O', 'X', 'X', 'X', 'X'},
				{'X', 'O', 'X', 'X', 'O', 'X'},
				{'X', 'X', 'X', 'O', 'O', 'X'},
				{'O', 'X', 'X', 'X', 'X', 'X'},
				{'X', 'X', 'X', 'O', 'X', 'O'},
				{'O', 'O', 'X', 'O', 'O', 'O'},
		};
		System.out.println("Input");
		printMatrix(mat);
		mat=replaceMatrix(mat);//replace O by X if surrounded 
		System.out.println("Output");
		printMatrix(mat);
	}

	/**
	 * Performs replaceMatrix operation.
	 *
	 * @param mat the array to process
	 * @return the resulting array
	 */
	private static char[][] replaceMatrix(char[][] mat) {
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if(mat[i][j]=='O')
					mat[i][j]='-';		
			}
		}

		int rows=mat.length;
		int cols=mat[0].length;
		// Iterate through all elements
		for (int i = 0; i < mat[0].length; i++) {//top row
			// Check for null/base case
			if(mat[0][i]=='-')
				floodFillUtil(mat, 0, i, '-', 'O');
		}
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {//right column
			if(mat[i][cols-1]=='-')
				floodFillUtil(mat, i, cols-1, '-', 'O');
		}
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {//bottom row
			if(mat[rows-1][i]=='-')
				floodFillUtil(mat, rows-1, i, '-', 'O');
		}
		// Iterate through all elements
		for (int i = 0; i < mat[0].length; i++) {//left column
			// Check for null/base case
			if(mat[i][0]=='-')
				floodFillUtil(mat, i, 0, '-', 'O');
		}
		
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if(mat[i][j]=='-')
					mat[i][j]='X';
			}
		}
		return mat;
	}
	/**
	 * Performs floodFillUtil operation.
	 *
	 * @param screen the array to process
	 * @param x the x parameter
	 * @param y the y parameter
	 * @param prevC the prevC parameter
	 * @param newC the newC parameter
	 */
	private static void floodFillUtil(char[][] screen, int x, int y,char prevC, char newC) {
		int rows=screen.length;
		int cols=screen[0].length;
		if(x>-1 && x<rows && y>-1 && y<cols)
		{
			if(screen[x][y]==prevC)
				screen[x][y]=newC;
			else
				return;
			floodFillUtil(screen,x+1,y,prevC,newC);
			floodFillUtil(screen,x-1,y,prevC,newC);
			floodFillUtil(screen,x,y+1,prevC,newC);
			floodFillUtil(screen,x,y-1,prevC,newC);
		}

	}

	/**
	 * Performs printMatrix operation.
	 *
	 * @param s the array to process
	 */
	private static void printMatrix(char[][] s) {
		// Iterate through all elements
		for (int i = 0; i < s.length; i++) {
			System.out.println(Arrays.toString(s[i]));
		}

	}

}
