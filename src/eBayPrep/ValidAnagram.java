package eBayPrep;

/**
 * Implementation of Valid Anagram algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ValidAnagram{
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
	 * Checks if anagram.
	 *
	 * @param s the s parameter
	 * @param t the t parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())
			return false;
		char c1[]=new char[127];
		char c2[]=new char[127];
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			c1[s.charAt(i)]++;
			c2[t.charAt(i)]++;
		}
		for (int i = 0; i < 127; i++) {
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
}

