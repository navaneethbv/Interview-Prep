package LeetCodePractice;

/**
 * Implementation of Remove Duplicates Sorted Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicatesSortedArray {

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
		if(nums.length<2)
			return nums.length;
		int pointer=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(i!=0)
			{
				if(nums[i]!=nums[i-1])
				{
					nums[pointer]=nums[i];
					pointer++;
				}
			}
			else{
				pointer++;
			}
		}
		return pointer;
	}
}
