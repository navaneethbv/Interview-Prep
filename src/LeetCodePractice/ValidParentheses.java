package LeetCodePractice;

import java.util.Stack;

/**
 * Implementation of Valid Parentheses algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ValidParentheses {

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
	 * Checks if valid.
	 *
	 * @param s the s parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isValid(String s) {
		Stack<Character> charStack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			switch (c){
			case '{':charStack.push(c);break;
			case '(':charStack.push(c);break;
			case '[':charStack.push(c);break;
			case ']':if(charStack.isEmpty())return false;char poppedChar=charStack.pop();
			if(poppedChar!='[')return false;break;
			case '}':if(charStack.isEmpty())return false;poppedChar=charStack.pop();
			if(poppedChar!='{')return false;break;
			case ')':if(charStack.isEmpty())return false;poppedChar=charStack.pop();
			if(poppedChar!='(')return false;break;
			default:break;
			}
		}
		return charStack.isEmpty()?true:false;
	}
