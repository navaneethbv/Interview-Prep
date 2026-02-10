package hackerRank.Algorithms.Strings;

import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * Link:https://www.hackerrank.com/challenges/alternating-characters
 */
/**
 * Implementation of Alternating Characters algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AlternatingCharacters {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int k = 0; k < noOfTestCases; k++) {
			String inputString=scanner.nextLine();
			int noOfDeletions=0;
			char initialChar=inputString.charAt(0);
			for (int i = 1; i < inputString.length(); i++) {
				while(i<inputString.length() && inputString.charAt(i)==initialChar)
				{
					noOfDeletions++;
					i++;
				}
				if(i<inputString.length())
					initialChar=inputString.charAt(i);
			}
			System.out.println(noOfDeletions);
		}
	}
}
