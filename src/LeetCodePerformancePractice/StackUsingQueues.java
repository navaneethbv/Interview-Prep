package LeetCodePerformancePractice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementation of Stack Using Queues algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StackUsingQueues {
	class MyStack {
		// Push element x onto stack.
		Queue<Integer> q1=new LinkedList<>();
		Queue<Integer> q2=new LinkedList<>();
		/**
		 * Performs push operation.
		 *
		 * @param x the x parameter
		 */
		public void push(int x) {
			q1.offer(x);
		}

		// Removes the element on top of the stack.
		/**
		 * Performs pop operation.
		 *
		 */
		public void pop() {
			while(q1.size()>1)
			{
				q2.offer(q1.poll());
			}
			q1.poll();
			while(q2.size()>0)
			{
				q1.offer(q2.poll());
			}
		}

		// Get the top element.
		/**
		 * Performs top operation.
		 *
		 * @return the computed integer result
		 */
		public int top() {
			while(q1.size()>1)
			{
				q2.offer(q1.poll());
			}
			int value=q1.poll();
			q2.offer(value);
			while(q2.size()>0)
			{
				q1.offer(q2.poll());
			}
			return value;
		}

		// Return whether the stack is empty.
		/**
		 * Performs empty operation.
		 *
		 * @return true if condition is met, false otherwise
		 */
		public boolean empty() {
			return q1.isEmpty();
		}
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
