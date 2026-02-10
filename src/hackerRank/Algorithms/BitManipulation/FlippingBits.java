package hackerRank.Algorithms.BitManipulation;

import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/flipping-bits
 */
/**
 * Implementation of Flipping Bits algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FlippingBits {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine().trim());
		for (int i = 0; i < noOfTestCases; i++) {
			BigInteger input=new BigInteger(scanner.nextLine().trim());
			input=input.subtract(new BigInteger("4294967295"));
			System.out.println(input.abs());
		}
	}
}
