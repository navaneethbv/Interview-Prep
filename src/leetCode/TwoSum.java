package leetCode;

/*
 * Link : https://leetcode.com/problems/two-sum/
*/
import java.util.Arrays;
/**
 * Implementation of Two Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TwoSum {
	/**
	 * Performs twoSum operation.
	 *
	 * @param nums the array to process
	 * @param target the target value
	 * @return the resulting array
	 */
	public static int[] twoSum(int[] nums, int target) {
		int startIndex=0,endIndex=nums.length-1;
		int mainArray[]=Arrays.copyOf(nums,nums.length);
		Arrays.sort(nums);
		while(true){

			if(nums[startIndex]+nums[endIndex]==target)
				break;
			if(nums[startIndex]+nums[endIndex]>target)
			{
				endIndex--;
			}
			else if(nums[startIndex]+nums[endIndex]<target)
			{
				startIndex++;
			}
		}
		boolean startIndexFlag=true,endIndexFlag=true;

		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(nums[startIndex]==mainArray[i] && startIndexFlag){
				startIndex=i;
				startIndexFlag=false;
			}
			else if(nums[endIndex]==mainArray[i] && endIndexFlag){
				endIndex=i;
				endIndexFlag=false;
			}
		}
		int output[]=new int[]{startIndex+1,endIndex+1};
		Arrays.sort(output);
		return output;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
		int[] nums1 = new int[]{2, 7, 11, 15};
		int target1 = 9;
		System.out.println("Input: " + Arrays.toString(nums1) + ", Target: " + target1);
		System.out.println("Output: " + Arrays.toString(twoSum(nums1, target1)));
		System.out.println();
		
		// Test Case 2: Edge case with negative numbers
		System.out.println("Test 2: Negative numbers");
		int[] nums2 = new int[]{-1, -2, -3, -4, -5};
		int target2 = -8;
		System.out.println("Input: " + Arrays.toString(nums2) + ", Target: " + target2);
		System.out.println("Output: " + Arrays.toString(twoSum(nums2, target2)));
		System.out.println();
		
		// Test Case 3: Edge case with duplicates
		System.out.println("Test 3: Duplicate values");
		int[] nums3 = new int[]{3, 3};
		int target3 = 6;
		System.out.println("Input: " + Arrays.toString(nums3) + ", Target: " + target3);
		System.out.println("Output: " + Arrays.toString(twoSum(nums3, target3)));
	}
}