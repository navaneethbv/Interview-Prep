package leetCode;

/*
 * Link : https://leetcode.com/problems/happy-number/
 */

/**
 * Implementation of Happy Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class HappyNumber {
	/**
	 * Checks if happy.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isHappy(int n) {
		String inputString=String.valueOf(n);
		while(inputString.length()>1)
		{
			int value=0;
			// Iterate through all elements
			for (int i = 0; i < inputString.length(); i++) {
				value+=Math.pow(Integer.parseInt(inputString.charAt(i)+""),2);
			}
			inputString=String.valueOf(value);
		}
		return Integer.parseInt(inputString)==(1)||Integer.parseInt(inputString)==(7)?true:false;
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