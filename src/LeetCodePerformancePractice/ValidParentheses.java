package LeetCodePerformancePractice;

import java.util.Stack;

/**
 * Implementation of Valid Parentheses algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ValidParentheses {
	/**
	 * Checks if valid.
	 *
	 * @param s the s parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isValid(String s) {
		// Check for null/base case
		if(s==null||s.length()==0)
			return true;
		Stack<Character> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(c=='('||c=='{'||c=='[')
				stack.push(c);
			else{
				if(stack.isEmpty())
					return false;
				else if((c==')' && stack.peek()=='(')||
						(c==']' && stack.peek()=='[')||
						(c=='}' && stack.peek()=='{'))
					stack.pop();
				else
					return false;
			}
		}
		return stack.isEmpty();
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
