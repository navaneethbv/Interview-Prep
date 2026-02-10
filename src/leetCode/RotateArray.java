package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Link : https://leetcode.com/problems/rotate-array/
 */

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
		if(nums.length==0||k==0||k%nums.length==0)
			return;
		if(k>nums.length)
			k=k%nums.length;
		System.out.println(k);
		int []first=Arrays.copyOfRange(nums, nums.length-k,nums.length);
		ArrayList<Integer> list=new ArrayList<>();
		// Iterate through all elements
		for (int i = 0; i < first.length; i++) {
			list.add(first[i]);
		}
		int last[]=new int[nums.length-first.length];
		// Iterate through all elements
		for (int i = 0; i < nums.length-k; i++) {
			list.add(nums[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			nums[i]=list.get(i);
		}
		System.out.println(Arrays.toString(nums));
		
	}
}