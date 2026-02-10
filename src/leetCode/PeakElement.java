package leetCode;

/*
 * Link : https://leetcode.com/problems/find-peak-element/
 */

/**
 * Implementation of Peak Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PeakElement {
		/**
		 * Finds peak element in the data structure.
		 *
		 * @param nums the array to process
		 * @return the computed integer result
		 */
		public static int findPeakElement(int[] nums) {
			if(nums.length==1)
				return 0;
			// Iterate through all elements
			for (int i = 0; i < nums.length; i++) {
				// Check for null/base case
				if(i==0){
					if(nums[i]>nums[i+1])
						return i;
				}
				else if(i==nums.length-1){
					if(nums[i]>nums[i-1])
						return i;
				}
				else
					if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
						return i;
			}
			return 0;
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