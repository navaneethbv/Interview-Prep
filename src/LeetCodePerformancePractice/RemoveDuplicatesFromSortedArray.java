package LeetCodePerformancePractice;

/**
 * Implementation of Remove Duplicates From Sorted Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicatesFromSortedArray {
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
	 * Removes duplicates from the data structure.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int removeDuplicates(int[] nums) {
		// Check for null/base case
		if(nums==null||nums.length<=1)
			return nums==null?0:nums.length;
		int index=1;
		int number=nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(number!=nums[i])
			{
				nums[index]=nums[i];
				index++;
				number=nums[i];
			}
		}
		return index;
	}




}

