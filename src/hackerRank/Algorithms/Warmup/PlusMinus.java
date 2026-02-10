package hackerRank.Algorithms.Warmup;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/plus-minus
 */
/**
 * Implementation of Plus Minus algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PlusMinus {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(new InputStreamReader(System.in));
		int N=Integer.parseInt(scanner.nextLine());
		String inputArray[]=scanner.nextLine().split(" ");
		int noOfZeros=0,noOfPositives = 0,noOfNegatives = 0;
		for(int i=0;i<inputArray.length;i++)
		{	
			int element=Integer.parseInt(inputArray[i]);
			if(element>0)
			{
				noOfPositives+=1;
			}else if(element<0)
			{
				noOfNegatives+=1;
			}else{
				noOfZeros+=1;
			}
		}
		System.out.println((float)noOfPositives/N);
		System.out.println((float)noOfNegatives/N);
		System.out.println((float)noOfZeros/N);
	}
}
