package LeetCodePractice;

import java.util.Stack;

/**
 * Implementation of Min Stack algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MinStack {
	static Stack<Integer> stack;
	static Stack<Integer> minStack;
	public _155MinStack() {
		stack=null;
		minStack=null;
	}

	/**
	 * Performs push operation.
	 *
	 * @param x the x parameter
	 */
	public void push(int x) {
		// Check for null/base case
		if(stack==null){
			minStack=null;
			stack=new Stack<>();
		}
		stack.push(x);
		// Check for null/base case
		if(minStack==null||minStack.isEmpty())
		{
			minStack=new Stack<>();
			minStack.push(x);
		}
		else{
			minStack.push(Math.min(minStack.peek(), x));
		}
	}

	/**
	 * Performs pop operation.
	 *
	 */
	public void pop() {
		stack.pop();
	}

	/**
	 * Performs top operation.
	 *
	 * @return the computed integer result
	 */
	public int top() {
		return stack.peek();

	}

	/**
	 * Retrieves min from the data structure.
	 *
	 * @return the computed integer result
	 */
	public int getMin() {
		return minStack.pop();

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

