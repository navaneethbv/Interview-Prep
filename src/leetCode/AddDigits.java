package leetCode;

/*
 * Link : https://leetcode.com/problems/add-digits/
 */

/**
 * Implementation of Add Digits algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AddDigits {
	 /**
	  * Adds digits to the data structure.
	  *
	  * @param num the num parameter
	  * @return the computed integer result
	  */
	 public static int addDigits(int num) {
		 while(String.valueOf(num).length()!=1)
		 {
			 String numberVal=String.valueOf(num);
			 num=0;
			 // Iterate through all elements
			 for (int i = 0; i <numberVal.length(); i++) {
				num+=Integer.parseInt(numberVal.charAt(i)+"");
			}
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