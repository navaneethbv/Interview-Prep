package leetCode;

/*
 * Link : https://codility.com/programmers/task/max_slice_sum
 * Kadane's Algorithm 
 */

/**
 * Implementation of Maximum Slice Max Slice Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximumSliceMaxSliceSum {
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
		int maxSoFar=A[0],maxEndingHere=A[0];
		for (int i = 1; i < A.length; i++) {
			maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
	        maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}		
		return maxSoFar;
	}
}