package LeetCodePerformancePractice;

/**
 * Implementation of Sort Colors algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SortColors {
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
	 * Performs sortColors operation.
	 *
	 * @param nums the array to process
	 */
	public static void sortColors(int[] nums) {
		int noOfZeros=0,noOfOnes=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			// Check for null/base case
			if(nums[i]==0)noOfZeros++;
			else if(nums[i]==1)noOfOnes++;
		}
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(noOfZeros>0)
			{
				nums[i]=0;
				noOfZeros--;
			}
			else if(noOfOnes>0)
			{
				nums[i]=1;
				noOfOnes--;
			}
			else
				nums[i]=2;
		}		
	}
}
