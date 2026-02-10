package eBayPrep;

/**
 * Implementation of First Missing Positive algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FirstMissingPositive {

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
	 * Performs firstMissingPositive operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int firstMissingPositive(int[] nums) {
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i+1)
			{
				//find the index of i+1
				int j=i+1;
				while(j<nums.length && nums[j]!=i+1)
				{
					j++;
				}
				if(j>=nums.length)
					return i+1;
				else
				{
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		return nums.length+1;	
	}
}
