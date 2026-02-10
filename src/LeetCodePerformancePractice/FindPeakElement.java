package LeetCodePerformancePractice;

/**
 * Implementation of Find Peak Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindPeakElement {
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
	}
	/**
	 * Finds peak element in the data structure.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int findPeakElement(int[] nums) {
		// Check for null/base case
		if(nums==null||nums.length<=1)
			return 0;
		if(nums.length==2)
		{
			if(nums[0]>nums[1])
				return 0;
			else
				return 1;
		}
		int left=0,right=nums.length-1;
		while(left<right)
		{	
			int mid=(left+(right-left)/2);
			// Check for null/base case
			if((mid==nums.length-1 || nums[mid]>=nums[mid+1] ) && (mid==0||nums[mid]>=nums[mid-1])){
				return mid;
			}
			else if(mid>0 && nums[mid]>nums[mid-1])
			{
				left=mid+1;
			}
			else
				right=mid-1;
		}
		return -1;
	}
}
