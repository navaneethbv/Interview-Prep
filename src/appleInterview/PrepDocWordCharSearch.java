package appleInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Implementation of Prep Doc Word Char Search algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocWordCharSearch {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds and print words in the data structure.
	 *
	 * @param words the array to process
	 * @param chars the array to process
	 */
	private static void findAndPrintWords(String[] words, char[] chars) {
		HashMap<Integer,ArrayList<String>> longMap=new HashMap<>();
		int max=-1;
		ArrayList<String> aList;
		HashMap<Character,Integer> charCount=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < chars.length; i++) {
			if(charCount.containsKey(chars[i]))
				charCount.put(chars[i], charCount.get(chars[i])+1);
			else
				charCount.put(chars[i],1);
		}
		// Iterate through all elements
		for (int i = 0; i < words.length; i++) {
			if(checkCounts(words[i],charCount)){
				max=Math.max(max, words[i].length());
				int length=words[i].length();
				if(longMap.containsKey(length))
				{
					aList=longMap.get(length);
				}
				else{
					aList=new ArrayList<String>();
				}
				aList.add(words[i]);
				longMap.put(length, aList);
			}
		}
		aList=longMap.get(max);
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}

	}

	/**
	 * Performs checkCounts operation.
	 *
	 * @param string the string parameter
	 * @param charCount the charCount parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkCounts(String string, HashMap<Character, Integer> charCount) {
		HashMap<Character, Integer> charCountNew=new HashMap<>();
		char[] chars=string.toCharArray();
		// Iterate through all elements
		for (int i = 0; i < chars.length; i++) {
			if(charCountNew.containsKey(chars[i]))
				charCountNew.put(chars[i], charCountNew.get(chars[i])+1);
			else
				charCountNew.put(chars[i],1);
		}
		// Iterate through all elements
		for (int i = 0; i < chars.length; i++) {
			if(!(charCount.containsKey(chars[i]) && charCountNew.get(chars[i])<=charCount.get(chars[i])))
			{
				return false;
			}
		}
		return true;
	}

}
