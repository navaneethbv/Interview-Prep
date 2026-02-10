package LeetCodePractice;

import java.util.Stack;

/**
 * Implementation of Evaluate Reverse Polish Notation algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class EvaluateReversePolishNotation {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs evalRPN operation.
	 *
	 * @param tokens the array to process
	 * @return the computed integer result
	 */
	public static int evalRPN(String[] tokens) {
		Stack<String> stack=new Stack<String>();
		// Iterate through all elements
		for (int i = 0; i < tokens.length; i++) {
			String s=tokens[i];
			if(tokens[i].contentEquals("+") || tokens[i].contentEquals("-") 
					||tokens[i].contentEquals("*") ||tokens[i].contentEquals("/") )
			{
				int val1=Integer.parseInt(stack.pop());
				int val2=Integer.parseInt(stack.pop());		
				if(tokens[i].contentEquals("+"))
				{
					stack.push(val1+val2+"");
				}
				else if(tokens[i].contentEquals("-"))
				{
					stack.push(val2-val1+"");
				}
				else if(tokens[i].contentEquals("*"))
				{
					stack.push(val1*val2+"");
				}
				else{
					stack.push((int)(val2/val1)+"");
				}
			}
			else{
				stack.push(tokens[i]);
			}	
		}
		return Integer.parseInt(stack.peek());
	}
}

