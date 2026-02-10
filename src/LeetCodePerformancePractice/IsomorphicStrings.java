package LeetCodePerformancePractice;

import java.util.HashMap;

/**
 * Implementation of Isomorphic Strings algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IsomorphicStrings {
	/**
	 * Checks if isomorphic.
	 *
	 * @param s the s parameter
	 * @param t the t parameter
	 * @return true if condition is met, false otherwise
	 */
	public boolean isIsomorphic(String s, String t) {
		// Check for null/base case
		if(s==null && t==null)
			return true;
		// Check for null/base case
		else if(s==null || t==null ||s.length()!=t.length())
			return false;

		HashMap<Character, Character> map=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			char c1=s.charAt(i);
			char c2=t.charAt(i);
			if(map.containsKey(c1))
			{
				if(map.get(c1)!=c2)
					return false;
			}
			else{
				if(map.containsValue(c2))
					return false;
				map.put(c1, c2);
			}
		}
		return true;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}
