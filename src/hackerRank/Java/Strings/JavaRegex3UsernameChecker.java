package hackerRank.Java.Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Link:https://www.hackerrank.com/challenges/valid-username-checker
 */

/**
 * Implementation of Java Regex3 Username Checker algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaRegex3UsernameChecker {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param []args the []args parameter
	 */
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String IP = in.next();
			System.out.println(IP.matches(new myRegex().pattern));
			System.out.println(IP.matches("[0-255]"+"."+"[0-255]"+"."+"[0-255]"+"."+"[0-255]"));
		}

	}
	/**
	 * Inner class myRegex for supporting operations.
	 */
	static class myRegex{
		String pattern;
		public myRegex(){
			this.pattern="[0-255]"+"."+"[0-255]"+"."+"[0-255]"+"."+"[0-255]";

		}


	}
}
