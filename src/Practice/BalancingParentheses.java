package Practice;

/**
 * Implementation of Balancing Parentheses algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BalancingParentheses {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		String expression = ")(";
		if(isBalanced(expression)) {
			System.out.println("The parentheses are balanced");
		} else {
			System.out.println("The parentheses are not balanced");
		}
	}

	/**
	 * Checks if balanced.
	 *
	 * @param expression the expression parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isBalanced(String expression) {
		if(expression.length() %2 != 0) {
			return false;
		}
		// Check for null/base case
		if(expression.length() == 0) {
			return true;
		}
		String[] array = expression.split("");
		if((array[0].equals(")"))||(array[0].equals("}"))) {
			return false;
	}
		int small_parentheses = 0, square_parentheses = 0, flower_parentheses = 0;
		for(int i = 0; i < array.length; i++) {
			if(small_parentheses < 0 || square_parentheses < 0 || flower_parentheses < 0) {
				return false;
			} else {
				if(array[i].equals("(")) {
					small_parentheses++;
				} else if(array[i].equals(")")) {
					small_parentheses--;
				} else if(array[i].equals("[")) {
					square_parentheses++;
				} else if(array[i].equals("]")) {
					square_parentheses--;
				} else if(array[i].equals("{")) {
					flower_parentheses++;
				} else if(array[i].equals("}")) {
					flower_parentheses--;
				}
			}
		}
		//System.out.println(small_parentheses+" "+square_parentheses+" "+flower_parentheses);
		if( (small_parentheses == 0) && (square_parentheses == 0) && (flower_parentheses == 0)){
			return true;
		} else {		
			return false;
		}
	}
}
