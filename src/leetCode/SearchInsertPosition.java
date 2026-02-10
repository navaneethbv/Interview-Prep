package leetCode;

/*
 * Link : https://leetcode.com/problems/implement-strstr/
 */

/**
 * Implementation of Search Insert Position algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SearchInsertPosition {
	/**
	 * Searches for insert.
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @return the computed integer result
	 */
	public static int searchInsert(int[] nums, int target) {		
		int start=0;
		int end=nums.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(nums[mid]<target)
				start=mid+1;
			else if(nums[mid]>target)
				end=mid-1;
			else
				return mid;
				
		}		
		if(start>nums.length-1)
			return start;
		return end>=0?end+1:0;
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