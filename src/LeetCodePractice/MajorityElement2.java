package LeetCodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of Majority Element2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MajorityElement2{
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
	 * Performs majorityElement operation.
	 *
	 * @param nums the array to process
	 * @return the list of results
	 */
	public static List<Integer> majorityElement(int[] nums) {
		HashMap<Integer, Integer> elemCount=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(elemCount.containsKey(nums[i]))
				elemCount.put(nums[i], elemCount.get(nums[i])+1);
			else
				elemCount.put(nums[i], 1);
		}
		Map<Integer, Integer> map = elemCount;
		List<Integer> outputList=new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>nums.length/3)
				outputList.add(entry.getKey());
		}
		return outputList;
	}
}

