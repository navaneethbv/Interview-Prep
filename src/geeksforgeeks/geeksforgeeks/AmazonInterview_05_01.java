package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-4-2/
 *  Given a 2D array containing only 0/1s and each row is in sorted order.
 *  Find the row which contains maximum number of 1s.
 */
/**
 * Implementation of Amazon Interview_05_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_05_01 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfRows=Integer.parseInt(scanner.nextLine());
		int noOfColumns=Integer.parseInt(scanner.nextLine());
		scanner.close();
		int inputArray[][]=new int [noOfRows][noOfColumns];
		for (int i = 0; i < noOfRows; i++) {

			for (int j = 0; j < noOfColumns; j++) {
				inputArray[i][j]=new Random().nextInt(2);
			}

		}
		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				System.out.print(inputArray[i][j]);
			}
			System.out.println();
		}
		int rowNumber=findMaxRow(inputArray);
		System.out.println("Row with max 1's is :"+(rowNumber+1));
	}

	/**
	 * Finds max row in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findMaxRow(int[][] inputArray) {
		int max=-1,row=-1;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			int sum=0;
			// Inner loop to check combinations
			for (int j = 0; j < inputArray[0].length; j++) {
				sum+=inputArray[i][j];
			}
			if(sum>max){
				max=sum;
				row=i;
			}
		}

		return row;
	}

}