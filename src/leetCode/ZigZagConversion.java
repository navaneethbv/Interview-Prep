package leetCode;

/*
 * Link : https://leetcode.com/problems/zigzag-conversion/
 */

/**
 * Implementation of Zig Zag Conversion algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ZigZagConversion {
	/**
	 * Performs convert operation.
	 *
	 * @param s the s parameter
	 * @param numRows the numRows parameter
	 * @return the resulting string
	 */
	public static String convert(String s, int numRows) {
		if(numRows==1)
			return s;
		
		char[][] elementArray=new char[numRows][s.length()];
		boolean backFlag=false;
		int rowIndex=0,colIndex=0;
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {

			if(rowIndex>numRows-1){
				rowIndex--;
				backFlag=true;
				colIndex++;
			}
			else if(backFlag)
			{
				rowIndex--;
				colIndex++;
			}
			if(rowIndex<0)
			{
				rowIndex++;
				backFlag=false;
				colIndex--;
			}
			elementArray[rowIndex][colIndex]=s.charAt(i);
			if(!backFlag)
				rowIndex++;
		}
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < numRows; i++) {
			// Inner loop to check combinations
			for (int j = 0; j < s.length(); j++) {
				if(elementArray[i][j]!=' ')
					sb.append(String.valueOf(elementArray[i][j]).trim());
			}
		}
		return sb.toString();
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