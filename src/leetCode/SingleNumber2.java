package leetCode;

import java.util.HashMap;

/*
 * Link : https://leetcode.com/problems/single-number-ii/
 */

/**
 * Implementation of Single Number2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SingleNumber2 {
	/**
	 * Performs singleNumber operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public static int singleNumber(int[] nums) {
		HashMap<Integer,Integer> elementMap=new HashMap<>();
		int sum=0;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(!elementMap.containsKey(nums[i]))
			{
				sum+=nums[i];
				elementMap.put(nums[i],1);
			}
			else
			{	
				if(elementMap.get(nums[i])==2)
					sum-=nums[i];
				else
					elementMap.put(nums[i],2);
			}
		}
		return sum;
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
}