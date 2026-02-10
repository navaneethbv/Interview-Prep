package Warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of Simple Words Snapchat Assessment algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SimpleWordsSnapchatAssessment {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs simpleWords operation.
	 *
	 * @param words the array to process
	 * @return the resulting array
	 */
	static String[] simpleWords(String[] words) {
		Set<String> dictionary = new HashSet<>(Arrays.asList(words));
		ArrayList<String> outputList = new ArrayList<>();

		for (String word : words) {
			if (!isCompositeWord(word, dictionary)) {
				outputList.add(word);
			}
		}

		return outputList.toArray(new String[0]);
	}

	/**
	 * Checks if composite word.
	 *
	 * @param word the word parameter
	 * @param dictionary the dictionary parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isCompositeWord(String word, Set<String> dictionary) {
		boolean[] canBuild = new boolean[word.length() + 1];
		canBuild[0] = true;

		for (int end = 1; end <= word.length(); end++) {
			for (int start = 0; start < end; start++) {
				if (!canBuild[start]) {
					continue;
				}

				String part = word.substring(start, end);
				if (!dictionary.contains(part)) {
					continue;
				}

				// Skip using the original word as a single segment.
				// Check for null/base case
				if (start == 0 && end == word.length()) {
					continue;
				}

				canBuild[end] = true;
				break;
			}
		}

		return canBuild[word.length()];
	}
}
