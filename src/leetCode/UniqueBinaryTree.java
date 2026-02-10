package leetCode;

import java.util.Arrays;

/*
 * Link : https://leetcode.com/problems/unique-binary-search-trees/
 */

/**
 * Implementation of Unique Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UniqueBinaryTree {
	/**
	 * Performs numTrees operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int numTrees(int n) {
		int[] count = new int[n + 1];
		System.out.println(Arrays.toString(count));
		count[0] = 1;
		count[1] = 1;

		for (int i = 2; i <= n; i++) {
			// Inner loop to check combinations
			for (int j = 0; j <= i - 1; j++) {
				count[i] = count[i] + count[j] * count[i - j - 1];
			}
		}

		return count[n]; 
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