package Practice;
/*
 * given a string,which is filled with either "(" or ")", for   example "(())()())", 
 * write a function to check if the string is "proper". A "proper" string means if there is a "(" in the string, 
 * there should be a ")" which corresponds to the "(" in the string. For example, "))()(" is improper
 */
/**
 * Implementation of Brackets Are Proper algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BracketsAreProper {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		String brackets = "))()(";
		if(areBracketsProper(brackets)) {
			System.out.println("Brackets are proper");;
		} else
			System.out.println("Brackets are improper");
	}

	/**
	 * Performs areBracketsProper operation.
	 *
	 * @param brackets the brackets parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean areBracketsProper(String brackets) {
		String[] array = brackets.split(""); 
		int open_bracket_length = 0, closed_bracket_length = 0;
		if(array.length %2 != 0){
			return false;
		}
		// Iterate through all elements
		for(int i = 0 ; i < array.length; i++) {
			if(array[i].equals("(")) {
				open_bracket_length++;
			} else {
				closed_bracket_length++;
			}
		}
		if(open_bracket_length != closed_bracket_length) {
			return false;
		}
		return true;
	}
}
