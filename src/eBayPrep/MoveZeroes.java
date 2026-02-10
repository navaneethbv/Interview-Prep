package eBayPrep;

import java.util.Arrays;

/**
 * Implementation of Move Zeroes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MoveZeroes{
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
	 * Performs moveZeroes operation.
	 *
	 * @param nums the array to process
	 */
	public static void moveZeroes(int[] nums) {
		int zeroPointer=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0)
			{
				nums[zeroPointer]=nums[i];
				zeroPointer++;
			}
		}
		for (int i = zeroPointer; i < nums.length; i++) {
			nums[i]=0;
		}
		System.out.println(Arrays.toString(nums));
	}
}

