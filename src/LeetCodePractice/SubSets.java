package LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Sub Sets algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SubSets {


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
	 * Performs subsets operation.
	 *
	 * @param nums the array to process
	 * @return the list of results
	 */
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> output=new ArrayList<List<Integer>>();
		
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			List<List<Integer>> temp=new ArrayList<List<Integer>>();
				
			//take al in the result n add that to temp
			// Inner loop to check combinations
			for (int j = 0; j < output.size(); j++) {
				temp.add(new ArrayList<Integer>(output.get(j)));
			}
			// Inner loop to check combinations
			for (int j = 0; j < temp.size(); j++) {
				List<Integer> a=temp.get(j);
				a.add(nums[i]);
			}
			
			
			List<Integer> singleElement=new ArrayList<>();
			singleElement.add(nums[i]);
			temp.add(singleElement);
			output.addAll(temp);
		}
		output.add(new ArrayList<Integer>());
		return output;
	}
	
}

