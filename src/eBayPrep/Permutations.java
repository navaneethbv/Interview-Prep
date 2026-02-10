package eBayPrep;

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
	static List<List<Integer>> outputList;
	/**
	 * Performs permute operation.
	 *
	 * @param nums the array to process
	 * @return the list of results
	 */
	public static List<List<Integer>> permute(int[] nums) {
		outputList=new ArrayList<>();
		printPermutations("",Arrays.toString(nums).replace(", ", "").replace("[", "").replace("]", ""));
		return outputList;

	}
	/**
	 * Performs printPermutations operation.
	 *
	 * @param prefix the prefix parameter
	 * @param str the str parameter
	 */
	private static void printPermutations(String prefix,String str) {
		// Check for null/base case
		if(str.length()==0){
			List<Integer> aList=new ArrayList<>();
			// Iterate through all elements
			for (int i = 0; i < prefix.length(); i++) {
				aList.add(Integer.parseInt(prefix.charAt(i)+""));
			}
			outputList.add(aList);
		}

		// Iterate through all elements
		for (int i = 0; i < str.length(); i++) {
			printPermutations(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1));
		}
	}
}
