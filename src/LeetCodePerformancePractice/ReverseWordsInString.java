package LeetCodePerformancePractice;

import java.util.Arrays;

/**
 * Implementation of Reverse Words In String algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseWordsInString {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
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
	 * Performs reverseWords operation.
	 *
	 * @param s the s parameter
	 * @return the resulting string
	 */
	public static String reverseWords(String s) {
	    // Check for null/base case
	    if(s==null||s.length()==0)return s;
		s=s.trim().replaceAll("[ ]+", " ");
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
		StringBuilder sb=new StringBuilder();
		for (int i = str.length-1; i >=0; i--) {
			if(i!=0)
			{
				sb.append(str[i]+" ");
			}
			else
				sb.append(str[i]);
		}
		return sb.toString();
	}
}
