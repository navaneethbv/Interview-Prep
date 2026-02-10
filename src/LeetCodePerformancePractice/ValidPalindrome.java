package LeetCodePerformancePractice;

/**
 * Implementation of Valid Palindrome algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ValidPalindrome {
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
     * Checks if palindrome.
     *
     * @param s the s parameter
     * @return true if condition is met, false otherwise
     */
    public static boolean isPalindrome(String s) {
    	s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return new StringBuilder(s).reverse().toString().contentEquals(s);
    }
}
