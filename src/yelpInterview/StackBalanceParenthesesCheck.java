package yelpInterview;

import java.util.Stack;

/**
 * Implementation of Stack Balance Parentheses Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StackBalanceParenthesesCheck {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Checks if valid parentheses.
	 *
	 * @param string the string parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isValidParentheses(String string) {
		Stack<Character> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			switch(c){
			case '{':stack.push(c);break;
			case '(':stack.push(c);break;
			case '[':stack.push(c);break;
			case '}':
				if(stack.peek()=='{'){
					stack.pop();
					break;
				}
				else
					return false;
			case ']':
				if(stack.peek()=='['){
					stack.pop();
					break;
				}
				else
					return false;
			case ')':
				if(stack.peek()=='('){
					stack.pop();
					break;
				}
				else
					return false;

			}
		}
		return stack.isEmpty();
	}

	}

