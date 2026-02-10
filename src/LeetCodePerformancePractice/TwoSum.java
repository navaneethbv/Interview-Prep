package LeetCodePerformancePractice;

import java.util.Arrays;
import java.util.HashMap;
/*
 * Link :https://leetcode.com/problems/two-sum/
 */	
/**
 * Implementation of Two Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TwoSum {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs twoSum operation.
	 *
	 * @param inputArray the array to process
	 * @param target the target value
	 * @return the resulting array
	 */
	private static int[] twoSum(int[] inputArray, int target) {
		HashMap<Integer, Integer> map=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			map.put(inputArray[i], i);
		}
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			if(map.containsKey(target-inputArray[i]) && map.get(target-inputArray[i])!=i)
			{
				return new int[]{i,map.get(target-inputArray[i])};
			}
		}
		return null;
	}




}
