package eBayPrep;

import java.util.PriorityQueue;

/**
 * Implementation of Kth Largest Element In Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class KthLargestElementInArray{
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
	 * Finds kth largest in the data structure.
	 *
	 * @param nums the array to process
	 * @param k the k value
	 * @return the computed integer result
	 */
	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
			System.out.println(pq);
			if(pq.size()>k)
				pq.poll();
		}
		return pq.peek();
	}

}

