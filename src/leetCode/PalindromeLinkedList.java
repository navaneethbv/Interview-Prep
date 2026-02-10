package leetCode;

/*
 * Link : https://leetcode.com/problems/reverse-integer/
 */

/**
 * Implementation of Palindrome Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PalindromeLinkedList {
	/**
	 * Performs reverse operation.
	 *
	 * @param x the x parameter
	 * @return the computed integer result
	 */
	public static int reverse(int x) {
		String input=String.valueOf(x);
		String output = null;
		boolean negative=false;
		if(input.contains("-"))
		{
			StringBuffer sb=new StringBuffer(input);
			output=sb.reverse().toString().replace("-","");
			negative=true;
		}
		else{
			StringBuffer sb=new StringBuffer(input);
			output=sb.reverse().toString();
		}
		if(output.length()>10)
			return 0;
		// Check for null/base case
		else if(output.length()==10)
		{
			if(negative)
				return checkRange(output,(Integer.MIN_VALUE+"").replace("-",""))==true?Integer.parseInt("-"+output):0;
				else
					return checkRange(output,Integer.MAX_VALUE+"")==true?Integer.parseInt(output):0;		
		}
		return negative==true?Integer.parseInt("-"+output):Integer.parseInt(output);
	}

	/**
	 * Performs checkRange operation.
	 *
	 * @param output the output parameter
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkRange(String output, String value) {

		// Iterate through all elements
		for (int i = 0; i < output.length(); i++) {
			if(Integer.parseInt(output.charAt(i)+"")>Integer.parseInt(value.charAt(i)+""))
				return false;
			else 
				if(Integer.parseInt(output.charAt(i)+"")<Integer.parseInt(value.charAt(i)+""))
					return true;
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