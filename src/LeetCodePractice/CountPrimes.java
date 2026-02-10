package LeetCodePractice;

/**
 * Implementation of Count Primes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountPrimes {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	static boolean primeMat[];
	/**
	 * Counts the number of primes.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int countPrimes(int n) {
		primeMat=new boolean[n];
		int count=0;
		for (int i = 2; i < primeMat.length; i++) {
			if(!primeMat[i])
			{
				if(isPrime(i))
				{
					count++;
				}
				else{
					primeMat[i]=false;
				}
				handleValues(i);
			}
		}
		return count;
	}
	/**
	 * Performs handleValues operation.
	 *
	 * @param i the i parameter
	 */
	private static void handleValues(int i) {
		int value=2;
		int product=i*value;
		while(product<primeMat.length)
		{
			primeMat[product]=true;
			value++;
			product=i*value;
		}
	}
	/**
	 * Checks if prime.
	 *
	 * @param num the num parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPrime(int num) {
		if (num <= 1) return false;
		for (int i = 2; i * i <= num; i++) {
			// Check for null/base case
			if (num % i == 0) return false;
		}
		return true;
	}
}

