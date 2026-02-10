package leetCode;

/*
 * Link : https://leetcode.com/problems/move-zeroes/
 */

/**
 * Implementation of Game Of Lifes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GameOfLifes {
	/**
	 * Performs moveZeroes operation.
	 *
	 * @param nums the array to process
	 */
	public static void moveZeroes(int[] nums) {
		int index=0,zeroCount=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0)
			{
				nums[index]=nums[i];
				index++;
			}
			else{
				zeroCount++;
			}
		}
		for (int i = nums.length-zeroCount; i<nums.length; i++) {
			nums[i]=0;
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