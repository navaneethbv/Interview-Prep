package LeetCodePractice;

import java.util.HashMap;

/**
 * Implementation of Isomorphic Strings algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IsomorphicStrings {

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
	 * Checks if isomorphic.
	 *
	 * @param s the s parameter
	 * @param t the t parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> charMap=new HashMap<>();
		if(s.length()!=t.length())
			return false;
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			if(charMap.containsKey(s.charAt(i)))
			{
				if(charMap.get(s.charAt(i))!=t.charAt(i))
					return false;
			}else{
				if(charMap.containsKey(t.charAt(i)))
					return false;
				charMap.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}
}

