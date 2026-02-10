package hackerRank.Algorithms.BitManipulation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/maximizing-xor
 */
/**
 * Implementation of Maximise Xor algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaximiseXor {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int L=Integer.parseInt(scanner.nextLine());
		int R=Integer.parseInt(scanner.nextLine());
		int max=Integer.MIN_VALUE;
		for (int i = L; i <= R; i++) {
			for (int j = L; j <= R; j++) {
				max=Math.max(max,i^j);
			}
		}
		System.out.println(max);
	}
}
