package hackerRank.Algorithms.Strings;

import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * Link:https://www.hackerrank.com/challenges/two-strings
 */
/**
 * Implementation of Two Strings algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TwoStrings {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			String inputString1=scanner.nextLine();
			String inputString2=scanner.nextLine();
			System.out.println(checkMatch(inputString1,inputString2));
		}
	}

	/**
	 * Performs checkMatch operation.
	 *
	 * @param inputString1 the inputString1 parameter
	 * @param inputString2 the inputString2 parameter
	 * @return the resulting string
	 */
	private static String checkMatch(String inputString1, String inputString2) {
		for (int i = 0; i < 26; i++) {
			char c=(char)(i+97);
			if(inputString1.contains(c+"") && inputString2.contains(c+""))
				return "YES";
		}
		return "NO";
	}
}
