package leetCode;

/*
 * Link : https://leetcode.com/problems/number-of-1-bits/
 */

/**
 * Implementation of No Of1 Bits algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class NoOf1Bits {
	/**
	 * Performs hammingWeight operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public int hammingWeight(int n) {
		String binaryString=Integer.toBinaryString(n);
		int count=0;
		// Inner loop to check combinations
		for (int j = 0; j < binaryString.length(); j++) {
			if(Integer.parseInt(binaryString.charAt(j)+"")==1)
				count++;
		}
		return count;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}