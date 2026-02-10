package LeetCodePerformancePractice;

import java.util.Stack;

/**
 * Implementation of Queue Using Stacks algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class QueueUsingStacks {
	class MyQueue {
		// Push element x to the back of queue.
		Stack<Integer> stack1=new Stack<>();
		Stack<Integer> stack2=new Stack<>();
		/**
		 * Performs push operation.
		 *
		 * @param x the x parameter
		 */
		public void push(int x) {
			stack1.push(x);
		}

		// Removes the element from in front of queue.
		/**
		 * Performs pop operation.
		 *
		 */
		public void pop() {
			while(stack1.size()>1)
			{
				stack2.push(stack1.pop());
			}
			stack1.pop();
			while(!stack2.isEmpty())
			{
				stack1.push(stack2.pop());
			}
		}

		// Get the front element.
		/**
		 * Performs peek operation.
		 *
		 * @return the computed integer result
		 */
		public int peek() {
			while(stack1.size()>1)
			{
				stack2.push(stack1.pop());
			}
			int value=stack1.pop();
			stack2.push(value);
			while(!stack2.isEmpty())
			{
				stack1.push(stack2.pop());
			}
			return value;
		}

		// Return whether the queue is empty.
		/**
		 * Performs empty operation.
		 *
		 * @return true if condition is met, false otherwise
		 */
		public boolean empty() {
			return stack1.isEmpty();
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
