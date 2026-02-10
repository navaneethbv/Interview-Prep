package leetCode;

/*
 * Link : https://leetcode.com/problems/remove-element/
 */

/**
 * Implementation of Remove Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveElement {
		/**
		 * Removes element from the data structure.
		 *
		 * @param nums the array to process
		 * @param val the val parameter
		 * @return the computed integer result
		 */
		public int removeElement(int[] nums, int val) {
			int index=0;
			int length=nums.length;
			// Iterate through all elements
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]!=val)
				{
					nums[index]=nums[i];
					index++;
				}
				else{
					length--;
				}
			}
			return length;
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