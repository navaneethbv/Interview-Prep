package appleInterview;

/**
 * Implementation of Prep Doc Recursive Prime Checker algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocRecursivePrimeChecker {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds prime in the data structure.
	 *
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findPrime(int i) {
		return checkPrime(i,(int)Math.ceil(i/2));
	}

	/**
	 * Performs checkPrime operation.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkPrime(int n, int i) {
		if(i<2)
			return true;
		else
		{
			// Recursively process left and right subtrees
			return checkPrime(n, i-1) && n%i!=0;
		}
	}

}
