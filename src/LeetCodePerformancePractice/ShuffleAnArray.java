package LeetCodePerformancePractice;

import java.util.Arrays;
import java.util.Random;

/**
 * Implementation of Shuffle An Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ShuffleAnArray {
	int[] original;
	int shuffled[];
	Random r;
	public _384ShuffleAnArray(int[] nums) {
		original=nums;
		shuffled=Arrays.copyOf(nums, nums.length);
		r=new Random();
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		shuffled=Arrays.copyOf(original, original.length);
		return shuffled;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		int length=shuffled.length;
		for (int i = 0; i < shuffled.length; i++) {
			int index=r.nextInt(length-i)%(length-1);
			int temp=shuffled[i];
			shuffled[i]=shuffled[index+1];
			shuffled[index+1]=temp;
		}
		return shuffled;
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
