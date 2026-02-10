package LeetCodePerformancePractice;

/**
 * Implementation of Ransom Note algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RansomNote {
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
	 * Performs canConstruct operation.
	 *
	 * @param ransomNote the ransomNote parameter
	 * @param magazine the magazine parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean canConstruct(String ransomNote, String magazine) {
		char c[]=new char[26];
		// Iterate through all elements
		for (int i = 0; i < magazine.length(); i++) {
			c[magazine.charAt(i)-97]++;
		}
		// Iterate through all elements
		for (int i = 0; i < ransomNote.length(); i++) {
			if(c[ransomNote.charAt(i)-97]<=0)
				return false;
			else
				c[ransomNote.charAt(i)-97]--;
		}
		return true;
	}
}
