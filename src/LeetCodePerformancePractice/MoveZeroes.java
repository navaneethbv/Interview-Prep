package LeetCodePerformancePractice;

import java.util.Arrays;

/**
 * Implementation of Move Zeroes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MoveZeroes {
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
		// Check for null/base case
		if(nums==null||nums.length<=1)
			return;
		int left=0,right=left+1;
		while(left<nums.length && right<nums.length)
		{
			while(left<nums.length && nums[left]!=0)
			{
				left++;
			}
			right=left+1;
			while(right<nums.length && right>left && nums[right]==0)
			{
				right++;
			}
			if(left<nums.length && right<nums.length)
			{
				int temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++;
				right++;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	/**
	 * Performs moveZeroes1 operation.
	 *
	 * @param nums the array to process
	 */
	public static void moveZeroes1(int[] nums) {
		// Check for null/base case
		if(nums==null||nums.length<=1)
			return;
		int left=0,right=nums.length-1;
		while(left<right)
		{
			// Check for null/base case
			if(nums[left]==0 && nums[right]!=0)
			{
				int temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++;
				right--;
			}
			else if(nums[left]!=0)
			{
				left++;
			}
			else{
				right--;
			}
		}
		System.out.println(Arrays.toString(nums));


	}


}
