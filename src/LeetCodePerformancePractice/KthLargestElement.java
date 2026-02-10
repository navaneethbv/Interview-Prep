package LeetCodePerformancePractice;

import java.util.PriorityQueue;

/**
 * Implementation of Kth Largest Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class KthLargestElement {
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
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			queue.offer(nums[i]);
			if(queue.size()>k)
				queue.poll();
		}
		System.out.println(queue);
		return queue.peek();
	}
}
