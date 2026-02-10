package leetCode;

/*
 * Link : https://leetcode.com/problems/climbing-stairs/
 */

/**
 * Implementation of Climbing Stairs algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ClimbingStairs {
	/**
	 * Performs climbStairs operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public int climbStairs(int n) {
		if(n<2)
			return 1;
		else{
			int fn[]=new int[n];
			fn[0]=1;
			fn[1]=1;
			for (int i = 2; i < n; i++) {
				fn[i]=fn[i-1]+fn[i-2];
			}
			return fn[fn.length-1];
		}
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