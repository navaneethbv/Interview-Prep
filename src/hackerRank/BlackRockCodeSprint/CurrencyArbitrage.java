package hackerRank.BlackRockCodeSprint;

import java.util.Scanner;

/**
 * Implementation of Currency Arbitrage algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CurrencyArbitrage {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int noOfTestCases=Integer.parseInt(sc.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			String inputArray[]=sc.nextLine().split(" ");
			double a=Double.parseDouble(inputArray[0]);
			double b=Double.parseDouble(inputArray[1]);
			double c=Double.parseDouble(inputArray[2]);
			double output=100000/a;
			output=output/b;
			output=output/c;
			if((int)output>100000)
			{
				System.out.println((int)output-100000);
			}
			else
				System.out.println("0");
		}
	}
}
