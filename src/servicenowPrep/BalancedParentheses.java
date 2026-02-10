package servicenowPrep;

import java.util.Stack;

/**
 * Implementation of Balanced Parentheses algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BalancedParentheses {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs evaluateParentheses operation.
	 *
	 * @param string the string parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean evaluateParentheses(String string) {
		Stack<Character> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			if(c=='('||c=='{'||c=='[')
				stack.push(c);
			else
			{
				if(stack.isEmpty())
					return false;
				else
				{
					if((stack.peek()=='(' && c==')')
							||(stack.peek()=='{' && c=='}')
							||(stack.peek()=='[' && c==']'))
					{
						stack.pop();
					}
					else
						return false;
				}
			}
		}
		return true;
	}

	}
