package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Implementation of Permutations2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Permutations2 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	static List<List<Integer>> output;
	static Set<String> set;
	/**
	 * Performs permuteUnique operation.
	 *
	 * @param nums the array to process
	 * @return the list of results
	 */
	public static List<List<Integer>> permuteUnique(int[] nums) {
		output=new ArrayList<>();
		set=new HashSet<>();
		String str=(Arrays.toString(nums).replace(" ", "").replace("[", "").replace("]", "").replace(",", ""));
		permuteString("",str);
		System.out.println(output);
		return output;
	}

	/**
	 * Performs permuteString operation.
	 *
	 * @param prefix the prefix parameter
	 * @param str the str parameter
	 */
	private static void permuteString(String prefix, String str) {
		// Check for null/base case
		if(str.length()==0)
		{	
			List<Integer> list=new ArrayList<>();
			if(!set.contains(prefix)){
				// Iterate through all elements
				for (int i = 0; i < prefix.length(); i++) {
					list.add(Integer.parseInt(prefix.charAt(i)+""));
				}
				output.add(list);
				set.add(prefix);
			}
			return;
		}
		// Iterate through all elements
		for (int i = 0; i < str.length(); i++) {
			permuteString(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1));
		}

	}
}
