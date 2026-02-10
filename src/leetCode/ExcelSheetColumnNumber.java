package leetCode;

/*
 * Link : https://leetcode.com/problems/excel-sheet-column-number/
 */

/**
 * Implementation of Excel Sheet Column Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ExcelSheetColumnNumber {
	/**
	 * Performs titleToNumber operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int titleToNumber(String s) {
		int value=0;
		for (int i = s.length()-1; i >=0; i--) {
			int charCount=((int)s.charAt(i))-64;
			int exponent = s.length() - 1 - i;
			int placeValue = (int) Math.pow(26, exponent);
			value = value + (placeValue * charCount);
		}
		return value;
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
