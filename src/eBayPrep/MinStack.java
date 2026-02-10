package eBayPrep;

/**
 * Implementation of Min Stack algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MinStack {
	int[] stack;
	int[] minStack;
	int pointer=-1;
	/**
	 * Performs push operation.
	 *
	 * @param x the x parameter
	 */
	public void push(int x) {
		// Check for null/base case
		if(stack==null||pointer==-1)
		{
			pointer++;
			stack=new int[10000];
			minStack=new int[10000];
			stack[pointer]=x;
			minStack[pointer]=x;
		}
		else{
			pointer++;
			stack[pointer]=x;
			minStack[pointer]=Math.min(minStack[pointer-1],x);
		}
	}

	/**
	 * Performs pop operation.
	 *
	 */
	public void pop() {
		pointer--;
	}

	/**
	 * Performs top operation.
	 *
	 * @return the computed integer result
	 */
	public int top() {
		return stack[pointer];
	}

	/**
	 * Retrieves min from the data structure.
	 *
	 * @return the computed integer result
	 */
	public int getMin() {
		return minStack[pointer];
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		_155MinStack a=new _155MinStack();
		a.push(-2);
		System.out.println(a.getMin());
		a.push(0);
		System.out.println(a.getMin());
		a.push(-3);
		System.out.println(a.getMin());
	}
}

