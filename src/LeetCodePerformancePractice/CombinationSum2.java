package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implementation of Combination Sum2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CombinationSum2 {
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
	 * Performs combinationSum2 operation.
	 *
	 * @param candidates the array to process
	 * @param target the target value
	 * @return the list of results
	 */
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> outputList=new ArrayList<>();
		// Check for null/base case
		if(candidates==null||candidates.length==0)
			return outputList;
		Arrays.sort(candidates);
		List<Integer> list=new ArrayList<>();
		dfs(candidates,target,0,0,list,outputList);
		return outputList;
	}
	/**
	 * Performs dfs operation.
	 *
	 * @param candidates the array to process
	 * @param target the target value
	 * @param index the index parameter
	 * @param sum the sum parameter
	 * @param list the list parameter
	 * @param outputList the outputList parameter
	 */
	private static void dfs(int[] candidates, int target, int index, int sum, List<Integer> list, List<List<Integer>> outputList) {
		if(sum>target)
			return;
		if(sum==target)
		{
			outputList.add(new ArrayList<>(list));
			return;
		}
		int prev=-1;
		for (int i = index; i < candidates.length; i++) {
			if(prev!=candidates[i]){
				list.add(candidates[i]);
				dfs(candidates, target, i+1, sum+candidates[i], list, outputList);
				list.remove(list.size()-1);
				prev=candidates[i];
			}
		}
	}
}

