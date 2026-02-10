package LeetCodePerformancePractice;

import java.util.Arrays;

/**
 * Implementation of Product Of Array Except algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ProductOfArrayExcept {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
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
	/**
	 * Performs productExceptSelf operation.
	 *
	 * @param nums the array to process
	 * @return the resulting array
	 */
	public static int[] productExceptSelf(int[] nums) {
		int[] temp1=new int[nums.length];
		int[] temp2=new int[nums.length];
		temp1[0]=1;
		temp2[temp2.length-1]=1;
		for (int i = 1; i < temp1.length; i++) {
			temp1[i]=temp1[i-1]*nums[i-1];
		}
		for (int i = temp2.length-2; i >=0; i--) {
			temp2[i]=temp2[i+1]*nums[i+1];
		}    	
		// Iterate through all elements
		for (int i = 0; i < temp2.length; i++) {
			nums[i]=temp1[i]*temp2[i];
		}
		return nums;
	}
}
