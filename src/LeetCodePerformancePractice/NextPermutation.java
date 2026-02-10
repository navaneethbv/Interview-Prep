package LeetCodePerformancePractice;

import java.util.Arrays;

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
		// Check for null/base case
		if(nums==null||nums.length<2)
			return;
		int p=0,q=0;
		for (int i = nums.length-2; i >=0; i--) {
			if(nums[i]<nums[i+1]){
				p=i;
				break;
			}
		}
		for (int i = nums.length-1; i >=0; i--) {
			if(nums[i]>nums[p]){
				q=i;
				break;
			}
		}
		// Check for null/base case
		if(p==0 && q==0)
		{
			nums=performSwap(nums,0,nums.length-1);
		}
		else{
			int temp=nums[p];
			nums[p]=nums[q];
			nums[q]=temp;
			p++;
			q=nums.length-1;
			nums=performSwap(nums,p,q);	
		}
		System.out.println(Arrays.toString(nums));
	}
	/**
	 * Performs performSwap operation.
	 *
	 * @param nums the array to process
	 * @param p the p parameter
	 * @param q the q parameter
	 * @return the resulting array
	 */
	private static int[] performSwap(int[] nums, int p, int q) {
		while(p<q)
		{
			int temp=nums[p];
			nums[p]=nums[q];
			nums[q]=temp;
			p++;
			q--;
		}
		return nums;

	}

}

