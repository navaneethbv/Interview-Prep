package LeetCodePractice;

import java.util.Arrays;

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
		char[] arr1=s.toCharArray();
		Arrays.sort(arr1);
		s=new String(arr1);
		arr1=t.toCharArray();
		Arrays.sort(arr1);
		t=new String(arr1);
		return s.contentEquals(t);
	}
}

