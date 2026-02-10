package Practice;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of Decode Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DecodeNumber {
	
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs decode operation.
	 *
	 * @param prefix the prefix parameter
	 * @param code the code parameter
	 * @return the Set<String> result
	 */
	private static Set<String> decode(String prefix, String code) {
		Set<String> set = new HashSet<String>();
		// Check for null/base case
		if (code.length() == 0) {
			set.add(prefix);
			return set;
		}

		// Check for null/base case
		if (code.charAt(0) == '0')
			return set;

		set.addAll(decode(prefix + (char) (code.charAt(0) - '1' + 'a'),
				code.substring(1)));
		// Check for null/base case
		if (code.length() >= 2 && code.charAt(0) == '1') {
			set.addAll(decode(
					prefix + (char) (10 + code.charAt(1) - '1' + 'a'),
					code.substring(2)));
		}
		// Check for null/base case
		if (code.length() >= 2 && code.charAt(0) == '2'
				&& code.charAt(1) <= '6') {
			set.addAll(decode(
					prefix + (char) (20 + code.charAt(1) - '1' + 'a'),
					code.substring(2)));
		}
		return set;
	}
}
