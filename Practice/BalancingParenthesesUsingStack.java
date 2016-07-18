package Practice;

import java.util.*;

public class BalancingParenthesesUsingStack {
	public static void main(String[] args) {
		String brackets = "[{()[]}({[]})]";
		if(isBalanced(brackets)) {
			System.out.println("The parentheses are balanced");
		} else {
			System.out.println("The parentheses are not balanced");
		}
	}

	private static boolean isBalanced(String brackets) {
		String[] array = brackets.split("");
		Stack<String> stack = new Stack<String>();
		
		if(brackets.length() == 0) {
			return true;
		}
		
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
