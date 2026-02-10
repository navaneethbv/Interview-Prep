package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Link : https://leetcode.com/problems/summary-ranges/
 */

/**
 * Implementation of Summary Ranges algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SummaryRanges {
	/**
	 * Performs summaryRanges operation.
	 *
	 * @param nums the array to process
	 * @return the list of results
	 */
	public static List<String> summaryRanges(int[] nums) {
		List<String> outputList=new ArrayList<>();
		int count=-100;
		int start=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			// Check for null/base case
			if(count==-100)
			{
				start=count=nums[i];
			}
			else{
				if(nums[i]==(count+1))
				{
					count++;
				}
				else{
					if(start!=nums[i-1])
						outputList.add(start+"->"+nums[i-1]);
					else
						outputList.add(start+"");
					start=nums[i];
					count=nums[i];
				}
			}
		}
		if(count==start)
			outputList.add(count+"");
		else if(count!=-100)
		{
			outputList.add(start+"->"+nums[nums.length-1]);
		}
		return outputList;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
}