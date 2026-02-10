package eBayPrep;

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
	static boolean multiple[];
	/**
	 * Counts the number of primes.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int countPrimes(int n) {
		multiple=new boolean[n];
		int count=0;
		for (int i = 2; i <multiple.length; i++) {
			if(!multiple[i])
			{
				if(isPrime(i)==true)
					count++;
			}
			appendToMatrix(i);
		}
		return count;
	}

	/**
	 * Performs appendToMatrix operation.
	 *
	 * @param number the number parameter
	 */
	private static void appendToMatrix(int number) {
		int count=1;
		while(count*number<multiple.length)
		{
			multiple[count*number]=true;
			count++;
		}
	}

	/**
	 * Checks if prime.
	 *
	 * @param number the number parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isPrime(int number)
	public static boolean isPrime(int number)
	{
		if(number<=1)
			return false;
		for (int i = 2; i*i < number; i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}
}

