package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Implementation of Subsets2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Subsets2 {

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
	 * Performs subsetsWithDup operation.
	 *
	 * @param nums the array to process
	 * @return the list of results
	 */
	public  static List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> outputList=new ArrayList<>();
		Arrays.sort(nums);
		Set<String> set=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			List<List<Integer>> tempList=new ArrayList<>();
			// Inner loop to check combinations
			for (int j = 0; j < outputList.size(); j++) {
				tempList.add(new ArrayList<>(outputList.get(j)));
			}
			// Inner loop to check combinations
			for (int j = 0; j < tempList.size(); j++) {
				List<Integer> list=tempList.get(j);
				list.add(nums[i]);
			}
			List<Integer> singleElementList=new ArrayList<>();
			singleElementList.add(nums[i]);
			String st=Arrays.toString(singleElementList.toArray());
			tempList.add(singleElementList);
			// Inner loop to check combinations
			for (int j = 0; j < tempList.size(); j++) {
				List<Integer> ls=tempList.get(j);
				if(!set.contains(Arrays.toString(ls.toArray()))){
					set.add(Arrays.toString(ls.toArray()));
					outputList.add(ls);
				}
			}

		}
		outputList.add(new ArrayList<>());
		return outputList;
	}

}

