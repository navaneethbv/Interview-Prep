package appleInterview;

import java.util.Stack;

/**
 * Implementation of DS Stack Reverse Stack Recursion algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSStackReverseStackRecursion {
	static Stack<Integer> stack=new Stack<>();
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		stack=new Stack<>();
		int[] arr=new int[]{1,2,3,4,5,6};
		populateStack(arr);
		//printStack();
		reverseStackUtil();
		printStack();
	}

	/**
	 * Performs printStack operation.
	 *
	 */
	private static void printStack() {
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop()+" ");
		}

	}

	/**
	 * Performs populateStack operation.
	 *
	 * @param arr the array to process
	 */
	private static void populateStack(int[] arr) {
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
	}

	/**
	 * Performs reverseStackUtil operation.
	 *
	 */
	private static void reverseStackUtil() {
		if(stack.isEmpty())
		{
			return;
		}
		else{
			int e=stack.pop();
			reverseStackUtil();
			insertBottom(e);
		}
	}
	/**
	 * Performs insertBottom operation.
	 *
	 * @param element the element parameter
	 */
	private static void insertBottom(int element) {
		if(stack.isEmpty())
		{
			stack.push(element);
			return;
		}
		else{
			int e=stack.pop();
			insertBottom(element);
			stack.push(e);
		}
	}
}
