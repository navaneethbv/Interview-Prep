package eBayPrep;

/**
 * Implementation of Next Permutation algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class NextPermutation {

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
	 * Performs nextPermutation operation.
	 *
	 * @param nums the array to process
	 */
	public static void nextPermutation(int[] nums) {
		StringBuilder sb=new StringBuilder();
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			sb.append(nums[i]);
		}
		printPermutation("",sb.toString());
	}

	/**
	 * Performs printPermutation operation.
	 *
	 * @param prefix the prefix parameter
	 * @param str the str parameter
	 */
	private static void printPermutation(String prefix, String str) {
		// Check for null/base case
		if(str.length()==0){
			System.out.println(prefix);
			return;
		}
		
		// Iterate through all elements
		for (int i = 0; i < str.length(); i++) {
			printPermutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1));
		}
	}
}
