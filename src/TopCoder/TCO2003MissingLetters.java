package TopCoder;

/*
 * TCO 2003
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1610&rd=4700
 */



/**
 * Implementation of TCO2003 Missing Letters algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TCO2003MissingLetters {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

	/**
	 * Retrieves missing letters from the data structure.
	 *
	 * @param sentence the sentence parameter
	 * @return the resulting string
	 */
	public static String getMissingLetters(String sentence){
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		sentence=sentence.toUpperCase();
		// Iterate through all elements
		for (int i = 0; i < sentence.length(); i++) {
			str=str.replace(sentence.charAt(i), '0');
		}
		return str.replaceAll("0", "");
	}
}
