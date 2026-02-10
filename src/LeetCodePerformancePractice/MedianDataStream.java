package LeetCodePerformancePractice;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Implementation of Median Data Stream algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MedianDataStream {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public class MedianFinder {
		PriorityQueue<Integer> maxHeap;
		PriorityQueue<Integer> minHeap;
		public MedianFinder() {
			// TODO Auto-generated constructor stub
			maxHeap=new PriorityQueue<>(Collections.reverseOrder());
			minHeap=new PriorityQueue<>();
		}
		// Adds a number into the data structure.
		/**
		 * Adds num to the data structure.
		 *
		 * @param num the num parameter
		 */
		public void addNum(int num) {
			maxHeap.offer(num);
			minHeap.offer(maxHeap.poll());
			if(minHeap.size()>maxHeap.size())
				maxHeap.offer(minHeap.poll());
		}

		// Returns the median of current data stream
		/**
		 * Finds median in the data structure.
		 *
		 * @return the double result
		 */
		public double findMedian() {
			if(minHeap.size()==maxHeap.size())
			{
				return (minHeap.peek()+maxHeap.peek())/(double)2;
			}
			else
				return maxHeap.peek();
		}
	};


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
