package LeetCodePractice;

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
		k=k>nums.length?k%nums.length:k;
		for (int i = 0; i <k; i++) {
			nums=rotateOnce(nums);
		}
		System.out.println(Arrays.toString(nums));
	}

	/**
	 * Rotates the once.
	 *
	 * @param nums the array to process
	 * @return the resulting array
	 */
	private static int[] rotateOnce(int[] nums) {
		int temp=nums[0];
		for (int i = 1; i < nums.length; i++) {
			int value=nums[i];
			nums[i]=temp;
			temp=value;
		}
		nums[0]=temp;
		return nums;
	}
}

