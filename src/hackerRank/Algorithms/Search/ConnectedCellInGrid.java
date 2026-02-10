package hackerRank.Algorithms.Search;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/connected-cell-in-a-grid
 */
/**
 * Implementation of Connected Cell In Grid algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ConnectedCellInGrid {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int m=Integer.parseInt(scanner.nextLine());
		int n=Integer.parseInt(scanner.nextLine());
		int inputArray[][]=new int[m][n];
		boolean visited[][]=new boolean[m][n];

		for (int i = 0; i < m; i++) {
			Arrays.fill(visited[i], false);
			for (int j = 0; j < n; j++) {
				inputArray[i][j]=scanner.nextInt();
			}
		}
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(inputArray[i][j]==1)
					max=Math.max(max, getMaxGridCount(inputArray,visited,i,j,0));
			}
		}
		System.out.println(max);
		//printArray(inputArray);
	}

	/**
	 * Retrieves max grid count from the data structure.
	 *
	 * @param inputArray the array to process
	 * @param visited[][] the visited[][] parameter
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param c the c parameter
	 * @return the computed integer result
	 */
	private static int getMaxGridCount(int[][] inputArray,boolean visited[][],int i,int j,int c) {
		if(i>=inputArray.length||j>=inputArray[0].length||i<0||j<0)
			return 0;
		// Check for null/base case
		if(inputArray[i][j]==0 ||visited[i][j]==true)
			return 0;
		visited[i][j]=true;
		// Recursively process left and right subtrees
		return 1+getMaxGridCount(inputArray, visited, i-1, j, c)
		+getMaxGridCount(inputArray, visited, i+1, j, c)
		+getMaxGridCount(inputArray, visited, i, j-1, c)
		+getMaxGridCount(inputArray, visited, i, j+1, c)
		+getMaxGridCount(inputArray, visited, i-1, j-1, c)
		+getMaxGridCount(inputArray, visited, i-1, j+1, c)
		+getMaxGridCount(inputArray, visited, i+1, j-1, c)
		+getMaxGridCount(inputArray, visited, i+1, j+1, c);
	}

	/**
	 * Performs printArray operation.
	 *
	 * @param inputArray the array to process
	 */
	private static void printArray(int[][] inputArray) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(Arrays.toString(inputArray[i]));
		}
	}

}
