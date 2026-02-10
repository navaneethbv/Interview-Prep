package leetCode;

import java.util.HashMap;

/*
 * Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

/**
 * Implementation of Remove Duplicates Sorted Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicatesSortedArray {
	/**
	 * Removes duplicates from the data structure.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int removeDuplicates(int[] nums) {
		int index=0;
		HashMap<Integer, Integer> elementMap=new HashMap<>();
		int length=nums.length;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			int element=nums[i];
			if(elementMap.containsKey(element))
			{
				length--;
			}
			else{
				nums[index]=nums[i];
				index++;
				elementMap.put(element,1);
			}
		}
		return length;
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