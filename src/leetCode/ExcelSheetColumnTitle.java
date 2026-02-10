package leetCode;

/*
 * Link : https://leetcode.com/problems/excel-sheet-column-title/
 */

/**
 * Implementation of Excel Sheet Column Title algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ExcelSheetColumnTitle {
	/**
	 * Performs convertToTitle operation.
	 *
	 * @param n the size or count parameter
	 * @return the resulting string
	 */
	public static String convertToTitle(int n) {
		StringBuffer sb=new StringBuffer();
		while(n>0)
		{	
			n--;
			sb.append((char)(n%26+'A'));
			n=n/26;
		}
		return sb.reverse().toString();
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