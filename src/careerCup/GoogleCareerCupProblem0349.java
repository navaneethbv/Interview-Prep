package careerCup;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Link: http://www.careercup.com/question?id=60349
 * a e r o p s 
 * b h a r l s 
 * w r i s l o 
 * a s n k t q 
 * Write a function to which this puzzle and a word will be passed to test whether that word exists in the puzzle or not. 
 * e.g. rain and slow will return true. rain is present in the second column and slow in the third row wrapped around.
 */
/**
 * Implementation of Google Career Cup Problem0349 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem0349 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		char charArray[][]=new char[][]
				{{'a','e','r','o','p','s'},
			{'b','h','a','r','l','s'},
			{'w','r','i','s','l','o'},
			{'a','s','n','k','t','q'}};	
			System.out.println(findWord(charArray,"rain"));
	}

	/**
	 * Finds word in the data structure.
	 *
	 * @param charArray the array to process
	 * @param string the string parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findWord(char[][] charArray, String string) {
		//rowwise scan
		HashMap<Integer,String> elementMap=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < charArray.length; i++) {
			String str=Arrays.toString(charArray[i]).replaceAll("\\s+", "").replaceAll("[^A-Za-z0-9 ]","");
			str+=str;
			// Inner loop to check combinations
			for (int j = 0; j < str.length(); j++) {
				if(elementMap.containsKey(j))
					elementMap.put(j,elementMap.get(j)+str.charAt(j));
				else
					elementMap.put(j,""+str.charAt(j));
			}
			if(str.contains(string))
				return true;
		}

		// Iterate through all elements
		for (int i = 0; i < charArray[0].length; i++) {
			String str=elementMap.get(i);
			str+=str;
			if(str.contains(string))
				return true;
		}
		return false;
	}

}
