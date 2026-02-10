package hackerRank.Algorithms.BitManipulation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/2s-complement
 */
/**
 * Implementation of Twos Complement algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TwosComplement {

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
			int A=scanner.nextInt();
			int B=scanner.nextInt();
			int count=0;
			for (int j = A; j <=B; j++) {
				count+=(Integer.bitCount(j));
			}
			System.out.println(count);
		}
	}
}
