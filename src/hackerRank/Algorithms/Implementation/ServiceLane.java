package hackerRank.Algorithms.Implementation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/service-lane
 */
/**
 * Implementation of Service Lane algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ServiceLane {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		String inputArray[]=scanner.nextLine().split(" ");
		String widthArray[]=scanner.nextLine().split(" ");
		for(int i=0;i<Integer.parseInt(inputArray[1]);i++)
		{
			int min=Integer.MAX_VALUE;
			String nextInput[]=scanner.nextLine().split(" ");
			for (int j = Integer.parseInt(nextInput[0]); j <=Integer.parseInt(nextInput[1]); j++)
			{
				if(Integer.parseInt(widthArray[j])<min)
					min=Integer.parseInt(widthArray[j]);
			}
			System.out.println(min);
		}
	}
}
