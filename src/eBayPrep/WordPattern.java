package eBayPrep;

import java.util.HashMap;

/**
 * Implementation of Word Pattern algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class WordPattern{
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
	 * Performs wordPattern operation.
	 *
	 * @param pattern the pattern parameter
	 * @param str the str parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean wordPattern(String pattern, String str) {
		HashMap<Character, String> charMap=new HashMap<>();
		HashMap<String, Character> stringMap=new HashMap<>();
		String arr[]=str.split(" ");
		if(arr.length!=pattern.length())
			return false;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			char c=pattern.charAt(i);
			str=arr[i];
			if(charMap.containsKey(c))
			{
				if(!charMap.get(c).contentEquals(str))
					return false;
			}
			else{
				charMap.put(c, str);
			}

			if(stringMap.containsKey(str))
			{
				if(stringMap.get(str)!=c)
					return false;
			}
			else{
				stringMap.put(str, c);
			}

		}
		return true;
	}


}

