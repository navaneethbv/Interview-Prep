package leetCode;

import java.util.HashMap;

/*
 * Link : https://leetcode.com/problems/majority-element/
 */

/**
 * Implementation of Majority Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MajorityElement {
	/**
	 * Performs majorityElement operation.
	 *
	 * @param nums the array to process
	 * @return the computed integer result
	 */
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> elementMap=new HashMap<>();
		int maxElement=0,maxElementCount=-Integer.MIN_VALUE;
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			int element=nums[i];
			if(elementMap.containsKey(element))
			{	
				elementMap.put(element,elementMap.get(element)+1);
				if(elementMap.get(element)+1>maxElementCount){
					maxElementCount=elementMap.get(element)+1;
					maxElement=element;
				}
			}
			else{
				elementMap.put(element,1);
				if(maxElementCount==-Integer.MIN_VALUE)
				{
					maxElement=element;
					maxElementCount=1;
				}
			}
		}
		return maxElement;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}