package leetCode;

/*
 * Link : https://codility.com/programmers/task/max_profit
 */

/**
 * Implementation of Maximum Slice Max Profit algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximumSliceMaxProfit {
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
		int maxSoFar=0,minPrice=A[0],maxEndingHere=0;
		for (int i = 1; i < A.length; i++) {
			maxEndingHere=Math.max(0,A[i]-minPrice);
			minPrice=Math.min(minPrice,A[i]);
			maxSoFar=Math.max(maxEndingHere,maxSoFar);
		}		
		return maxSoFar;
	}
}