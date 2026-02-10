package appleInterview;

import java.util.Stack;

/**
 * Implementation of DS Stack Balance Parentheses algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSStackBalanceParentheses {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs balanceParentheses operation.
	 *
	 * @param string the string parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean balanceParentheses(String string) {
		Stack<Character> charStack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			switch(c){
			case '(':charStack.push(c);break;
			case '{':charStack.push(c);break;
			case '[':charStack.push(c);break;
			case ')':if(charStack.peek()!='(')return false;charStack.pop();break;
			case '}':if(charStack.peek()!='{')return false;charStack.pop();break;
			case ']':if(charStack.peek()!='[')return false;charStack.pop();break;
			default:break;
			}
		}
		return charStack.isEmpty();
	}
