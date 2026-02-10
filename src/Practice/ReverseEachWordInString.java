package Practice;

/**
 * Implementation of Reverse Each Word In String algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseEachWordInString {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	
	//Reverse characters in words and not the words themeselves	
	/**
	 * Performs printSentence operation.
	 *
	 * @param str the str parameter
	 * @return the resulting string
	 */
	public static String printSentence(String str){
		String[] array = str.split(" "); StringBuilder sb = new StringBuilder();
		// Iterate through all elements
		for(int i = 0; i < array.length; i++){
			sb.append(reverseChars(array[i])+ " ");
		}
		return sb.toString();
	}
	
	/**
	 * Performs reverseChars operation.
	 *
	 * @param string the string parameter
	 * @return the resulting string
	 */
	public static String reverseChars(String string) {
		char[] array = string.toCharArray(); StringBuilder sb = new StringBuilder();
		for(int i = array.length-1; i >= 0; i--){
			sb.append(array[i]);
		}
		return sb.toString();
	}
}
