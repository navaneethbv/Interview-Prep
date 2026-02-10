package hackerRank.Algorithms.Implementation;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/matrix-rotation-algo
 */
/**
 * Implementation of Matrix Rotation algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixRotation {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int M=scanner.nextInt();
		int N=scanner.nextInt();
		int R=scanner.nextInt();
		int inputArray[][]=new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				inputArray[i][j]=scanner.nextInt();
			}
		}
		inputArray=rotateMatrix(inputArray,R);
		printMatrix(inputArray);
	}

	/**
	 * Rotates the matrix.
	 *
	 * @param inputArray the array to process
	 * @param R the R parameter
	 * @return the resulting array
	 */
	private static int[][] rotateMatrix(int[][] inputArray,int R) {
		int topRow=0,bottomRow=inputArray.length-1,leftCol=0,rightCol=inputArray[0].length-1;
		while(topRow<=bottomRow && leftCol<=rightCol)
		{
			//move top row from right to left
			int count=(bottomRow-topRow+1)*(rightCol-leftCol+1)-1;
				count=R%count;
			if(!(R>inputArray.length * inputArray[0].length))
				count=R;
			for(int j=0;j<count;j++){
				int t=0;
				int tempValue=inputArray[topRow][leftCol];
				for (int i = leftCol; i <rightCol; i++) {
					inputArray[topRow][i]=inputArray[topRow][i+1];
				}

				//move left col from bottom to top
				for (int i = topRow+1; i <=bottomRow; i++) {
					t=inputArray[i][leftCol];
					inputArray[i][leftCol]=tempValue;
					tempValue=t;
				}
				//move bottom row from left to right
				for (int i = leftCol+1; i <=rightCol; i++) {
					t=inputArray[bottomRow][i];
					inputArray[bottomRow][i]=tempValue;
					tempValue=t;
				}

				//move right col from bottom to top
				for (int i = bottomRow-1; i >=topRow; i--) {
					t=inputArray[i][rightCol];
					inputArray[i][rightCol]=tempValue;
					tempValue=t;
				}
			}
			topRow++;bottomRow--;leftCol++;rightCol--;
		}	
		return inputArray;
	}

	/**
	 * Performs printMatrix operation.
	 *
	 * @param inputArray the array to process
	 */
	private static void printMatrix(int[][] inputArray) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(Arrays.toString(inputArray[i]).replaceAll(",","").replace("[","").replace("]",""));
		}

	}
}
