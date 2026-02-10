package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/given-matrix-o-x-replace-o-x-surrounded-x/
 */
/**
 * Implementation of Flood Fill Algorithm algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FloodFillAlgorithm {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int screen[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 0, 0},
				{1, 0, 0, 1, 1, 0, 1, 1},
				{1, 2, 2, 2, 2, 0, 1, 0},
				{1, 1, 1, 2, 2, 0, 1, 0},
				{1, 1, 1, 2, 2, 2, 2, 0},
				{1, 1, 1, 1, 1, 2, 1, 1},
				{1, 1, 1, 1, 1, 2, 2, 1},
		};
		int x = 4, y = 4, newC = 3;
		System.out.println("Input");
		printMatrix(screen);
		floodFill(screen, x, y, newC);
		System.out.println("Output");
		printMatrix(screen);
	}



	/**
	 * Performs floodFill operation.
	 *
	 * @param screen the array to process
	 * @param x the x parameter
	 * @param y the y parameter
	 * @param newC the newC parameter
	 */
	private static void floodFill(int[][] screen, int x, int y, int newC) {
		int prevC=screen[x][y];
		floodFillUtil(screen, x, y, prevC, newC);

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
	private static void floodFillUtil(int[][] screen, int x, int y,int prevC, int newC) {
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
	private static void printMatrix(int[][] s) {
		// Iterate through all elements
		for (int i = 0; i < s.length; i++) {
			System.out.println(Arrays.toString(s[i]));
		}

	}


}
