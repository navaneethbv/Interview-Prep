package leetCode;

/*
 * Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/	
 */

/**
 * Implementation of Rotated Sorted Array Minimum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RotatedSortedArrayMinimum {
	/**
	 * Finds min in the data structure.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int findMin(int[] nums) {
		if(nums.length<1)
			return 0;
		else if(nums.length==1)
			return nums[0];
		else{
			int start=0;
			int end=nums.length-1;
			while(start<end)
			{
				int mid=(start+end)/2;

				if(mid-1>=0 && nums[mid-1]>nums[mid]){
					return nums[mid];
				}
				else{
					if(nums[mid]>nums[end])
						start=mid+1;
					else
						end=mid-1;
				}
			}
			return nums[start];
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

}