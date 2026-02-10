package eBayPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Implementation of Letter Combinations Phone Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LetterCombinationsPhoneNumber {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	static HashMap<Character, String> map;
	static HashMap<String, String> tempMap;
	static ArrayList<String> output;
	/**
	 * Performs letterCombinations operation.
	 *
	 * @param digits the digits parameter
	 * @return the list of results
	 */
	public static List<String> letterCombinations(String digits) {
		map = new HashMap<Character, String>();
		tempMap = new HashMap<String, String>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		map.put('0', "");
		output=new ArrayList<>();
		printCombinations(digits,"");
		return output;
	}
	/**
	 * Performs printCombinations operation.
	 *
	 * @param digits the digits parameter
	 * @param str the str parameter
	 */
	private static void printCombinations(String digits, String str) {
		// Check for null/base case
		if(digits.length()==0)
		{
			System.out.println(str);
			return;	
		}
		char c=digits.charAt(0);
		String strn=map.get(c);
		// Iterate through all elements
		for (int i = 0; i < strn.length(); i++) {
			str+=strn.charAt(i);
			printCombinations(digits.substring(1), str);
			str=str.substring(0, str.length()-1);
		}
	}

}
