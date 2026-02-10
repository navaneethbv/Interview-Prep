package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Permutations algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Permutations {
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
	 * Performs permute operation.
	 *
	 * @param nums the array to process
	 * @return the list of results
	 */
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> outputList=new ArrayList<>();
		// Check for null/base case
		if(nums==null||nums.length==0)
			return outputList;
		List<Integer> list=new ArrayList<>();
		dfs(nums,0,list,outputList);
		return outputList;
	}
	/**
	 * Performs dfs operation.
	 *
	 * @param nums the array to process
	 * @param index the index parameter
	 * @param list the list parameter
	 * @param outputList the outputList parameter
	 */
	private static void dfs(int[] nums, int index, List<Integer> list, List<List<Integer>> outputList) {
		if(list.size()>nums.length)
			return;
		if(list.size()==nums.length)
		{
			outputList.add(new ArrayList<>(list));
			return;
		}
		for (int i = index; i < nums.length; i++) {
			list.add(nums[i]);
			dfs(nums, i+1, list, outputList);
			list.remove(list.size()-1);
		}

	}
	/**
	 * Performs permute1 operation.
	 *
	 * @param prefix the prefix parameter
	 * @param str the str parameter
	 */
	public static void permute1(String prefix,String str) {
		// Check for null/base case
		if(str.length()==0)
		{
			System.out.println(prefix);
			return;
		}
		// Iterate through all elements
		for (int i = 0; i < str.length(); i++) {
			permute1(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1));
		}
	}
}

