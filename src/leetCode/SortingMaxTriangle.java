package leetCode;

import java.util.Arrays;

/*
 * Link : https://codility.com/programmers/task/triangle
 */

/**
 * Implementation of Sorting Max Triangle algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SortingMaxTriangle {

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
	 * @return the computed integer result
	 */
	public static int solution(int[] A){
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		// Iterate through all elements
		for (int i = 0; i < A.length-2; i++) {
			if(A[i]+A[i+1]>A[i+2]){
				System.out.println(i);
				return 1;
			}
		}
		return 0;
	}
}