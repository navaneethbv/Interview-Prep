package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;





/*
 * http://www.geeksforgeeks.org/amazon-interview-set-21/
 * Print matrix spirally.
 * 1 2 3 4 5
 * 6 7 8 9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 * O/P: 1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 6 8 9 14 19 18 17 12 13 18
 */;
/**
 * Implementation of Amazon Interview_21_06 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_21_06 {
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
		 int inputArray[][]=buildArray(noOfRows,noOfColumns);
		/* int inputArray[][]={{1,2,3,4,5},
				 {6,7,8,9,10},
				 {11,12,13,14,15},
				 {16,17,18,19,20},
				 {21,22,23,24,25}};*/
		 printArray(inputArray);
		 System.out.println(printSpiralArray(inputArray));
	 }

	 /**
	  * Performs buildArray operation.
	  *
	  * @param noOfRows the noOfRows parameter
	  * @param noOfColumns the noOfColumns parameter
	  * @return the resulting array
	  */
	 private static int[][] buildArray(int noOfRows, int noOfColumns) {
		 int [][]inputArray=new int[noOfRows][noOfColumns];
		 for (int i = 0; i < noOfRows; i++) {
			// Inner loop to check combinations
			for (int j = 0; j < noOfColumns; j++) {
				inputArray[i][j]=new Random().nextInt(noOfRows*noOfColumns*2);
			}
		}
		return inputArray;
	 }

	/**
	 * Performs printSpiralArray operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting string
	 */
	private static String printSpiralArray(int[][] inputArray) {
		 int noOfRows=inputArray.length;
		 int noOfColumns=inputArray[0].length;
		 StringBuffer sb=new StringBuffer();
		 int topIndex=0,bottomIndex=noOfRows-1;
		 int leftIndex=0,rightIndex=noOfColumns;

		 for (int i = 0; i <= noOfColumns/2; i++) {
			 leftIndex=i;
			 rightIndex--;
			 Stack<Integer> stack=new Stack<Integer>();
			 for (int rowNumber = topIndex; rowNumber <=bottomIndex; rowNumber++) {
				 if(rowNumber==topIndex || rowNumber==bottomIndex){
					 for (int colNumber = leftIndex; colNumber <=rightIndex; colNumber++) {
						 if(rowNumber==topIndex)
							 sb.append(inputArray[rowNumber][colNumber]+" ");
						 else
							 stack.push(inputArray[rowNumber][colNumber]);
					 }
				 }
				 else{
					 stack.push(inputArray[rowNumber][leftIndex]);
					 sb.append(inputArray[rowNumber][rightIndex]+" ");	
				 }
			 }
			 while(!stack.isEmpty()){
				 sb.append(stack.pop()+" ");
			 }
			 topIndex++;
			 bottomIndex--;
		 }
		 return (sb.toString());
	}

	 /**
	  * Performs printArray operation.
	  *
	  * @param inputArray the array to process
	  */
	 private static void printArray(int[][] inputArray) {
		 // Iterate through all elements
		 for (int i = 0; i < inputArray.length; i++) {
			 System.out.println(Arrays.toString(inputArray[i]));
		 }

	 }

 }
