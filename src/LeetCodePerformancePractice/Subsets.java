package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Subsets algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Subsets {
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
	 * Performs subsets operation.
	 *
	 * @param nums the array to process
	 * @return the list of results
	 */
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> outputList=new ArrayList<>();
		// Check for null/base case
		if(nums==null||nums.length==0)
			return outputList;
		List<Integer> list=new ArrayList<>();
		outputList.add(new ArrayList<>(list));
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			getCombinations(nums,nums.length,i+1,0,list,outputList);
		}
		return outputList;

	}
	

	private static void getCombinations(int[] nums, int n, int k,int index, List<Integer> list,
			List<List<Integer>> outputList) {
		if(n<k )
			return;
		if(list.size()==k)
		{
			outputList.add(new ArrayList<>(list));
			return;
		}
		for (int i = index; i < nums.length; i++) {
			list.add(nums[i]);
			getCombinations(nums, n, k, i+1,list, outputList);
			list.remove(list.size()-1);
		}

	}
}
