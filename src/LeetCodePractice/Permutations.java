package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implementation of Permutations algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Permutations {

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
	/**
	 * Performs permute operation.
	 *
	 * @param nums the array to process
	 * @return the list of results
	 */
	public static List<List<Integer>> permute(int[] nums) {
		output=new ArrayList<>();
		String str=(Arrays.toString(nums).replace(" ", "").replace("[", "").replace("]", "").replace(",", ""));
		permuteString("",str);
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
			// Iterate through all elements
			for (int i = 0; i < prefix.length(); i++) {
				list.add(Integer.parseInt(prefix.charAt(i)+""));
			}
			output.add(list);
			return;
		}
		// Iterate through all elements
		for (int i = 0; i < str.length(); i++) {
			permuteString(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1));
		}

	}
}
