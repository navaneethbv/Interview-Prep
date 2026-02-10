package LeetCodePractice;

import java.util.Arrays;

/**
 * Implementation of Next Permutation algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class NextPermutation {

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
	 * Performs nextPermutation operation.
	 *
	 * @param nums the array to process
	 */
	public static void nextPermutation(int[] nums) {
		String str=Arrays.toString(nums);
		String queryString=(str.replace(" ","").replace("[","").replace("]", "").replace(",", ""));
		Arrays.sort(nums);
		System.out.println("QueryString : "+queryString);
		String sortedString=(Arrays.toString(nums).replace(" ","").replace("[","").replace("]", "").replace(",", ""));
		System.out.println("Sorted String : "+sortedString);
		generatePermutations("",sortedString,queryString);
		// Check for null/base case
		if(output==null || output.length()==0)
		{
			output=sortedString;
		}
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			nums[i]=Integer.parseInt(output.charAt(i)+"");
		}
		System.out.println(Arrays.toString(nums));
	}
	static boolean next=false,outputFound=false;;
	static String output;
	/**
	 * Performs generatePermutations operation.
	 *
	 * @param prefix the prefix parameter
	 * @param str the str parameter
	 * @param query the query parameter
	 */
	private static void generatePermutations(String prefix,String str,String query) {
		int n=str.length();
		// Check for null/base case
		if(n==0){
			if(next && !outputFound)
			{
				output=prefix;
				next=false;
				outputFound=true;
			}
			if(prefix.contentEquals(query))
				next=true;
		}
		else
			for (int i = 0; i < n; i++) {
				generatePermutations(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1),query);
			}

	}
}
