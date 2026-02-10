package hackerRank.Java.Strings;

import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-strings-introduction
 */

/**
 * Implementation of Java Strings Introduction algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaStringsIntroduction {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param []argv the []argv parameter
	 */
	public static void main(String []argv)
	{
		Scanner scanner=new Scanner(System.in);
		String A=scanner.next();
		String B=scanner.next();
		System.out.println(A.length()+B.length());
		if(A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println((A.charAt(0)+"").toUpperCase() + A.substring(1) + " " + (B.charAt(0)+"").toUpperCase() + B.substring(1));
	}
}
