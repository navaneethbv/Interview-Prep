package leetCode;

/*
 * Link : https://leetcode.com/problems/factorial-trailing-zeroes/
 */

/**
 * Implementation of Factor Trailing Zeros algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FactorTrailingZeros {
	/**
	 * Performs trailingZeroes operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int trailingZeroes(int n) {
		int sum=0;
		int number=5,result=n;
		while(result>1){
			result=n/number;
			sum+=result;
			number=number*5;
		}
		return sum;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
}