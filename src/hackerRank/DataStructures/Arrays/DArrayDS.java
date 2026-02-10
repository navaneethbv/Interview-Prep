package hackerRank.DataStructures.Arrays;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/2d-array
 */


/**
 * Implementation of D Array DS algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DArrayDS {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int inputArray[][]=new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				inputArray[i][j]=scanner.nextInt();
			}
		}
		int max=Integer.MIN_VALUE;
		for (int i = 0;i<4;i++) {
			for (int j = 0; j < 4; j++) {
				int score=checkScore(i,j,inputArray);
				if(score>max)
					max=score;
			}
		}
		System.out.println(max);
	}

	/**
	 * Performs checkScore operation.
	 *
	 * @param i the i parameter
	 * @param j the j parameter
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int checkScore(int i,int j,int[][] inputArray) {
		return inputArray[i][j]+inputArray[i][j+1]+inputArray[i][j+2]+
				inputArray[i+2][j]+inputArray[i+2][j+1]+inputArray[i+2][j+2]
						+inputArray[i+1][j+1];
	}
}
