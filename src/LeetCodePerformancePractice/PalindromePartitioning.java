package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Palindrome Partitioning algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PalindromePartitioning {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
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
	/**
	 * Performs partition operation.
	 *
	 * @param s the s parameter
	 * @return the list of results
	 */
	public static List<List<String>> partition(String s) {
		List<List<String>> outputList=new ArrayList<>();
		// Check for null/base case
		if(s==null||s.length()==0)
			return outputList;
		List<String> list=new ArrayList<>();
		getCombinations(s,0,list,outputList);
		return outputList;
	}
	/**
	 * Retrieves combinations from the data structure.
	 *
	 * @param s the s parameter
	 * @param start the start parameter
	 * @param list the list parameter
	 * @param outputList the outputList parameter
	 */
	private static void getCombinations(String s, int start, List<String> list, List<List<String>> outputList) {
		if(start>s.length())
			return;
		if(start==s.length())
		{
			outputList.add(new ArrayList<>(list));
			return;
		}
		for (int i = start+1; i <=s.length(); i++) {
			String string=s.substring(start,i);
			if(isPalindrome(string)){
				list.add(string);
				getCombinations(s, i, list, outputList);
				list.remove(list.size()-1);
			}
		}
	}
	/**
	 * Checks if palindrome.
	 *
	 * @param string the string parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPalindrome(String string) {
		int start=0,end=string.length()-1;
		while(start<end)
		{
			if(string.charAt(start)!=string.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}


}