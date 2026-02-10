package programCreek;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic
if the characters in s can be replaced to get t.
For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
 */

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
		String one = "foo";
		String two = "baa";
		if(isIsomorphic(one,two)){
			System.out.println("The given strings are isomorphic");
		}
		else
			System.out.println("The given strings are not isomorphic");
	}

	/**
	 * Checks if isomorphic.
	 *
	 * @param s the s parameter
	 * @param t the t parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isIsomorphic(String s, String t) {
		// Check for null/base case
		if(s == null || t == null)
			return false;

		if(s.length() != t.length())
			return false;

		// Check for null/base case
		if(s.length() == 0 && t.length() == 0)
			return true;

		HashMap<Character, Character> map = new HashMap<Character,Character>();

		// Iterate through all elements
		for(int i = 0; i < s.length(); i++){
			char c1 = s.charAt(i); System.out.println(c1);
			char c2 = t.charAt(i); System.out.println(c2);
			Character c = getKey(map, c2); System.out.println(c);

			// Check for null/base case
			if(c != null && c!=c1) {
				return false;
			}
			else if(map.containsKey(c1)) {
				if(c2 != map.get(c1))
					return false;
			} else {
				map.put(c1,c2);
			}
		}
		return true;
	}
	// a method for getting key of a target value
	/**
	 * Retrieves key from the data structure.
	 *
	 * @param map the map parameter
	 * @param target the target value
	 * @return the Character result
	 */
	public static Character getKey(HashMap<Character,Character> map, Character target){
		for (Map.Entry<Character,Character> entry : map.entrySet()) {
			if (entry.getValue().equals(target)) {
				// Recursively process left and right subtrees
				return entry.getKey();
			}
		}
		return null;
	}
}
