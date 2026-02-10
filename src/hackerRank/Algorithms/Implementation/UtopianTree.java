package hackerRank.Algorithms.Implementation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/utopian-tree
 */
/**
 * Implementation of Utopian Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UtopianTree {

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
			int N=Integer.parseInt(scanner.nextLine());
			int height=0;
			int count=0;
			while(count<=N)
			{	
				
				if((count)%2!=0)
					height*=2;
				else
					height+=1;
				count++;
			}
			System.out.println(height);
		}
	}
}
