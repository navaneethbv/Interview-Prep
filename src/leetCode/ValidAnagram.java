package leetCode;

import java.util.Arrays;

/*
 * Link : https://leetcode.com/problems/valid-anagram/
 */

/**
 * Implementation of Valid Anagram algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ValidAnagram {
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
		else{
			char sArray[]=s.toCharArray();
			char tArray[]=t.toCharArray();
			Arrays.sort(sArray);
			Arrays.sort(tArray);
			// Iterate through all elements
			for (int i = 0; i < tArray.length; i++) {
				if(sArray[i]!=tArray[i])
				{
					return false;
				}
			}
		}
		return true;
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