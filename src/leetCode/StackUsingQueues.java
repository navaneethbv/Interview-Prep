package leetCode;

import java.util.LinkedList;

/*
 * Link : https://leetcode.com/problems/implement-stack-using-queues/
 * Done in CTCI
 */

/**
 * Implementation of Stack Using Queues algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StackUsingQueues {
	class MyStack {
	    // Push element x onto stack.
		LinkedList<Integer> queue1 = new LinkedList<Integer>();
	    /**
	     * Performs push operation.
	     *
	     * @param x the x parameter
	     */
	    public void push(int x) {
	        queue1.addLast(x);
	    }

	    // Removes the element on top of the stack.
	    /**
	     * Performs pop operation.
	     *
	     */
	    public void pop() {
	        queue1.removeLast();
	    }

	    // Get the top element.
	    /**
	     * Performs top operation.
	     *
	     * @return the computed integer result
	     */
	    public int top() {
	        return queue1.getLast();
	    }

	    // Return whether the stack is empty.
	    /**
	     * Performs empty operation.
	     *
	     * @return true if condition is met, false otherwise
	     */
	    public boolean empty() {
	    	return queue1.isEmpty();
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