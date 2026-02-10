package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Summary Ranges algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SummaryRanges {
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
	 * Performs summaryRanges operation.
	 *
	 * @param nums the array to process
	 * @return the list of results
	 */
	public static List<String> summaryRanges(int[] nums) {
		List<String> outputList=new ArrayList<>();
		// Check for null/base case
		if(nums==null||nums.length==0)
			return outputList;
		int start=nums[0],end=nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]==end+1)
			{
				end=nums[i];
			}
			else{
				if(start==end)
					outputList.add(start+"");
				else
					outputList.add(start+"->"+end);
				start=nums[i];
				end=nums[i];
			}
		}
		if(start==end)
			outputList.add(start+"");
		else
			outputList.add(start+"->"+end);
		return outputList;

	}
}
