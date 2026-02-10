package hackerRank.Algorithms.Implementation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/chocolate-feast
 */
/**
 * Implementation of Chocolate Feast algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ChocolateFeast {

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
			String inputArray[]=scanner.nextLine().split(" ");
			int N=Integer.parseInt(inputArray[0]);
			int C=Integer.parseInt(inputArray[1]);
			int M=Integer.parseInt(inputArray[2]);
			int noOfChocolates=N/C;
			int noOfWrappers=noOfChocolates;
			while(true)
			{
				if(noOfWrappers<M)
				{
					break;
				}
				else{
					int noOfNewChococolates=noOfWrappers/M;
					noOfChocolates+=noOfNewChococolates;
					int newWrappers=noOfWrappers%M;
					noOfWrappers=noOfNewChococolates+newWrappers;
				}
			}
			System.out.println(noOfChocolates);
		}
	}
}
