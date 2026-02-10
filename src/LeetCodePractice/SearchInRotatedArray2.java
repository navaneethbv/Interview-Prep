package LeetCodePractice;

import java.util.Arrays;

/**
 * Implementation of Search In Rotated Array2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SearchInRotatedArray2 {


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
		int outputCount=0;
		int prevElement=Integer.MIN_VALUE;
		int prevElementCounter=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			// Check for null/base case
			if(i==0)
			{
				prevElement=nums[i];
				prevElementCounter=1;
				outputCount+=1;
			}
			else{
				if(nums[i]==prevElement && prevElementCounter<2)
				{
					nums[outputCount]=nums[i];
					outputCount+=1;
					prevElementCounter=2;
				}
				else if(nums[i]!=prevElement ){
					nums[outputCount]=nums[i];
					outputCount+=1;
					prevElementCounter=1;
					prevElement=nums[i];
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		return outputCount;
	}

}

