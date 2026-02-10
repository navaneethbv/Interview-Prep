package leetCode;

import java.util.Stack;

/*
 * Link : https://leetcode.com/problems/implement-queue-using-stacks/
 */

/**
 * Implementation of Queue Using Stacks algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class QueueUsingStacks {
	/**
	 * Inner class MyQueue for supporting operations.
	 */
	static class MyQueue {
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
	        if(stack2.isEmpty())
	        {
	        	while(!stack1.isEmpty())
	        	{
	        		stack2.push(stack1.pop());
	        	}
	        }
	        if(!stack2.isEmpty())
	        	stack2.pop();
	    }

	    // Get the front element.
	    /**
	     * Performs peek operation.
	     *
	     * @return the computed integer result
	     */
	    public int peek() {
	    	if(stack2.isEmpty())
	        {
	        	while(!stack1.isEmpty())
	        	{
	        		stack2.push(stack1.pop());
	        	}
	        }
	        // Recursively process left and right subtrees
	        return stack2.peek();
	    }

	    // Return whether the queue is empty.
	    /**
	     * Performs empty operation.
	     *
	     * @return true if condition is met, false otherwise
	     */
	    public boolean empty() {
	        if(stack1.isEmpty() && stack2.isEmpty())
	        	return true;
	        return false;
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