package hackerRank.ProjectEuler;


import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * Link:https://www.hackerrank.com/contests/projecteuler/challenges/euler001
*/
/**
 * Implementation of Multiples Of3 And5 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MultiplesOf3And5 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			Long b=Long.parseLong(scanner.nextLine());
			Long threeMultiples=(b-1)/3;
			Long fiveMultiples=(b-1)/5;
			Long difference=(b-1)/15;
			System.out.println(findAPSum(3,threeMultiples)+findAPSum(5,fiveMultiples)-findAPSum(15,difference));
		}
	}

	/**
	 * Finds ap sum in the data structure.
	 *
	 * @param number the number parameter
	 * @param times the times parameter
	 * @return the Long result
	 */
	private static Long findAPSum(long number,Long times) {
		Long sum=((times)*(2*(number)+(times-1)*number))/2;
		return sum;
	}
}
