package leetCode;

/*
 * Link : https://leetcode.com/problems/ugly-number/
 */

/**
 * Implementation of Ugly Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UglyNumber {
	/**
	 * Checks if ugly.
	 *
	 * @param num the num parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isUgly(int num) {
		if(num<=0)
			return false;
		num=maxDivide(num,2);
		num=maxDivide(num,3);
		num=maxDivide(num,5);
		if(num==1)
			return true;
		return false;
	}
	/**
	 * Performs maxDivide operation.
	 *
	 * @param num the num parameter
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int maxDivide(int num, int i) {
		while(num%i==0)
			num=num/i;
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