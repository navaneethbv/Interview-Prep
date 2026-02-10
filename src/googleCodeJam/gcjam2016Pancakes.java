package googleCodeJam;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Main Link: https://code.google.com/codejam/contests.html
 * Problem Link:https://code.google.com/codejam/contest/6254486/dashboard#s=p1
 */
/**
 * Implementation of gcjam2016 Pancakes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class gcjam2016Pancakes {

	static int noOfDash,noOfPlus;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		Integer noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			System.out.println("Case #"+(i+1)+": "+findCount(scanner.nextLine()));
		}
		scanner.close();
	}

	/**
	 * Finds count in the data structure.
	 *
	 * @param nextLine the nextLine parameter
	 * @return the resulting string
	 */
	private static String findCount(String nextLine) {
		noOfDash=0;
		noOfPlus=0;
		findCounts(nextLine);
		return null;
	}

	/**
	 * Finds counts in the data structure.
	 *
	 * @param nextLine the nextLine parameter
	 */
	private static void findCounts(String nextLine) {
		// TODO Auto-generated method stub
		
	}


}
