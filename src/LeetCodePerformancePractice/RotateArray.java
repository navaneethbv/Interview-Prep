package LeetCodePerformancePractice;

import java.util.Arrays;

/**
 * Implementation of Rotate Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RotateArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
		int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7};
		int k1 = 3;
		System.out.println("Input: " + Arrays.toString(array1) + ", k: " + k1);
		System.out.println("Output: " + Arrays.toString(rotate(array1, k1)));
		System.out.println();
		
		// Test Case 2: Edge case - rotate by 0
		System.out.println("Test 2: Rotate by 0");
		int[] array2 = new int[]{1, 2, 3};
		int k2 = 0;
		System.out.println("Input: " + Arrays.toString(array2) + ", k: " + k2);
		System.out.println("Output: " + Arrays.toString(rotate(array2, k2)));
		System.out.println();
		
		// Test Case 3: Edge case - single element
		System.out.println("Test 3: Single element");
		int[] array3 = new int[]{1};
		int k3 = 1;
		System.out.println("Input: " + Arrays.toString(array3) + ", k: " + k3);
		System.out.println("Output: " + Arrays.toString(rotate(array3, k3)));
	}
	/**
	 * Rotates the .
	 *
	 * @param nums the array to process
	 * @param k the k value
	 */
	public static void rotate(int[] nums, int k) {
		// Check for null/base case
		if(nums==null||nums.length<=1)
			return ;
		k=k>nums.length?k%nums.length:k;
		k=nums.length-k;
		nums=reverse(0,k-1,nums);
		nums=reverse(k,nums.length-1,nums);
		nums=reverse(0,nums.length-1,nums);
		System.out.println(Arrays.toString(nums));
	}
	/**
	 * Performs reverse operation.
	 *
	 * @param i the i parameter
	 * @param k the k value
	 * @param nums the array to process
	 * @return the resulting array
	 */
	private static int[] reverse(int i, int k,int[] nums) {
		if(i>k)
			return nums;
		while(i<k && i>=0 && k<nums.length)
		{
			int temp=nums[i];
			nums[i]=nums[k];
			nums[k]=temp;
			i++;k--;
		}
		return nums;
	}

}