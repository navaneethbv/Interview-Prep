package LeetCodePerformancePractice;

/**
 * Implementation of Input Array Sorted Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class InputArraySortedSum {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
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
	public int[] twoSum(int[] nums, int target) {
		int left=0,right=nums.length-1;
		while(left<right)
		{
			if(nums[left]+nums[right]==target)
				return new int[]{left+1,right+1};
			else if(nums[left]+nums[right]>target)
				right--;
			else
				left++;
		}
		return null;
	}
}
