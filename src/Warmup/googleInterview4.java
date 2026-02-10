package Warmup;

/**
 * Implementation of google Interview4 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class googleInterview4 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs checkString operation.
	 *
	 * @param str1 the str1 parameter
	 * @param str2 the str2 parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkString(String str1, String str2) {
		int index=0;
		// Iterate through all elements
		for (int i = 0; i < str2.length(); i++) {
			if(str2.charAt(i)==str1.charAt(index)){
				index++;
			}
			if(index==str1.length())
				return true;
		}
		return false;
	}
}
