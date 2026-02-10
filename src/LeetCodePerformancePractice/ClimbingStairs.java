package LeetCodePerformancePractice;

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
		if(n<=1)
			return 1;
		return fibo(n);
	}
	/**
	 * Performs fibo operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int fibo(int n) {
		int[] fib=new int[n+1];
		fib[0]=1;
		fib[1]=1;
		for (int i = 2; i < fib.length; i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		return fib[n];
	}

}

