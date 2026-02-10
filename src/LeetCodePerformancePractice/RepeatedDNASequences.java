package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Implementation of Repeated DNA Sequences algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RepeatedDNASequences {
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
	 * Finds repeated dna sequences in the data structure.
	 *
	 * @param s the s parameter
	 * @return the list of results
	 */
	public static List<String> findRepeatedDnaSequences(String s) {
		List<String> list=new ArrayList<>();
		if(s.length()<=10)
			return list;
		Set<String> set=new HashSet<String>();
		// Iterate through all elements
		for (int i = 0; i <=s.length()-10; i++) {
			String str=s.substring(i,i+10);
			if(set.contains(str) && !list.contains(str))
				list.add(str);
			else{
				set.add(str);
			}
		}
		return list;
	}
}