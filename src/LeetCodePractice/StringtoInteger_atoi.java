package LeetCodePractice;

import java.math.BigInteger;

/**
 * Implementation of Stringto Integer_atoi algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StringtoInteger_atoi {

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
		StringBuilder output=new StringBuilder();
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(c=='-' || c=='+' )
			{	
				if(count>0)
					break;
				output.append(c);
				count++;
			}
			else if(Character.isDigit(c)){
				output.append(c);
				count++;
			}
			else {
				break;
			}
		}

		// Check for null/base case
		if(output.toString().length()==0)
			return 0;
		try{
			BigInteger b=new BigInteger(output.toString());
			if(b.compareTo(new BigInteger(Integer.MAX_VALUE+""))==1)
			{
				return Integer.MAX_VALUE;
			}
			else if(b.compareTo(new BigInteger(Integer.MIN_VALUE+""))==-1)
			{
				return Integer.MIN_VALUE;
			}
			long  value=Long.parseLong(output.toString());
			if(value>Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			else if(value<Integer.MIN_VALUE)
				return Integer.MIN_VALUE;

			return Integer.parseInt(output.toString());
		}catch(NumberFormatException e){
			return 0;
		}
	}
}
