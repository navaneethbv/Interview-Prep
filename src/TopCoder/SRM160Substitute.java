package TopCoder;

import java.util.HashMap;

/*
 * SRM 160 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1333&rd=4605
 */



/**
 * Implementation of SRM160 Substitute algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM160Substitute {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)  {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Retrieves value from the data structure.
	 *
	 * @param key the key value
	 * @param code the code parameter
	 * @return the computed integer result
	 */
	public static int getValue(String key, String code){
		HashMap<Character, Integer> charMap=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < key.length(); i++) {
			charMap.put(key.charAt(i), i+1);
		}
		StringBuilder sb=new StringBuilder();
		// Iterate through all elements
		for (int i = 0; i < code.length(); i++) {
			if(charMap.containsKey(code.charAt(i))){
				int value=charMap.get(code.charAt(i));
				// Check for null/base case
				if(value==10)
					value=0;
				sb.append(value);
			}
		}
		return Integer.parseInt(sb.toString());
	}
}
