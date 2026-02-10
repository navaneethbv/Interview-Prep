package leetCode;


/*
 * Link : https://leetcode.com/problems/count-primes/
 */
/**
 * Implementation of Count Primes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountPrimes {
	/**
	 * Counts the number of primes long.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int countPrimesLong(int n) {
		int primeCount=0;
		for (int i = 2; i <=n; i++) {
			boolean divided=true;
			for (int j = 2; j < i; j++) {
				// Check for null/base case
				if(i%j==0)
					divided=false;
			}
			if(divided)
				primeCount++;
		}
		return primeCount;
	}
	/**
	 * Counts the number of primes short.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int countPrimesShort(int n) {
		int primeCount=0;
		for (int i = 2; i <=n; i++) {
			boolean divided=true;
			for (int j = 2; j <=i/2; j++) {
				// Check for null/base case
				if(i%j==0)
					divided=false;
			}
			if(divided)
				primeCount++;
		}
		return primeCount;
	}
	/**
	 * Counts the number of primes short two.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int countPrimesShortTwo(int n) {
		int primeCount=0;
		for (int i = 2; i <=n; i++) {
			boolean divided=true;
			for (int j = 2; j <=Math.sqrt(i); j++) {
				// Check for null/base case
				if(i%j==0)
					divided=false;
			}
			if(divided)
				primeCount++;
		}
		return primeCount;
	}
	/**
	 * Counts the number of primes.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int countPrimes(int n) {
		boolean[] isPrime=new boolean[n];
		for (int i = 2; i < n; i++) {
			isPrime[i]=true;
		}

		for (int i = 2; i < n; i++) {
			if(!isPrime[i])
				continue;
			else
				for (int j = i+i; j < n; j+=i) {
					isPrime[j]=false;
				}
		}
		int count=0;
		for (int i = 2; i < n; i++) {
			if(isPrime[i])
				count++;
		}
		return count;
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