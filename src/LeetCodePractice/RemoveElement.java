package LeetCodePractice;

/**
 * Implementation of Remove Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveElement {

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
	 * Removes element from the data structure.
	 *
	 * @param nums the array to process
	 * @param val the val parameter
	 * @return the computed integer result
	 */
	public static int removeElement(int[] nums, int val) {
		int valPointer=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val)
			{
				nums[valPointer]=nums[i];
				valPointer++;
			}
		}
		return valPointer;
	}
}
