package hackerRank.Algorithms.BitManipulation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/and-product
 */
/**
 * Implementation of And Product algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AndProduct {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=scanner.nextInt();
		for (int i = 0; i < noOfTestCases; i++) {
			long A=scanner.nextLong();
			long B=scanner.nextLong();
			long output=B;
			for (long j = A; j <B; j++) {
				output=output & j;
			}
			System.out.println(output);
		}
	}
}
