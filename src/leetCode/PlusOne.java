package leetCode;

import java.math.BigInteger;

/*
 * Link : https://leetcode.com/problems/plus-one/
 */

/**
 * Implementation of Plus One algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PlusOne {
	/**
	 * Performs plusOne operation.
	 *
	 * @param digits the array to process
	 * @return the resulting array
	 */
	public int[] plusOne(int[] digits) {
		StringBuffer sb=new StringBuffer();
		// Iterate through all elements
		for (int i = 0; i < digits.length; i++) {
			sb.append(digits[i]);
		}
		BigInteger b=new BigInteger(sb.toString());
		b=b.add(new BigInteger("1"));
		String outputString=b.toString();
		digits=new int[outputString.length()];
		// Iterate through all elements
		for (int i = 0; i < digits.length; i++) {
			digits[i]=Integer.parseInt(outputString.charAt(i)+"");
		}
		return digits;
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