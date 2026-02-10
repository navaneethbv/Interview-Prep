package LeetCodePractice;

/**
 * Implementation of Powerof Two algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PowerofTwo{
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
	 * Checks if power of two.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isPowerOfTwo(int n) {
		return n>0 && (n&n-1)==0;
	}

}

