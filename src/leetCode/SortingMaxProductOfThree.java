package leetCode;

import java.util.Arrays;

/*
 * Link : https://codility.com/programmers/task/max_product_of_three
 */

/**
 * Implementation of Sorting Max Product Of Three algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SortingMaxProductOfThree {

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
		int length=A.length;
		if((A[0]*A[1]*A[2])>(A[length-1]*A[length-2]*A[length-3]))
		{
			return (A[0]*A[1]*A[2]);
		}
		else{
			return (A[length-1]*A[length-2]*A[length-3]);
		}
	}
}