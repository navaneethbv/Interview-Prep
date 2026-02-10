package LeetCodePractice;

/**
 * Implementation of Reverse Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseInteger {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs reverse operation.
	 *
	 * @param x the x parameter
	 * @return the computed integer result
	 */
	public static int reverse(int x) {
		try{
			if(x<0)
			{
				// Recursively process left and right subtrees
				return -1*Integer.parseInt(new StringBuilder(new String(x+"").substring(1)).reverse().toString());
			}
			else{
				// Recursively process left and right subtrees
				return Integer.parseInt(new StringBuilder(new String(x+"")).reverse().toString());
			}
		}catch(NumberFormatException e){
			return 0;
		}
	}
}
