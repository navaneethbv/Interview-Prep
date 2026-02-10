package eBayPrep;

/**
 * Implementation of Ugly Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UglyNumber{
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(isUgly(1));
		System.out.println(isUgly(2));
		System.out.println(isUgly(3));
		System.out.println(isUgly(5));
		System.out.println(isUgly(6));
		System.out.println(isUgly(8));
		System.out.println(isUgly(14));
	}
	/**
	 * Checks if ugly.
	 *
	 * @param num the num parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isUgly(int num) {
		// Check for null/base case
		if(num==0)
			return false;
		if(num==1)
			return true;
		// Check for null/base case
		if(num%2==0)
			// Recursively process left and right subtrees
			return isUgly(num/2);
		// Check for null/base case
		if(num%3==0)
			// Recursively process left and right subtrees
			return isUgly(num/3);
		// Check for null/base case
		if(num%5==0)
			// Recursively process left and right subtrees
			return isUgly(num/5);
		return false;
	}
}

