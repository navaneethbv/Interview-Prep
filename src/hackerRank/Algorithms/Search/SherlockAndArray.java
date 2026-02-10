package hackerRank.Algorithms.Search;

import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/sherlock-and-array
 */
/**
 * Implementation of Sherlock And Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SherlockAndArray {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner((System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			int arrayLength=Integer.parseInt(scanner.nextLine());
			String inputArray[]=scanner.nextLine().split(" ");
			int rightSum=0,leftSum=0;
			for (int j = 0; j < inputArray.length; j++) {
				rightSum+=Integer.parseInt(inputArray[j]);
			}
			boolean found=false;
			for (int j = 0; j < inputArray.length; j++) {
				rightSum-=Integer.parseInt(inputArray[j]);
				if(leftSum==rightSum)
				{
					found=true;
					break;
				}
				else
				{
					leftSum+=Integer.parseInt(inputArray[j]);
				}
			}
			System.out.println(found==true?"YES":"NO");
		}
	}
}
