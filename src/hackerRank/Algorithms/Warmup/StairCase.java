package hackerRank.Algorithms.Warmup;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/staircase
 */
/**
 * Implementation of Stair Case algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StairCase {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(new InputStreamReader(System.in));
		int N=Integer.parseInt(scanner.nextLine());
		for(int i=0;i<N;i++)
		{	
			StringBuilder sb=new StringBuilder("");
			for(int k=0;k<N-i-1;k++){
				sb=sb.append(" ");
			}
			for(int k=0;k<i+1;k++)
			{
				sb=sb.append("#");
			}
			System.out.println(sb.toString());
		}
	}
}
