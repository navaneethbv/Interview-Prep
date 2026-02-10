package hackerRank.Java.Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Link:https://www.hackerrank.com/challenges/pattern-syntax-checker
 */

/**
 * Implementation of Pattern Syntax Checker algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PatternSyntaxChecker {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			String pattern=scanner.nextLine();
			try{
				Pattern.compile(pattern);
				System.out.println("Valid");
			}
			catch(Exception e){
				System.out.println("Invalid");
			}
		}
	}
}
