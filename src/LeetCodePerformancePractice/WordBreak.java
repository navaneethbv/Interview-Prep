package LeetCodePerformancePractice;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of Word Break algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class WordBreak {
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
		Set<String> set=new HashSet<>();
		set.add("leet");
		set.add("code");
		System.out.println(wordBreak("leetcode", set));
		set=new HashSet<>();
		set.add("aaa");
		set.add("aaaa");
		System.out.println(wordBreak("aaab", set));
	}
	/**
	 * Performs wordBreak operation.
	 *
	 * @param s the s parameter
	 * @param wordDict the wordDict parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean wordBreak(String s, Set<String> wordDict) {
		// Check for null/base case
		if(s==null||s.length()==0)
			return true;
		return checkWordBreaking(s,0,wordDict);
	}
	/**
	 * Performs checkWordBreaking operation.
	 *
	 * @param s the s parameter
	 * @param start the start parameter
	 * @param wordDict the wordDict parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkWordBreaking(String s, int start, Set<String> wordDict) {
		if(start>s.length())
			return false;
		if(start==s.length())
			return true;
		for (int i = start+1; i <=s.length(); i++) {
			String str=s.substring(start,i);
			if(wordDict.contains(str) && checkWordBreaking(s, i, wordDict))
			{
				return true;
			}
		}
		return false;
	}

}