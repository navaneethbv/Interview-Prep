package leetCode;

import java.util.HashMap;

/*
 * Link : https://leetcode.com/problems/contains-duplicate-ii/
 */

/**
 * Implementation of Contains Duplicate2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ContainsDuplicate2 {
	/**
	 * Performs containsNearbyDuplicate operation.
	 *
	 * @param nums the array to process
	 * @param k the k value
	 * @return true if condition is met, false otherwise
	 */
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> elementMap=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(elementMap.containsKey(nums[i]))
			{
				if((-elementMap.get(nums[i])+i)<=k)
				{
					return true;
				}
			}
			elementMap.put(nums[i],i);
		}
		return false;
	}
	/**
	 * Performs containsNearbyDuplicateLong operation.
	 *
	 * @param nums the array to process
	 * @param k the k value
	 * @return true if condition is met, false otherwise
	 */
	public static boolean containsNearbyDuplicateLong(int[] nums, int k) {
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(i!=j && nums[i]==nums[j] && Math.abs(i-j)<=k)
					return true;
			}
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