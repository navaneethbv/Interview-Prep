package LeetCodePerformancePractice;

/**
 * Implementation of Minimum In Rotated Sorted Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MinimumInRotatedSortedArray {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
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
	 * Finds min in the data structure.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int findMin(int[] nums) {
		// Check for null/base case
		if(nums==null||nums.length==0)
			return -1;
		int left=0,right=nums.length-1;
		while(left<=right)
		{
			if(nums[left]<=nums[right])
				return nums[left];
			int mid=(left+right)/2;
			if(nums[mid]>=nums[left]){
				left=mid+1;
			}else{
				right=mid;
			}
		}
		return -1;
	}
}
