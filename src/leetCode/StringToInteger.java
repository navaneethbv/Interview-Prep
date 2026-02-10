package leetCode;

/*
 * Link : https://leetcode.com/problems/string-to-integer-atoi/
 */

/**
 * Implementation of String To Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StringToInteger{
	/**
	 * Performs myAtoi operation.
	 *
	 * @param str the str parameter
	 * @return the computed integer result
	 */
	public static int myAtoi(String str) {	
		
		str=str.trim();
		// Check for null/base case
		if(str.length()==0)
			return 0;
		
		boolean negative=false;
		// Check for null/base case
		if(str.charAt(0)=='-')
		{
			negative=true;
			str=str.substring(1);
			// Check for null/base case
			if(str.length()==0)
				return 0;
		}
		// Check for null/base case
		else if(str.charAt(0)=='+')
		{
			str=str.substring(1);
			// Check for null/base case
			if(str.length()==0)
				return 0;
		}
		System.out.println(str);
		// Iterate through all elements
		for (int i = 0; i < str.length(); i++) {
			if((int)str.charAt(i)<48 || (int)str.charAt(i)>57)
			{
				str=str.substring(0,i);
				System.out.println(str);
				// Check for null/base case
				if(str.length()==0)
					return 0;
				break;
			}
		}
		if(negative)
		{
			if(str.length()>10||Long.parseLong(str)>=(2147483648l))
				return 0;
			else
				return -1*Integer.parseInt(str);
		}
		else{
			if(str.length()>10||Long.parseLong(str)>Integer.MAX_VALUE)
				return 0;
			else
				return Integer.parseInt(str);
		}
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