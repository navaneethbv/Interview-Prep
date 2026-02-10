package hackerRank.Algorithms.Warmup;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/simple-array-sum
*/
/**
 * Implementation of Simple Array Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SimpleArraySum {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		Integer N=Integer.parseInt(scanner.nextLine());
		String inputArray[]=scanner.nextLine().split(" ");
		int sum=0;
		for(int i=0;i<N;i++)
		{
			sum+=Integer.parseInt(inputArray[i]);
		}
		System.out.println(sum);
	}
}
