package leetCode;

/*
 * Link : https://leetcode.com/problems/move-zeroes/
 */

/**
 * Implementation of Roman To Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RomanToInteger {
	/**
	 * Performs romanToInt operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int romanToInt(String s) {
		int value=0;
		Integer prevValue=null;
		if(s.length()!=0)
		{	
			for (int i = s.length()-1; i>=0;i--) {
				int romanValue=romanTable(s.charAt(i));
				System.out.println(value);
				// Check for null/base case
				if(prevValue==null)
				{
					prevValue=romanValue;
					value+=romanValue;
				}
				else{
					if(prevValue>romanValue)
					{
						value-=romanValue;
					}
					else{
						value+=romanValue;
						prevValue=romanValue;
					}
				}
			}
		}
		return value;
	}
	/**
	 * Performs romanTable operation.
	 *
	 * @param c the c parameter
	 * @return the computed integer result
	 */
	public static int romanTable(char c){
		int num = 0;
		switch(c){
		case 'I':
			num = 1;
			break;
		case 'V':
			num = 5;
			break;
		case 'X':
			num = 10;
			break;
		case 'L':
			num = 50;
			break;
		case 'C':
			num = 100;
			break;
		case 'D':
			num = 500;
			break;
		case 'M':
			num = 1000;
			break;
		default:
			num = 0;
			break;
		}
		return num;
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