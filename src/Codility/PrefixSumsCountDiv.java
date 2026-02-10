package Codility;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/count_div
 */

/**
 * Implementation of Prefix Sums Count Div algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrefixSumsCountDiv {

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
	 * @param A the A parameter
	 * @param B the B parameter
	 * @param K the K value
	 * @return the computed integer result
	 */
	public static int solution(int A, int B, int K){
		int count=0;
		// Check for null/base case
		if(A%K==0)
			count=1;
		return (B-A)/K+count;
	}
}