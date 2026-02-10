package hackerRank.Algorithms.Strings;

import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * Link:https://www.hackerrank.com/challenges/palindrome-index
 */
/**
 * Implementation of Palindrome Index algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PalindromeIndex {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			String inputString=scanner.nextLine().trim();
			if(new StringBuilder(inputString).toString().contentEquals(new StringBuilder(inputString).reverse().toString()))
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println(findIndex(inputString));
			}
		}
	}

	/**
	 * Finds index in the data structure.
	 *
	 * @param inputString the inputString parameter
	 * @return the computed integer result
	 */
	private static int findIndex(String inputString) {
		// Iterate through all elements
		for (int i = 0; i < inputString.length(); i++) {
			if(inputString.charAt(i)==inputString.charAt(inputString.length()-1-i))
				continue;
			else{
				inputString=inputString.substring(0,i)+inputString.substring(i+1);
				if(new StringBuilder(inputString).toString().contentEquals(new StringBuilder(inputString).reverse().toString()))
				{
					return (i);
				}
				else{
					return inputString.length()-i;
				}
			}
		}
		return 0;
	}
}
