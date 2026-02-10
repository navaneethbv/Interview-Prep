package LeetCodePerformancePractice;

import java.util.HashMap;

/**
 * Implementation of Word Pattern algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class WordPattern {
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
		HashMap<Character, String> map=new HashMap<>();
		String arr[]=str.split(" ");
		if(arr.length!=pattern.length())
			return false;
		// Iterate through all elements
		for (int i = 0; i < pattern.length(); i++) {
			char c=pattern.charAt(i);
			if(map.containsKey(c))
			{
				if(!map.get(c).contentEquals(arr[i]))
					return false;
			}
			else{
				if(map.containsValue(arr[i]))
					return false;
				map.put(c, arr[i]);
			}
		}
		return true;
	}
}
