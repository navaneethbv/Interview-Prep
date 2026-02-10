package Practice;

import java.util.*;

/**
 * Implementation of Balancing Parentheses Using Stack algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BalancingParenthesesUsingStack {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		String brackets = "[{()[]}({[]})]";
		if(isBalanced(brackets)) {
			System.out.println("The parentheses are balanced");
		} else {
			System.out.println("The parentheses are not balanced");
		}
	}

	/**
	 * Checks if balanced.
	 *
	 * @param brackets the brackets parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isBalanced(String brackets) {
		String[] array = brackets.split("");
		Stack<String> stack = new Stack<String>();
		
		// Check for null/base case
		if(brackets.length() == 0) {
			return true;
		}
		
		// Check for null/base case
		if(brackets.length() % 2 != 0 || brackets.equals(null) || array[0].equals(")") || array[0].equals("}") || array[0].equals("]")){
			return false;
	}
		
		for(int i = 0; i < brackets.length(); i++) {
			if(array[i].equals("(") || array[i].equals("{") || array[i].equals("[")) {
				stack.push(array[i]);
			} 
			else if(array[i].equals(")")) {
				if(stack.peek().equals("(")) {
					stack.pop();
				} else {
					return false;
				}
			} else if(array[i].equals("]")) {
				if(stack.peek().equals("[")) {
					stack.pop();
				} else {
					return false;
				}
			} else if(array[i].equals("}")) {
				if(stack.peek().equals("{")) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if(stack.size() != 0) {
			return false;
		}
		return true;
	}
}
