package Practice;

/**
 * Implementation of Remove Duplicate Characters algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RemoveDuplicateCharacters {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Removes chars from the data structure.
	 *
	 * @param str the str parameter
	 * @return the resulting string
	 */
	private static String removeChars(String str) {
		StringBuilder sb = new StringBuilder();
		if(str.length() != 0) {
			sb.append(str.charAt(0));
		}
		// Iterate through all elements
		for(int i = 0; i < str.length() - 1; i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				sb.append(str.charAt(i+1));
			}
		}
		return sb.toString();
	}
}

