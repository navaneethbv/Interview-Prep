/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
		
Example 1:

	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Output: Because nums[0] + nums[1] == 9, we return [0, 1].
			
Example 2:

	Input: nums = [3,2,4], target = 6
	Output: [1,2]
			
Example 3:

	Input: nums = [3,3], target = 6
	Output: [0,1]

Constraints:

	2 <= nums.length <= 104
	-109 <= nums[i] <= 109
	-109 <= target <= 109
	Only one valid answer exists.
	
	Leetcode - https://leetcode.com/problems/two-sum/

*/

import java.util.*;

/**
 * Implementation of Two Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TwoSum {
	
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
		int[] nums1 = new int[]{2, 7, 11, 15};
		int target1 = 9;
		System.out.println("Input: " + Arrays.toString(nums1) + ", Target: " + target1);
		System.out.println("Output: " + Arrays.toString(twoSum(nums1, target1)));
		System.out.println();
		
		// Test Case 2: Edge case with negative numbers
		System.out.println("Test 2: Negative numbers");
		int[] nums2 = new int[]{-1, -2, -3, -4, -5};
		int target2 = -8;
		System.out.println("Input: " + Arrays.toString(nums2) + ", Target: " + target2);
		System.out.println("Output: " + Arrays.toString(twoSum(nums2, target2)));
		System.out.println();
		
		// Test Case 3: Edge case with duplicates
		System.out.println("Test 3: Duplicate values");
		int[] nums3 = new int[]{3, 3};
		int target3 = 6;
		System.out.println("Input: " + Arrays.toString(nums3) + ", Target: " + target3);
		System.out.println("Output: " + Arrays.toString(twoSum(nums3, target3)));
	}
	
	/**
	 * Performs twoSum operation.
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @return the resulting array
	 */
	public static int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] array = new int[2];
		
        // Iterate through all elements
        for(int i = 0 ; i < nums.length; i++) {      	
        	if(map.containsKey(target - nums[i])) {
        		array[0] = map.get(target - nums[i]);
        		array[1] = i;
        	}
        	map.put(nums[i], i);
        }
        
        return array;
	}
}
