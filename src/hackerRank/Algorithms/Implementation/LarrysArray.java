package hackerRank.Algorithms.Implementation;

import java.util.Scanner;
/*
 * Link:https://www.hackerrank.com/challenges/larrys-array
 */
/**
 * Implementation of Larrys Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LarrysArray {
	static int[] inputArray;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int k=scanner.nextInt();
			inputArray=new int[k];
			for (int j = 0; j < k; j++) {
				inputArray[j]=scanner.nextInt();
			}
			System.out.println(checkSortArray(inputArray));
		}
		scanner.close();


	}

	/**
	 * Performs checkSortArray operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting string
	 */
	private static String checkSortArray(int[] inputArray) {
		// Iterate through all elements
		for (int i = 0; i <=inputArray.length-3; i++) {
			if(!sort(i))
				return "NO";
		}
		int length=inputArray.length-1;
		if(inputArray[length]!=length+1 || inputArray[length-1]!=length|| inputArray[length-2]!=length-1)
			return "NO";
		return "YES";
	}

	/**
	 * Performs sort operation.
	 *
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean sort(int i) {
		if(inputArray[i]==i+1)
			return true;
		else{
			rotateRight(i);
			if(inputArray[i]!=i+1){
				rotateLeft(i);
				return inputArray[i]==i+1;
			}
			else{
				return true;
			}
		}
	}

	/**
	 * Rotates the left.
	 *
	 * @param i the i parameter
	 */
	private static void rotateLeft(int i) {
		inputArray[i]=inputArray[i]^inputArray[i+1];
		inputArray[i+1]=inputArray[i]^inputArray[i+1];
		inputArray[i]=inputArray[i]^inputArray[i+1];
		inputArray[i]=inputArray[i]^inputArray[i+2];
		inputArray[i+2]=inputArray[i]^inputArray[i+2];
		inputArray[i]=inputArray[i]^inputArray[i+2];
	}

	/**
	 * Rotates the right.
	 *
	 * @param i the i parameter
	 */
	private static void rotateRight(int i) {
		inputArray[i]=inputArray[i]^inputArray[i+1];
		inputArray[i+1]=inputArray[i]^inputArray[i+1];
		inputArray[i]=inputArray[i]^inputArray[i+1];
		inputArray[i]=inputArray[i]^inputArray[i+2];
		inputArray[i+2]=inputArray[i]^inputArray[i+2];
		inputArray[i]=inputArray[i]^inputArray[i+2];
	}


}
