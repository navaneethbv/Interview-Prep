package hackerRank.Java.Strings;

import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-string-reverse
 */

/**
 * Implementation of Java String Reverse algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaStringReverse {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.nextLine();
		StringBuilder sb=new StringBuilder(A);
		sb.reverse();
		if(A.contentEquals(sb.toString()))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
