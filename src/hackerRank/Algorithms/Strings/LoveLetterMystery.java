package hackerRank.Algorithms.Strings;

import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * Link:https://www.hackerrank.com/challenges/the-love-letter-mystery
 */
/**
 * Implementation of Love Letter Mystery algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LoveLetterMystery {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			System.out.println(findPalindromeChangeCount(scanner.nextLine().trim()));
		}
	}

	/**
	 * Finds palindrome change count in the data structure.
	 *
	 * @param inputString the inputString parameter
	 * @return the computed integer result
	 */
	private static int findPalindromeChangeCount(String inputString) {
		int count=0;
		if(inputString.contentEquals(new StringBuilder(inputString).reverse().toString()))
			return 0;
		else{
			// Iterate through all elements
			for (int i = 0; i <inputString.length()/2; i++) {
				if(inputString.charAt(i)!=inputString.charAt(inputString.length()-1-i))
				{
					count+=Math.abs(inputString.charAt(i)-inputString.charAt(inputString.length()-1-i));
				}
			}
		}
		return count;
	}
}
