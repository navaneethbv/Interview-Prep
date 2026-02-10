package hackerRank.Algorithms.Implementation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/sherlock-and-squares
 */
/**
 * Implementation of Sherlock And Squares algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SherlockAndSquares {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		for(int i=0;i<noOfTestCases;i++)
		{
			String inputArray[]=(scanner.nextLine()).split(" ");
			int count=0;
			double A=Math.sqrt(Integer.parseInt(inputArray[0])),B=Math.sqrt(Integer.parseInt(inputArray[1]));
			System.out.println((int)(-Math.ceil(A)+Math.floor(B)+1));
		}
	}
}
