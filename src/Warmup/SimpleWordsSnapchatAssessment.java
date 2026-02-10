package Warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SimpleWordsSnapchatAssessment {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(simpleWords(
				new String[] { "chat", "ever", "snapchat", "snap", "salesperson", "per", "person", "sales", "son",
						"whatsoever", "what", "so" })));
	}

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
