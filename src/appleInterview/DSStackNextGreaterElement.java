package appleInterview;

import java.util.Stack;
/*
 * http://stackoverflow.com/questions/19720349/find-next-higher-element-in-an-array-for-each-element
*/
/**
 * Implementation of DS Stack Next Greater Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSStackNextGreaterElement {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs nextGreaterElement operation.
	 *
	 * @param inputArray the array to process
	 */
	private static void nextGreaterElement(int[] inputArray) {
		Stack<Integer> stack=new Stack<>();
		stack.push(inputArray[0]);
		for (int i = 1; i < inputArray.length; i++) {
			//	System.out.println(stack.peek()+"/"+inputArray[i]);
			if(stack.isEmpty())
			{
				stack.push(inputArray[i]);
			}
			else{
				while(!stack.isEmpty() && stack.peek()<inputArray[i])
				{
					System.out.println(stack.pop()+"->"+inputArray[i]);
				}
				stack.push(inputArray[i]);
			}
		}
		while(!stack.isEmpty())
			System.out.println(stack.pop()+"->-1");
	}
}
