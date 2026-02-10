package appleInterview;

import java.util.Arrays;

/**
 * Implementation of Prep Doc Number Of Words String algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocNumberOfWordsString {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Counts the number of words.
	 *
	 * @param str the str parameter
	 * @return the computed integer result
	 */
	private static int countWords(String str) {
		str=str.replaceAll("//s+", " ");
		String arr[]=str.split(" +");
		System.out.println(Arrays.toString(arr));
		return arr.length;
	}
}
