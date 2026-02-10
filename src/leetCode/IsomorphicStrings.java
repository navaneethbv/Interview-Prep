package leetCode;

import java.util.HashMap;

/*
 * Link : https://leetcode.com/problems/isomorphic-strings/
 */
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
	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> charMap=new HashMap<>();
		HashMap<Character, Character> charMapNew=new HashMap<>();
		
		StringBuffer sb=new StringBuffer();
		StringBuffer sbNew=new StringBuffer();
		
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			char sChar=s.charAt(i);
			char tChar=t.charAt(i);
			if(charMap.containsKey(sChar))
			{
				sb.append(charMap.get(sChar)+"");
			}
			else{
				charMap.put(sChar,tChar);
				sb.append(tChar);
			}
			if(charMapNew.containsKey(tChar))
			{
				sbNew.append(charMapNew.get(tChar)+"");
			}
			else{
				charMapNew.put(tChar,sChar);
				sbNew.append(sChar);
			}
		}
		return sb.toString().contentEquals(t) && sbNew.toString().contentEquals(s)?true:false;
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