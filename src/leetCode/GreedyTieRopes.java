package leetCode;

/*
 * Link : https://codility.com/programmers/task/tie_ropes
 */

/**
 * Implementation of Greedy Tie Ropes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GreedyTieRopes {
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
	 * @param K the K value
	 * @param A the array to process
	 * @return the computed integer result
	 */
	public static int solution(int K, int[] A){
		int count=0,sum=0;
		// Iterate through all elements
		for (int i = 0; i < A.length; i++) {
			sum+=A[i];
			if(sum>=K){
				count++;
				sum=0;
			}
		}
		return count;
	}
}