package hackerRank.Java.Introduction;

import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-stdin-stdout
 */

/**
 * Implementation of Java Stdin And Stdout2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaStdinAndStdout2 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=Integer.parseInt(sc.nextLine());
		double y=Double.parseDouble(sc.nextLine());
		String s=sc.nextLine();
		System.out.println("String: "+s);
		System.out.println("Double: "+y);
		System.out.println("Int: "+x);
	}
}
