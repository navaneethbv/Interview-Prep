package LeetCodePerformancePractice;

import java.util.Arrays;

/**
 * Implementation of Three Sum Closest algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ThreeSumClosest {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs threeSumClosest operation.
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @return the computed integer result
	 */
	private static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int maxDiff=Integer.MAX_VALUE;
		int maxValue=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length-2; i++) {
			// Check for null/base case
			if(i==0||nums[i]>nums[i-1])
			{
				int j=i+1;
				int k=nums.length-1;
				while(j<k)
				{
					int value=nums[i]+nums[j]+nums[k];
					int diff=Math.abs(target-value);
					// Check for null/base case
					if(diff==0)
						return target;
					if(diff<maxDiff)
					{
						maxValue=value;
						maxDiff=diff;
					}
					if(value>target)
						k--;
					else
						j++;
				}
			}
		}
		return maxValue;
	}
	
}
