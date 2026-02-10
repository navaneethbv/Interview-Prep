package appleInterview;

/**
 * Implementation of Prep Doc Remove Duplicate Characters algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocRemoveDuplicateCharacters {
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
		char c=str.charAt(0);
		for (int j = 1; j < str.length(); j++) {
			char newChar=str.charAt(j);
			if(c==newChar)
			{
				str=str.substring(0,j)+str.substring(j+1);
				j--;
			}
			else{
				c=newChar;
			}
		}
		return str;
	}
}
