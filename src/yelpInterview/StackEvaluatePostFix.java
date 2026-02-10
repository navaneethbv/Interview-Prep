package yelpInterview;

import java.util.Stack;

/**
 * Implementation of Stack Evaluate Post Fix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StackEvaluatePostFix {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs evaluate operation.
	 *
	 * @param string the string parameter
	 * @return the computed integer result
	 */
	private static int evaluate(String string) {
		Stack<Integer> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			if(Character.isDigit(c))
			{
				stack.push(Integer.parseInt(c+""));
			}
			else{
				if(stack.isEmpty())
				{
					return -1;
				}
				else{
					int value1=stack.pop();
					if(stack.isEmpty())
					{
						return -1;
					}
					else{
						int value2=stack.pop();
						stack.push(handle(value1,value2,c));
					}
				}
			}
		}
		return stack.isEmpty()?-1:stack.pop();
	}

	/**
	 * Performs handle operation.
	 *
	 * @param value1 the value1 parameter
	 * @param value2 the value2 parameter
	 * @param c the c parameter
	 * @return the Integer result
	 */
	private static Integer handle(int value1, int value2, char c) {
		switch(c){
		case '+':return value1+value2;
		case '-':return value1-value2;
		case '/':return value1/value2;
		case '*':return value1*value2;
		default:break;
		}
		return null;
	}
}

