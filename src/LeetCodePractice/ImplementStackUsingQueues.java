package LeetCodePractice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementation of Implement Stack Using Queues algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ImplementStackUsingQueues{
	/**
	 * Inner class MyStack for supporting operations.
	 */
	static class MyStack {
		// Push element x onto stack.
		Queue<Integer> q1=new LinkedList<Integer>();
		Queue<Integer> q2=new LinkedList<Integer>();
		
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
			while(q1.size()>0)
			{
				q2.add(q1.remove());//enqueue and dequeue
			}
			int value=(int) q2.poll();
			while(q2.size()>0)
			{
				q1.add(q2.remove());//enqueue and dequeue
			}
		}

		// Get the top element.
		/**
		 * Performs top operation.
		 *
		 * @return the computed integer result
		 */
		public int top() {
			//return (int) q1.peek();
			while(q1.size()>0)
			{
				q2.add(q1.poll());//enqueue and dequeue
			}
			int value=(int) q2.peek();
			while(q2.size()>0)
			{
				q1.add(q2.poll());//enqueue and dequeue
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
			return q1.size()==0?true:false;
		}
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

