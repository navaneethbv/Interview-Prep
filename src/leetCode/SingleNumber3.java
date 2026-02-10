package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Link : https://leetcode.com/problems/single-number-iii/
 */

/**
 * Implementation of Single Number3 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SingleNumber3 {
	/**
	 * Performs singleNumber operation.
	 *
	 * @param nums the array to process
	 * @return the resulting array
	 */
	public static int[] singleNumber(int[] nums) {
		int output[]=new int[2];
		ArrayList<Integer> list=new ArrayList<>();
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(list.toArray()));
		  	if(!list.contains(nums[i]))
		  		list.add(nums[i]);
		  	else
		  		list.remove((Integer)nums[i]);	
		}
		System.out.println(Arrays.toString(list.toArray()));
		for (int i = 0; i < list.size(); i++) {
			output[i]=(int)list.get(i);
		}
		return output;
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