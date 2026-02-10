package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of Letter Combinations Of Phone Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LetterCombinationsOfPhoneNumber {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	static HashMap<Character, String> map=new HashMap<>();
	static List<String> outputList;
	/**
	 * Performs letterCombinations operation.
	 *
	 * @param digits the digits parameter
	 * @return the list of results
	 */
	public static List<String> letterCombinations(String digits) {
		outputList=new ArrayList<>();
		// Check for null/base case
		if(digits==null||digits.length()==0)
			return outputList;	
		map=new HashMap<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		populateList("",digits);
		return outputList;
	}
	/**
	 * Performs populateList operation.
	 *
	 * @param prefix the prefix parameter
	 * @param digits the digits parameter
	 */
	private static void populateList(String prefix,String digits) {
		// Check for null/base case
		if(digits.length()==0)
		{
			outputList.add(prefix);
			return;
		}
		char c=digits.charAt(0);
		String str=map.get(c);
		// Iterate through all elements
		for (int i = 0; i < str.length(); i++) {
			populateList(prefix+str.charAt(i), digits.substring(1));
		}
	}

}
