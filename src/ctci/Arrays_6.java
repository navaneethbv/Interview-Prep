package ctci;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*Implementation of CTCI 1.7*/
/**
 * Implementation of Arrays_6 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Arrays_6 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfRows=Integer.parseInt(scanner.nextLine());
		int noOfColumns=Integer.parseInt(scanner.nextLine());
		scanner.close();
		int inputArray[][]=new int[noOfRows][noOfColumns];
		for(int i=0;i<noOfRows;i++){
			String rowString=scanner.nextLine();
			String columnArray[]=rowString.split(" ");
			for (int j = 0; j < columnArray.length; j++) {
				inputArray[i][j]=Integer.parseInt(columnArray[j]);
			}
		}
		System.out.println("********Input********");
		for(int i=0;i<noOfRows;i++){
			for (int j = 0; j < noOfColumns; j++) {
				System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("********Output********");
		int[][] outputArray=setZeroMatrix(inputArray);
		for(int i=0;i<noOfRows;i++){
			for (int j = 0; j < noOfColumns; j++) {
				System.out.print(outputArray[i][j]+" ");
			}
			System.out.println();
		}
	}

	/**
	 * Sets zero matrix in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	public static int[][] setZeroMatrix(int[][] inputArray) {
		int noOfRows=inputArray.length;
		int noOfColumns=inputArray[0].length;
		boolean rowIndexChecker[]=new boolean[noOfRows];
		boolean columnIndexChecker[]=new boolean[noOfColumns];
		Arrays.fill(rowIndexChecker,false);
		Arrays.fill(columnIndexChecker,false);
		for (int i = 0; i < noOfRows; i++) {
			// Inner loop to check combinations
			for (int j = 0; j < noOfColumns; j++) {
				// Check for null/base case
				if(inputArray[i][j]==0)
				{
					rowIndexChecker[i]=true;
					columnIndexChecker[j]=true;
				}
			}
		}
		for (int i = 0; i < noOfRows; i++) {
			if(rowIndexChecker[i]==true)
				Arrays.fill(inputArray[i],0);
			// Inner loop to check combinations
			for (int j = 0; j < noOfColumns; j++) {
				if(columnIndexChecker[j]==true)
					inputArray[i][j]=0;
			}
		}
		
		return inputArray;
	}

}
