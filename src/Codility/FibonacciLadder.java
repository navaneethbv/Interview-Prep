package Codility;

import java.util.Arrays;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/ladder
 */

/**
 * Implementation of Fibonacci Ladder algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FibonacciLadder {
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
	 * Performs solution operation.
	 *
	 * @param A the array to process
	 * @param B the array to process
	 * @return the resulting array
	 */
	public static int[] solution(int[] A, int[] B){
		// Iterate through all elements
		for (int i = 0; i < B.length; i++) {
			A[i]=(int) (fibo(A[i])%Math.pow(2,B[i]));//use fibo for long
		}
		return A;
	}
	/**
	 * Performs fibo operation.
	 *
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int fibo(int i) {
		// Check for null/base case
		if(i==1||i==0)
			return 1;
		else
			// Recursively process left and right subtrees
			return fibo(i-1)+fibo(i-2);
	}

}