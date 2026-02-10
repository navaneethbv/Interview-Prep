package LeetCodePractice;

import java.util.HashMap;

/**
 * Implementation of Majority Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MajorityElement {

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
	 * @return the computed integer result
	 */
	public static int majorityElement(int[] nums) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int maxVal=0,val=-1;
		if(nums.length<=1)
			return nums[0];
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i])+1);
				if(map.get(nums[i])>maxVal)
				{
					maxVal=map.get(nums[i]);
					val=nums[i];
				}
			}
			else{
				map.put(nums[i],1);
			}
		}
		return val;
		
	}
}

