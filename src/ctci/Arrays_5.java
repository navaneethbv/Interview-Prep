package ctci;

import java.io.InputStreamReader;
import java.util.Scanner;

/*Implementation of CTCI 1.6*/
/**
 * Implementation of Arrays_5 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Arrays_5 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfRows=Integer.parseInt(scanner.nextLine());
		int inputArray[][]=new int[noOfRows][noOfRows];
		for(int i=0;i<noOfRows;i++){
			String rowString=scanner.nextLine();
			String columnArray[]=rowString.split(" ");
			for (int j = 0; j < columnArray.length; j++) {
				inputArray[i][j]=Integer.parseInt(columnArray[j]);
			}
		}
		scanner.close();
		for(int i=0;i<noOfRows;i++){
			for (int j = 0; j < noOfRows; j++) {
				System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
		int[][] outputArray=rotateMatrix(inputArray);

	}

	/**
	 * Rotates the matrix.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	public static int[][] rotateMatrix(int[][] inputArray) {
		int noOfRows=inputArray.length;
		int layers=noOfRows/2;
		int outputArray[][]=new int[noOfRows][noOfRows];
			for (int i = 0; i < layers; i++) {
				int index=noOfRows-2*layers;
				// Inner loop to check combinations
				for (int j = 0; j <noOfRows; j++) {
					//outputArray[][]
				}
				
			}
		
		return null;
	}
	/**
	 * Rotates the matrix in place.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	public static int[][] rotateMatrixInPlace(int[][] inputArray) {
		int noOfRows=inputArray.length;
		int layers=noOfRows/2;
		int outputArray[][]=new int[noOfRows][noOfRows];
			for (int i = 0; i < layers; i++) {
				
			}
		
		return null;
	}

}
