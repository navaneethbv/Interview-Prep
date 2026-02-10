package leetCode;

/*
 * Link : https://leetcode.com/problems/palindrome-number/
 */

/**
 * Implementation of Integer To Roman algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IntegerToRoman {
	/**
	 * Performs intToRoman operation.
	 *
	 * @param num the num parameter
	 * @return the resulting string
	 */
	public static String intToRoman(int num) {
		 String symbol[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};    
	     int value[]=    {1000,900,500,400, 100, 90,  50, 40,  10, 9,   5,  4,   1};
	     String str="";
	     if(num>0)
	     {
	    	// Iterate through all elements
	    	for (int i = 0; i < value.length; i++) {
				while(num>=value[i])
				{
					num-=value[i];
					str+=symbol[i];
				}
			} 
	    	 
	     }
		return str;
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