package Practice;

import java.util.HashSet;

/**
 * Implementation of String Shorten algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StringShorten {
	
	private static int count;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs shortenString operation.
	 *
	 * @param input the input parameter
	 * @return the resulting string
	 */
	private static String shortenString(String input) {
		String[] array = input.split(" "); StringBuilder sb = new StringBuilder();
		// Iterate through all elements
		for(int i = 0 ; i < array.length; i++) {
			sb.append(shortenWord(array[i]));
		}
		return sb.toString();
	}

	/**
	 * Performs shortenWord operation.
	 *
	 * @param string the string parameter
	 * @return the StringBuilder result
	 */
	private static StringBuilder shortenWord(String string) {
		String[] array = string.split(""); HashSet<String> set = new HashSet<String>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1 ; i < array.length - 1; i++) {
			if(!set.contains(array[i])){
				set.add(array[i]);
				count ++;
			}
		}	sb.append(array[0]);	
		sb.append(count);
		sb.append(array[array.length-1]);
		return sb;
	}
}
