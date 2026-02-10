package leetCode;

import java.util.Stack;

/*
 * Link : https://leetcode.com/problems/valid-parentheses/
 */

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
		Stack<Character> characterStack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			char element=s.charAt(i);
			if(element=='('||element=='{'||element=='[')
			{
				characterStack.push(element);
			}
			else{
				if(!characterStack.isEmpty()){
					char poppedElement=characterStack.pop();
					if(!((element==')' && poppedElement=='(')
							||(element=='}' && poppedElement=='{')
							||(element==']' && poppedElement=='[')))
						return false;
				}
				else{
					return false;
				}
			}
		}
		return characterStack.isEmpty()?true:false;
	}
	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
	}
	}