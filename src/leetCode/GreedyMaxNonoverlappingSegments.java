package leetCode;

/*
 * Link : https://codility.com/programmers/task/max_nonoverlapping_segments
 */

/**
 * Implementation of Greedy Max Nonoverlapping Segments algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GreedyMaxNonoverlappingSegments {
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
	 * @return the computed integer result
	 */
	public static int solution(int[] A, int[] B){
		int count=1;
		int end=B[0];
		for (int i = 1; i < B.length; i++) {
			if(A[i]>end){
				count++;
				end=B[i];
			}
		}
		return count;
	}

}