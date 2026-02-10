package servicenowPrep;

import java.util.Stack;

/**
 * Implementation of Infix To Postfix algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class InfixToPostfix {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs convertToPostfix operation.
	 *
	 * @param string the string parameter
	 * @return the resulting string
	 */
	private static String convertToPostfix(String string) {
		StringBuilder sb=new StringBuilder("");
		Stack<Character> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			char c=string.charAt(i);
			if(Character.isLetter(c))
			{
				sb.append(c);
			}
			else{
				if(c=='(')
					stack.push(c);
				else if(c==')')
				{
					while(!stack.isEmpty())
					{
						sb.append(stack.pop());
					}
				}
				else{
					while(true && !stack.isEmpty())
					{
						char c1=stack.peek();
						if(c1>c)
						{
							sb.append(stack.pop());
						}
						else{
							stack.push(c);
							break;
						}
					}
					if(stack.isEmpty())
						stack.push(c);
				}
			}
		}
		while(!stack.isEmpty())
			sb.append(stack.pop());
		return sb.toString();
	}
}
