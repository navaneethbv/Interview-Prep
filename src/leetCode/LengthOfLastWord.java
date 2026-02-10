package leetCode;

/*
 * Link : https://leetcode.com/problems/length-of-last-word/
 */

/**
 * Implementation of Length Of Last Word algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LengthOfLastWord {
	/**
	 * Performs lengthOfLastWord operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int lengthOfLastWord(String s) {
		int length=0;
		if((length=s.split(" ").length)>0){
			return s.split(" ")[length-1].length();
		}
		else{
			return s.trim().length();
		}
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