package LeetCodePractice;

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
		// Check for null/base case
		if(digits.length()==0||digits==null)
			return output;
		int length=map.get(digits.charAt(0)).length();
		// Iterate through all elements
		for (int i = 0; i < length; i++) {
			getCombinations(digits,"",0,i);
		}
		return output;
	}
	/**
	 * Retrieves combinations from the data structure.
	 *
	 * @param digits the digits parameter
	 * @param tempOutput the tempOutput parameter
	 * @param stringIndex the stringIndex parameter
	 * @param subIndex the subIndex parameter
	 */
	private static void getCombinations(String digits, String tempOutput,int stringIndex,int subIndex) {
		if(stringIndex>digits.length()-1){
			if(!tempMap.containsKey(tempOutput)){
				output.add(tempOutput);
				tempMap.put(tempOutput, tempOutput);
			}
			return;
		}
		else{
			int subStringlength=map.get(digits.charAt(stringIndex)).length();
			if(subIndex<=subStringlength-1)
			{
				tempOutput+=map.get(digits.charAt(stringIndex)).charAt(subIndex);
				// Iterate through all elements
				for (int i = 0; i <=subStringlength; i++) {
					getCombinations(digits, tempOutput, stringIndex+1, i);
				}
			}
			if(stringIndex==digits.length()-1)
			{
				return;
			}
		}	
	}
}
