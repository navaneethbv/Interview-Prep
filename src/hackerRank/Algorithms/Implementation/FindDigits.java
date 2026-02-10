package hackerRank.Algorithms.Implementation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/find-digits
 */
/**
 * Implementation of Find Digits algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindDigits {

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
			String N=(scanner.nextLine());
			int count=0;
			for (int j = 0; j < N.length(); j++) {
				int value=Integer.parseInt(N.charAt(j)+"");
				if(value!=0 && Integer.parseInt(N)%value==0)
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
