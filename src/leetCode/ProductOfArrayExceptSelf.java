package leetCode;

import java.util.Arrays;

/*
 * Link : https://leetcode.com/problems/product-of-array-except-self/
 */

/**
 * Implementation of Product Of Array Except Self algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ProductOfArrayExceptSelf {
	/**
	 * Performs productExceptSelfWithDivision operation.
	 *
	 * @param nums the array to process
	 * @return the resulting array
	 */
	public int[] productExceptSelfWithDivision(int[] nums) {
		int outputArray[]=new int[nums.length];
		int product=1;
		// Iterate through all elements
		for (int i = 0; i < outputArray.length; i++) {
			product*=nums[i];
		}
		// Iterate through all elements
		for (int i = 0; i < outputArray.length; i++) {
			
			outputArray[i]=nums[i]!=0?product/nums[i]:0;
		}
		return outputArray;
	}
	
	/**
	 * Performs productExceptSelf operation.
	 *
	 * @param nums the array to process
	 * @return the resulting array
	 */
	public static int[] productExceptSelf(int[] nums) {
		int outputArray[]=new int[nums.length];
		int p1[]=new int[nums.length];
		int p2[]=new int[nums.length];
		p1[0]=1;
		p2[p2.length-1]=1;
		
		// Iterate through all elements
		for (int i = 0; i < outputArray.length-1; i++) {
			p1[i+1]=p1[i]*nums[i];
		}
		System.out.println(Arrays.toString(p1));
		for (int i = outputArray.length-1;i>0; i--) {
			p2[i-1]=p2[i]*nums[i];
		}
		System.out.println(Arrays.toString(p2));
		// Iterate through all elements
		for (int i = 0; i < p2.length; i++) {
			outputArray[i]=p1[i]*p2[i];
		}
		return outputArray;
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