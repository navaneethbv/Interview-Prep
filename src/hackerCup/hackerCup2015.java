
package hackerCup;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * https://www.facebook.com/hackercup/problem/582062045257424/
 * followed by the smallest and largest numbers that can be made from the original number N,
 * using at most a single swap
 */

/**
 * Implementation of hacker Cup2015 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class hackerCup2015 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(new InputStreamReader(System.in));
		int numberOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < numberOfTestCases; i++) {
			int inputNumber=Integer.parseInt(scanner.nextLine());
			int smallNumber=findSmallestNumber(inputNumber);
			int largeNumber=findLargestNumber(inputNumber);
			System.out.println("Case #"+(i+1)+" "+smallNumber+" "+largeNumber);
		}

	}

	/**
	 * Finds largest number in the data structure.
	 *
	 * @param inputNumber the inputNumber parameter
	 * @return the computed integer result
	 */
	private static int findLargestNumber(int inputNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Finds smallest number in the data structure.
	 *
	 * @param inputNumber the inputNumber parameter
	 * @return the computed integer result
	 */
	private static int findSmallestNumber(int inputNumber) {
		// TODO Auto-generated method stub
		return 0;
	}
}
