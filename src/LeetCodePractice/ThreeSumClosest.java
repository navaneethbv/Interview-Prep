package LeetCodePractice;

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
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs threeSumClosest operation.
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @return the computed integer result
	 */
	public static int threeSumClosest(int[] nums, int target) {
		int posDiff=Integer.MAX_VALUE;
		int negDiff=Integer.MIN_VALUE;
		if(nums.length==3)
			return nums[0]+nums[1]+nums[2];
		Arrays.sort(nums);
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			int pointer=i;
			int left=0;
			int right=nums.length-1;
			while(left<right)
			{
				if(left==pointer){
					left++;
					continue;
				}

				if(right==pointer)
				{
					right--;
					continue;
				}

				int diff=nums[left]+nums[right]+nums[pointer]-target;
				//System.out.println(nums[left]+"/"+nums[right]+"/"+nums[pointer]+"/"+diff);
				if(diff>0)
				{
					posDiff=Math.min(diff,posDiff);
					right--;
				}
				else if(diff<0)
				{
					negDiff=Math.max(diff,negDiff);
					left++;
				}
				else
					return target;
			}
		}
		int value=Math.min(posDiff+target,-negDiff+target);
		return value==Integer.MIN_VALUE?nums[0]:value;
	}
}
