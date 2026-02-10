package LeetCodePractice;

/**
 * Implementation of Climbing Stairs algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ClimbingStairs {


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
	 * Performs climbStairs operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int climbStairs(int n) {
		return fibo(n);
	}


	/**
	 * Performs fibo operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int fibo(int n) {
		// Check for null/base case
		if(n==0)return 0;
		if(n==1)return 1;
		int[] fibArray=new int[n+2];
		fibArray[0]=1;
		fibArray[1]=1;
		for (int i = 2; i <=n; i++) {
			fibArray[i]=fibArray[i-1]+fibArray[i-2];
		}
		return fibArray[n];
	}
}

