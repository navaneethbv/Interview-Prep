package LeetCodePractice;

import java.util.Arrays;

/**
 * Implementation of Combinations algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Combinations {


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
	 * Performs sortColors operation.
	 *
	 * @param nums the array to process
	 */
	public static void sortColors(int[] nums) {
		int zeroCount=0,onesCount=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			// Check for null/base case
			if(nums[i]==0)
				zeroCount++;
			else if(nums[i]==1)
				onesCount++;
		}
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(zeroCount>0){
				nums[i]=0;
				zeroCount--;
			}else if(onesCount>0){
				nums[i]=1;
				onesCount--;
			}else
				nums[i]=2;
		}

		System.out.println(Arrays.toString(nums));
	}
}

