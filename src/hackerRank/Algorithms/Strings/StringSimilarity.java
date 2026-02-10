package hackerRank.Algorithms.Strings;

import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * Link:https://www.hackerrank.com/challenges/string-similarity
 */
/**
 * Implementation of String Similarity algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StringSimilarity {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine().trim());
		for (int i = 0; i < noOfTestCases; i++) {
			String inputString=scanner.nextLine().trim();
			int similarity=0;
			for (int j = 0; j < inputString.length(); j++) {
				String substring=inputString.substring(j);
				similarity+=findSimilarity(inputString,substring);
			}
			System.out.println(similarity);
		}
	}

	/**
	 * Finds similarity in the data structure.
	 *
	 * @param inputString the inputString parameter
	 * @param substring the substring parameter
	 * @return the computed integer result
	 */
	private static int findSimilarity(String inputString, String substring) {
		int sim=0;
			// Iterate through all elements
			for (int i = 0; i < substring.length(); i++) {
				if(inputString.charAt(i)==substring.charAt(i))
					sim+=1;
				else
					break;
			}
		return sim;
	}
}
