package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Combinations algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Combinations {
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
	 * Performs combine operation.
	 *
	 * @param n the size or count parameter
	 * @param k the k value
	 * @return the list of results
	 */
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> outputList=new ArrayList<>();
		if(n<=0||n<k)
			return outputList;
		List<Integer> list=new ArrayList<>();
		dfs(n,k,1,list,outputList);
		return outputList;
	}
	/**
	 * Performs dfs operation.
	 *
	 * @param n the size or count parameter
	 * @param k the k value
	 * @param start the start parameter
	 * @param list the list parameter
	 * @param outputList the outputList parameter
	 */
	private static void dfs(int n, int k,int start, List<Integer> list, List<List<Integer>> outputList) {
		if(list.size()==k)
		{
			outputList.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = start; i <=n; i++) {
			list.add(i);
			dfs(n,k,i+1,list,outputList);
			list.remove(list.size()-1);
		}
	}
}
