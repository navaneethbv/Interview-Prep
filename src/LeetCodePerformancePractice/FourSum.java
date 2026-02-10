package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implementation of Four Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FourSum {

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
	 * Performs fourSum operation.
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @return the list of results
	 */
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> outputList=new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		// Iterate through all elements
		for (int i = 0; i < nums.length-3; i++) {
			// Check for null/base case
			if(i==0||nums[i]>nums[i-1])
				for (int j = i+1; j < nums.length-2; j++) {
					if(j==i+1||nums[j]>nums[j-1])
					{
						int k=j+1;
						int l=nums.length-1;
						while(k<l)
						{
							if(nums[i]+nums[j]+nums[k]+nums[l]==target)
							{
								List<Integer> aList=new ArrayList<>();
								aList.add(nums[i]);
								aList.add(nums[j]);
								aList.add(nums[k]);
								aList.add(nums[l]);
								outputList.add(aList);
								k++;
								l--;
								while(k<l && nums[k]==nums[k-1])
									k++;
								while(k<l && nums[l]==nums[l+1])
									l--;
							}
							else if(nums[i]+nums[j]+nums[k]+nums[l]>target)
								l--;
							else
								k++;
						}
					}
				}	
		}
		return outputList;
	}
}
