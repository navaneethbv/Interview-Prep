package hackerRank.Algorithms.BitManipulation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/sansa-and-xor
 */
/**
 * Implementation of Sansa And XOR algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SansaAndXOR {

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
			int N=(scanner.nextInt());
			int inputArray[]=new int[N];
			for (int j = 0; j < N; j++) {
				inputArray[j]=scanner.nextInt();
			}
			System.out.println(findsubArrays(inputArray));
		}
	}

	/**
	 * Finds arrays in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findsubArrays(int[] inputArray) {
		// Check for null/base case
		if(inputArray.length%2==0)
			return 0;
		else
		{
			int output=0;
			// Iterate through all elements
			for (int i = 0; i < inputArray.length; i=i+2) {
				output=output^inputArray[i];
			}
			return output;
		}
	}
}
