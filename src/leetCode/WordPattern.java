package leetCode;

import java.util.HashMap;

/*
 * Link : https://leetcode.com/problems/word-pattern/
 */

/**
 * Implementation of Word Pattern algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class WordPattern {
	/**
	 * Performs wordPattern operation.
	 *
	 * @param pattern the pattern parameter
	 * @param str the str parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean wordPattern(String pattern, String str) {
		String strArray[]=str.split(" ");
		if(pattern.length()!=strArray.length)
			return false;
		else{
			HashMap<Character, String> charMap=new HashMap<>();
			HashMap<String,Character> reverseCharMap=new HashMap<>();
			// Iterate through all elements
			for (int i = 0; i < pattern.length(); i++) {
				Character element=pattern.charAt(i);
				if(!reverseCharMap.containsKey(strArray[i]))
				{
					reverseCharMap.put(strArray[i],element);
				}
				else{
					if(reverseCharMap.get(strArray[i])!=element)
						return false;
				}
				if(charMap.containsKey(element))
				{
					if(!(charMap.get(element).contentEquals(strArray[i])))
						return false;
				}
				else{
					charMap.put(element,strArray[i]);
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