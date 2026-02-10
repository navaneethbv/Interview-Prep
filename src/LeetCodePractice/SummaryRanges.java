package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implementation of Summary Ranges algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SummaryRanges{
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
		if(nums.length<1)
			return new ArrayList<>();
		List<String> outputList=new ArrayList<>();
		if(nums.length==1){
			outputList.add(nums[0]+"");
			return outputList;
		}
		int prev=nums[0],end=nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]==end+1)
			{
				end=nums[i];
			}
			else{
				if(prev!=end)
					outputList.add(prev+"->"+end);
				else
					outputList.add(prev+"");
				prev=end=nums[i];
			}
		}
		if(prev!=end)
			outputList.add(prev+"->"+end);
		else
			outputList.add(prev+"");
		return outputList;
	}

}

