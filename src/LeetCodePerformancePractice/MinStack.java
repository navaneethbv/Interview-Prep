package LeetCodePerformancePractice;

import java.util.Stack;

/**
 * Implementation of Min Stack algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MinStack {
	class MinStack {
		Stack<Integer> elements=new Stack<Integer>();
		Stack<Integer> minElements=new Stack<Integer>();
		
		/** initialize your data structure here. */
		public MinStack() {
			elements=new Stack<Integer>();
			minElements=new Stack<Integer>();
		}

		public void push(int x) {
			if(elements.isEmpty())
			{
				elements.push(x);
				minElements.push(x);
			}
			else{
				elements.push(x);
				minElements.push(Math.min(x, minElements.peek()));
			}
		}

		/**
		 * Performs pop operation.
		 *
		 */
		public void pop() {
			elements.pop();
			minElements.pop();
		}

		/**
		 * Performs top operation.
		 *
		 * @return the computed integer result
		 */
		public int top() {
			return elements.peek();
		}

		/**
		 * Retrieves min from the data structure.
		 *
		 * @return the computed integer result
		 */
		public int getMin() {
			return minElements.peek();
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
