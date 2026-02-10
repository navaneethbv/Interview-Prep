package hackerRank.Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-biginteger
 */

/**
 * Implementation of Java Big Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaBigInteger {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param []argv the []argv parameter
	 */
	public static void main(String []argv)
	{
		Scanner scanner=new Scanner(System.in);
		BigInteger b1=new BigInteger(scanner.nextLine());
		BigInteger b2=new BigInteger(scanner.nextLine());
		System.out.println(b1.add(b2));
		System.out.println(b1.multiply(b2));
	}
}
