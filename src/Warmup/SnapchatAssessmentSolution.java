package Warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Implementation of Snapchat Assessment Solution algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SnapchatAssessmentSolution {


	static ArrayList<String> dictionaryList;
	static HashMap<String,Integer> pointerMap;
	/**
	 * Performs dictionaryHasWord operation.
	 *
	 * @param word the word parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean dictionaryHasWord(String word) {
		for (String dictionaryWord : dictionaryList) {
			if (dictionaryWord.equals(word))
				return true;
		}
		return false;
	}

	/**
	 * Performs breakWords operation.
	 *
	 * @param mainWord the mainWord parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean breakWords(String mainWord) {
		// Check for null/base case
		if(dictionaryList.size()==0)
			return false;
		boolean[] flagArray = new boolean[mainWord.length()];

		for (int i = 1; i <= mainWord.length(); i++) {
			if (dictionaryHasWord(mainWord.substring(0, i))) {
				flagArray[i - 1] = true;
			}
			if (flagArray[i - 1]) {
				for (int j = i + 1; j <= mainWord.length(); j++) {
					if (dictionaryHasWord(mainWord.substring(i, j))) {
						flagArray[j - 1] = true;
					}
				}
			}
		}
		return flagArray[mainWord.length() - 1];
	}
	/**
	 * Performs simpleWords operation.
	 *
	 * @param strArr the array to process
	 * @return the resulting array
	 */
	static String[] simpleWords(String[] strArr) {
		dictionaryList=new ArrayList<>();
		pointerMap=new HashMap<>();
		populatePointers(strArr);
		Arrays.sort(strArr,new LengthBasedStringSort());
		Map<String,Integer> outputMap=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < strArr.length; i++) {
			if(!breakWords(strArr[i])){
				outputMap.put(strArr[i],pointerMap.get(strArr[i]));
			}
			dictionaryList.add(strArr[i]);
		}
		Map<String,Integer> sortedMap = sortByValue(outputMap);
		String []outputArr=new String[sortedMap.size()];
		int counter=0;
		for (Map.Entry<String, Integer> entry : sortedMap.entrySet())
		{
			outputArr[counter]=entry.getKey();
			counter++;
		}
		return outputArr;
	}
	/**
	 * Performs populatePointers operation.
	 *
	 * @param strArr the array to process
	 */
	private static void populatePointers(String[] strArr) {
		// Iterate through all elements
		for (int i = 0; i < strArr.length; i++) {
			pointerMap.put(strArr[i], i);
		}
	}
	/**
	 * Inner class LengthBasedStringSort for supporting operations.
	 */
	public static class LengthBasedStringSort implements Comparator<String> {
		/**
		 * Performs compare operation.
		 *
		 * @param string1 the string1 parameter
		 * @param string2 the string2 parameter
		 * @return the computed integer result
		 */
		public int compare(String string1, String string2) {
			int difference = string1.length() - string2.length();
			// Recursively process left and right subtrees
			return difference != 0? difference: string1.compareTo(string2);
		}
	}
	/**
	 * Performs sortByValue operation.
	 *
	 * @param map the map parameter
	 * @return the Map<String,Integer> result
	 */
	public static Map<String,Integer> sortByValue(Map<String,Integer> map) {
		Map<String,Integer> outputMap = new TreeMap(new CompareValues(map));
		outputMap.putAll(map);
		return outputMap;
	}
	/**
	 * Inner class CompareValues for supporting operations.
	 */
	static class CompareValues implements Comparator {
		Map<String,Integer> map;

		public CompareValues(Map<String,Integer> map) {
			this.map = map;
		}

		/**
		 * Performs compare operation.
		 *
		 * @param keyA the keyA parameter
		 * @param keyB the keyB parameter
		 * @return the computed integer result
		 */
		public int compare(Object keyA, Object keyB) {
			Comparable comparableA = (Comparable) map.get(keyA);
			Comparable comparableB = (Comparable) map.get(keyB);
			// Recursively process left and right subtrees
			return comparableA.compareTo(comparableB);
		}
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(simpleWords(
				new String[]{"chat","ever","snapchat","snap","salesperson","per","person","sales","son","whatsoever","what","so"})));
		
		
		
		/*System.out.println(Arrays.toString(simpleWords(
				new String[]{"aaaaabababaaabbbababbbaaab",
						"ababbabaa",
						"baaaabbbbabbaabbbaababba",
						"baabaaabaaaaabaaabaaaabbbabbb",
						"aabbb",
						"ababbbaaabaaaaabbbbabaababbbbbabb",
						"bbabbbab",
						"baaa",
						"aabba",
						"aaaaaabaaa",
						"aabaabbbbabbbaabaaaaaaaaaaaa",
						"aaaba",
						"aaababbbabbabaa",
						"aaabb",
						"bbabb",
						"bbabaababaabb",
						"bbbbaabaabaaa",
						"bbaaaaaaa",
						"baab",
						"ababbbabaaaaaa",
						"aabbabbbabbbbabbaaaabaaaba",
						"baaabbbbb",
						"babaababbbabb",
						"bbab",
						"abbbba",
						"bbaa",
						"bbbabbaaaabbbbabbaaabababb",
						"abbbbbabaa",
						"abbabbaaab",
						"babbaabbaaabbbaaaababaaabaaabbba",
						"aaaaaabbbababaaabbb",
						"abbaaaaab",
						"baaabbbbbaabbbaabaaabbbaaaab",
						"abbaaaaabaaabbbaaa",
						"bbaabb",
						"bbbabbaaababaabaabaaababbaabbaa",
						"ababbba",
						"aaabaaaaa",
						"baaaabbbbbaabbbab",
						"aababbababaabbbaab",
						"baabb",
						"ababaabababbaabbaa",
						"abbbbababaabbaaaabbb",
						"aaaaa",
						"baaaabb",
						"baaaaba",
						"abbbaab",
						"abbaababb",
						"bbababaababaaabababbba",
						"aaabaaaabaabbbbbbaaaaaaa",
						"ababb",
						"aaab",
						"aaaa",
						"aaaaaababbbaaaababbaababb",
						"abaa",
						"bb",
						"baaabbababaabbbabaaaababaababaab",
						"bbababa",
						"aaabaabbabbbbaaaaabbb",
						"aabbaabbbabbaababbaabbb",
						"baaabbbbbaabaa",
						"abaaaaaba",
						"abaab",
						"abbb",
						"bbaaabaa",
						"bbabaab",
						"bbbbbbbaaa",
						"abbbaabbbbbab",
						"aabbabbbab",
						"abbabbbaabaabb",
						"bbbbbaaaabbbabaaaabbabbbababbab",
						"aaabaa",
						"bbababaab",
						"baaaabbbb",
						"abbbaabbbabbbababaabaaabaabbababaab",
						"baaaababa",
						"aabaabbbb",
						"ba",
						"baaaabbbbbbababbabaa",
						"abbbaaaab",
						"abbbaababbbbaaababbabaaababbbaaab",
						"aababba",
						"baaaabbbabaaaaababbababaabba",
						"baabbbabbababaaa",
						"aaaaabbabbaaab",
						"aa",
						"ab",
						"abbbaaaabbababaaaaabbabbbabaaaaaaaaaaab",
						"abbabbbbabba",
						"aba",
						"abb",
						"baaabbbbbaaaaaaabaabbbaab",
						"bbbabaababbababbaaaababaab",
						"bba",
						"bbb",
						"baaaabbbbaabbababba",
						"bbaabbaabb",
						"bbbbaabbabbbabaababbabaabaa",
						"aab",
						"bbaabbbba",
						"bbbabbaaaaaaababaababbababaaabbababaab",
						"aaabaaaaabaaaabaabbab",
						"baabbbab",
						"baaaba",
						"babbaaabab",
						"abbabbabbaaabababbbabbababaab",
						"baa",
						"abaabbbaab",
						"bab",
						"baaaabbbbbaabaaaabbaaabbbbbbbbaaa",
						"abbbaababbabbbab",
						"aabaabaaabbbabba",
						"baababaab",
						"aabaabaaa",
						"aaaaaab",
						"abbabaabaabbbbaaabbabbbaab",
						"abbaababbababbbabbaaabaaabbbbb",
						"aababbabaa",
						"abaaaaabaabaaaabaabbbbbbaabbbbbabaa",
						"ababaaaabbb",
						"babbaaaabbb",
						"abaabaaababbababaab",
						"aabaabbbbaabaaaabbbbaaaa",
						"abbbbabab",
						"abbababba",
						"aaaaaaaaaabba",
						"aababbbaababba",
						"abaaab",
						"aababbaabbabbaaabaaaaaaababbabaaaa",
						"ababbaabbabbbabaabbabbbabbaaaaa",
						"ababaaba",
						"aaabaabababaaa",
						"baaaabbb",
						"aaaaaa",
						"bbababaaaab",
						"baaaabbbaabbabbaabbaaabbaaaaab",
						"ababbbaabbbaabbaaabaaaaab",
						"abbab",
						"aaaaaaaaaa",
						"aabaabbbbabbaaaaaabaaabbbbb",
						"aabaa",
						"abbbaaabbaaaabbbbbab",
						"ababaabaababbabbabbabaa",
						"abbbababbbabbbababa",
						"abaabbb",
						"aaabbbabaa",
						"baabbababbbabaab",
						"bbbabaababbbbaaabaabbbbbbbaaab",
						"abbba",
						"babbaabbaa",
						"bbaabaabb",
						"babaabab",
						"ababbabb",
						"bbbabba",
						"babaabba",
						"aaaaaaaaaaabbabbbab",
						"bbbaaabbabbaaaaababbabaaabbbabaa",
						"bbaabbaa",
						"babbb",
						"bbaaaaabaaaaaaaabbbabaa",
						"bbbaaab",
						"aaababbb",
						"ababbbab",
						"bbabbbabaabaabbbb",
						"babbbabbababaababbb",
						"aabaaababbbabaabaabaa",
						"baabbaababbaaababaaabbbababa",
						"babaab",
						"bababaaa",
						"abbaaaaaabbaaba",
						"bbabbabaa",
						"bbbbba",
						"aabbbabaababbabbaaab",
						"ababbbaaab",
						"ababbbabababbaabbababaababbb",
						"abaabbaababbaaabb",
						"aabbabbbabbaabbbabbabaabbbababa",
						"aababbabababaaabbbaaababbab",
						"babaababbb",
						"aaababbbaaaabbbaaabbbaab",
						"aaababbbbaabbbab"})));*/
		
		
		
		/*System.out.println(Arrays.toString(simpleWords(new String[]{"aaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"a",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaa",
				"aaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaa",
				"aaaaaaaaaaaaaaaaaa",
				"aa",
				"aaaaaaaaaaaaaaaaaaaaaaa",
				"aaa",
				"aaaaaaaaaaa",
				"aaaaaaa",
				"aaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaa",
				"aaaaaaaaaaaaa",
				"aaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaa",
				"aaaaaaaaaaaaaaaaaaaaaaaaaa",
		"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"})));*/

	}
}
