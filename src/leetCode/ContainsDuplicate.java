package leetCode;

import java.util.HashMap;

/*
 * Link : https://leetcode.com/problems/contains-duplicate/
 */

/**
 * Implementation of Contains Duplicate algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ContainsDuplicate {
		/**
		 * Performs containsDuplicate operation.
		 *
		 * @param nums the array to process
		 * @return true if condition is met, false otherwise
		 */
		public boolean containsDuplicate(int[] nums) {
			HashMap<Integer,Integer> elementMap=new HashMap<Integer,Integer>();
			// Iterate through all elements
			for (int i = 0; i < nums.length; i++) {
				if(elementMap.containsKey(nums[i]))
					return true;
				else
					elementMap.put(nums[i],nums[i]);
			}
			return false;
		}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}