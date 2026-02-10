package hackerRank.Algorithms.Implementation;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/cut-the-sticks
 */
/**
 * Implementation of Cut The Sticks algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CutTheSticks {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int N=Integer.parseInt(scanner.nextLine());
		String inputArray[]=scanner.nextLine().split(" ");
		int numberArray[]=new int[inputArray.length];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i]=Integer.parseInt(inputArray[i]);
		}
		while(true)
		{
			int min=findMin(numberArray);
			if(min!=Integer.MAX_VALUE)
			{
				numberArray=decreaseMin(numberArray,min);
			}
			else{
				break;
			}
		}
	}

	/**
	 * Performs decreaseMin operation.
	 *
	 * @param numberArray the array to process
	 * @param min the min parameter
	 * @return the resulting array
	 */
	private static int[] decreaseMin(int[] numberArray, int min) {
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < numberArray.length; i++) {
			if(numberArray[i]!=0)
			{
				numberArray[i]-=min;
				count++;
			}
		}
		System.out.println(count);
		return numberArray;
	}

	/**
	 * Finds min in the data structure.
	 *
	 * @param numberArray the array to process
	 * @return the computed integer result
	 */
	private static int findMin(int[] numberArray) {
		int min=Integer.MAX_VALUE;
		// Iterate through all elements
		for (int i = 0; i < numberArray.length; i++) {
			if(numberArray[i]!=0 && numberArray[i]<min)
				min=numberArray[i];
		}
		return min;
	}
}
