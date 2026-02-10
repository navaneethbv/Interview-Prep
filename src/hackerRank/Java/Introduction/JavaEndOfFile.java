package hackerRank.Java.Introduction;

import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-end-of-file
 */

/**
 * Implementation of Java End Of File algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaEndOfFile {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int counter=0;
		while(scanner.hasNext())
		{
			String s=scanner.nextLine();
			counter++;
			System.out.println(counter+" "+s);
		}
	}
}
