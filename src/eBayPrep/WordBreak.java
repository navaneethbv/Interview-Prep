package eBayPrep;

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
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("aaaa");
		set.add("aaa");
		System.out.println(wordBreak("aaaaaaa", set));
		set=new HashSet<>();
		set.add("leet");
		set.add("code");
		System.out.println(wordBreak("leetcode", set));
		
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
		if(s.length()==0)
			return true;
		boolean helper[]=new boolean[s.length()];
		boolean foundTrue=false;
		// Iterate through all elements
		for (int i = 0; i < helper.length; i++) {
			String word=s.substring(0,i+1);
			if(wordDict.contains(word)){
				helper[i]=true;
				foundTrue=true;
			}
		}
		if(!foundTrue)return false;
		boolean output=false;
		// Iterate through all elements
		for (int i = 0; i < helper.length; i++) {
			if(helper[i])
				output|=wordBreak(s.substring(i+1), wordDict);
		}
		return output;
	}
}

