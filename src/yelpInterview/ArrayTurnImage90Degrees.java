package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Turn Image90 Degrees algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayTurnImage90Degrees {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		char [][]inputArray=new char[][]{{'*','*','*','^','*','*','*'},
			{'*','*','*','|','*','*','*'},
			{'*','*','*','|','*','*','*'},
			{'*','*','*','|','*','*','*'}};
			print(inputArray);
			inputArray=rotate(inputArray);
			print(inputArray);
	}

	/**
	 * Rotates the .
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static char[][] rotate(char[][] inputArray) {
		char[][] outputArray=new char[inputArray[0].length][inputArray.length];
		for (int row = 0; row < inputArray.length; row++) {
			for (int col = 0; col < inputArray[0].length; col++) {
				outputArray[col][outputArray[0].length-row-1]=inputArray[row][col];
			}
		}
		
		
		return outputArray;
	}

	/**
	 * Performs print operation.
	 *
	 * @param inputArray the array to process
	 */
	private static void print(char[][] inputArray) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(Arrays.toString(inputArray[i]));
		}
	}




}