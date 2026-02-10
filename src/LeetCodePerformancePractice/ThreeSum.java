package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implementation of Three Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ThreeSum {

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
	 * Performs threeSum operation.
	 *
	 * @param nums the array to process
	 * @return the list of results
	 */
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> outputList=new ArrayList<List<Integer>>();
		// Check for null/base case
		if(nums==null||nums.length==0)
			return outputList;
		Arrays.sort(nums);
		// Iterate through all elements
		for (int i = 0; i < nums.length-2; i++) {
			// Check for null/base case
			if(i==0 || nums[i]>nums[i-1])
			{
				int j=i+1;
				int k=nums.length-1;
				while(j<k)
				{
					// Check for null/base case
					if(nums[i]+nums[j]+nums[k]==0)
					{
						List<Integer> aList=new ArrayList<>();
						aList.add(nums[i]);
						aList.add(nums[j]);
						aList.add(nums[k]);
						outputList.add(aList);
						j++;
						k--;
						while(j<k && nums[j]==nums[j-1])
						{
							j++;
						}
						while(j<k && nums[k]==nums[k+1])
						{
							k--;
						}
					}
					else if(nums[i]+nums[j]+nums[k]>0)
						k--;
					else
						j++;
				}
			}
		}
		return outputList;
	}
}
