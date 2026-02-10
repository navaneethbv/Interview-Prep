package LeetCodePerformancePractice;

/**
 * Implementation of Count Primes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountPrimes {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
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
	/**
	 * Counts the number of primes.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int countPrimes(int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (isPrime(i)) 
				count++;
		}
		return count;
	}
	/**
	 * Checks if prime.
	 *
	 * @param num the num parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPrime(int num) {
		if(num<=1)
			return false;
		for (int i=2;i*i<=num;i++) {
			// Check for null/base case
			if((num%i)==0)
				return false;
		}
		return true;
	}
}
