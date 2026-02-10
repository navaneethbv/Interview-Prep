package appleInterview;

/**
 * Implementation of Prep Doc List All Primes Preceding algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocListAllPrimesPreceding {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs listPrimes operation.
	 *
	 * @param i the i parameter
	 */
	private static void listPrimes(int i) {
		for (int j = 2; j < i; j++) {
			if(isPrime(j))
				System.out.println(j);
		}
	}

	/**
	 * Checks if prime.
	 *
	 * @param j the j parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPrime(int j) {
		if(j<2)return false;
		if(j==2)return true;
		// Check for null/base case
		if(j%2==0)return false;
		for (int i = 3; i*i <= j; i++) {
			// Check for null/base case
			if (j % i == 0) {
				return false;
			}
		}
		return true;
	}

}
