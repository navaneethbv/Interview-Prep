package eBayPrep;

import java.util.Arrays;

/**
 * Implementation of Maximal Square algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximalSquare{
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(maximalSquare(new char[][]{
			{'1','0','1','0','0'},
			{'1','0','1','1','1'},
			{'1','1','1','1','1'},
			{'1','0','0','1','0'}}));
		System.out.println(maximalSquare(new char[][]{
			{'0', '1', '1', '0', '1'}, 
			{'1', '1', '0', '1', '0'}, 
			{'0', '1', '1', '1', '0'},
			{'1', '1', '1', '1', '0'},
			{'1', '1', '1', '1', '1'},
			{'0', '0', '0', '0', '0'}}));
		System.out.println(maximalSquare(new char[][]{
			{'0', '1'}, 
			{'1', '0'}}));

	}
	/**
	 * Performs maximalSquare operation.
	 *
	 * @param s the array to process
	 * @return the computed integer result
	 */
	public static int maximalSquare(char[][] s) {
		// Check for null/base case
		if(s==null||s.length==0)
			return 0;
		int[][] m=new int[s.length][s[0].length];
		// Iterate through all elements
		for (int i = 0; i < m[0].length; i++) {
			m[0][i]=Integer.parseInt(s[0][i]+"");
		}
		// Iterate through all elements
		for (int i = 0; i < m.length; i++) {
			m[i][0]=Integer.parseInt(s[i][0]+"");
		}
		int max=0;
		for (int i = 1; i < s.length; i++) {
			for (int j = 1; j <s[0].length; j++) {
				if(s[i][j]=='1'){
					m[i][j]=(
							Math.min(Integer.parseInt(m[i][j-1]+""), 
									Math.min(Integer.parseInt(m[i-1][j]+""),
											Integer.parseInt(m[i-1][j-1]+"")
											)
									)
							+1
							);
				}
				else
				{
					m[i][j]=0;
				}
			}
		}
		// Iterate through all elements
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				max=Math.max(m[i][j], max);
			}
		}
		return max*max;
	}
}

