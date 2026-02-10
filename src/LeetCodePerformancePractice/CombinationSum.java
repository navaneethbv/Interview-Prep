package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Implementation of Combination Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CombinationSum {
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
	 * Performs combinationSum operation.
	 *
	 * @param candidates the array to process
	 * @param target the target value
	 * @return the list of results
	 */
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> outputList=new ArrayList<>();
		// Check for null/base case
		if(candidates==null||candidates.length==0)
			return outputList;
		List<Integer> list=new ArrayList<>();
		dfs(candidates,target,0,0,list,outputList);
		return outputList;
	}
	static Set<List<Integer>> set=new HashSet<>();
	/**
	 * Performs dfs operation.
	 *
	 * @param candidates the array to process
	 * @param target the target value
	 * @param sum the sum parameter
	 * @param index the index parameter
	 * @param list the list parameter
	 * @param outputList the outputList parameter
	 */
	private static void dfs(int[] candidates, int target, int sum,int index,List<Integer> list, List<List<Integer>> outputList) {
		if(sum<0||sum>target)
			return;
		if(sum==target)
		{
			outputList.add(new ArrayList<>(list));
			return;
		}
		for (int i = index; i < candidates.length; i++) {
			list.add(candidates[i]);
			dfs(candidates, target, sum+candidates[i],i, list, outputList);
			list.remove(list.size()-1);
		}
	}
}

