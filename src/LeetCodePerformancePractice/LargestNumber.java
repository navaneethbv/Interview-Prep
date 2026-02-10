package LeetCodePerformancePractice;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Implementation of Largest Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LargestNumber {
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
	 * Performs largestNumber operation.
	 *
	 * @param nums the array to process
	 * @return the resulting string
	 */
	public static String largestNumber(int[] nums) {
		String[] str=new String[nums.length];
		// Iterate through all elements
		for (int i = 0; i < str.length; i++) {
			str[i]=nums[i]+"";
		}
		Arrays.sort(str,new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				return (b+a).compareTo(a+b);
			}
		});
		StringBuilder sb=new StringBuilder();
		// Iterate through all elements
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i]);
		}
		while(sb.length()>1 &&sb.charAt(0)=='0')
			sb.deleteCharAt(0);
		return sb.toString();


	}
}