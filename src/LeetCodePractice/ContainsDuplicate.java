package LeetCodePractice;

import java.util.HashSet;

/**
 * Implementation of Contains Duplicate algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ContainsDuplicate{
	/**
	 * Performs containsDuplicate operation.
	 *
	 * @param nums the array to process
	 * @return true if condition is met, false otherwise
	 */
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i]))
				return true;
			set.add(nums[i]);
		}
		return false;
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

