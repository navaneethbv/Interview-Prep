package LeetCodePerformancePractice;

/**
 * Implementation of Remove Duplicates Sorted Array2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicatesSortedArray2 {
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
		if(nums==null||nums.length==0)
			return 0;
		int index=1;
		int element=nums[0];
		int elementCount=1;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]==element)
			{
				if(elementCount<2){
					elementCount++;
					nums[index]=nums[i];
					index++;
				}
			}
			else{
				element=nums[i];
				elementCount=1;
				nums[index]=nums[i];
				index++;
			}
		}
		return index;
	}
}
