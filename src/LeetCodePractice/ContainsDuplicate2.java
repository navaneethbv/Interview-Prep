package LeetCodePractice;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Implementation of Contains Duplicate2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ContainsDuplicate2{
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
	 * Performs containsNearbyDuplicate operation.
	 *
	 * @param nums the array to process
	 * @param k the k value
	 * @return true if condition is met, false otherwise
	 */
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i]))
			{
				ArrayList<Integer> aList=map.get(nums[i]);
				// Inner loop to check combinations
				for (int j = 0; j < aList.size(); j++) {
					if(-aList.get(j)+i<=k)
						return true;
				}
				aList.add(i);
				map.put(nums[i], aList);
			}
			else{
				ArrayList<Integer> aList=new ArrayList<>();
				aList.add(i);
				map.put(nums[i], aList);
			}
		}
		return false;
	}
}

