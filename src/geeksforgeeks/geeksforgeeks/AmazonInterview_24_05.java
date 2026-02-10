package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-24/
 * Given a matrix with ordered rows and columns(Rows are sorted 0s followed by 1s).
 * Find the row with maximum 0
 */;
/**
 * Implementation of Amazon Interview_24_05 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_24_05 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 Integer noOfRows=Integer.parseInt(scanner.nextLine());
		 Integer noOfColumns=Integer.parseInt(scanner.nextLine());
		 scanner.close();
		 int inputArray[][]=buildInputArray(noOfRows,noOfColumns);
		 printArray(inputArray);
		 System.out.println(getRowUsingSum(inputArray));
		 System.out.println(getRowUsingMap(inputArray));
	 }

	 /**
	  * Retrieves row using map from the data structure.
	  *
	  * @param inputArray the array to process
	  * @return the computed integer result
	  */
	 private static int getRowUsingMap(int[][] inputArray) {

		 ArrayList<Integer> initInputList=new ArrayList<Integer>();
		 ArrayList<Integer> finalInputList=new ArrayList<Integer>();
		 // Iterate through all elements
		 for (int i = 0; i < inputArray.length; i++) {
			 // Check for null/base case
			 if(inputArray[i][0]==0){
				 initInputList.add(i);
			 }
		 }
		 int counter=1;
		 int latestRow=0;
		 while(!initInputList.isEmpty() &&counter!=inputArray[0].length-1){
			 // Check for null/base case
			 if(inputArray[initInputList.get(0)][counter]==0)
			 {
				 finalInputList.add(initInputList.get(0));
				 latestRow=initInputList.get(0);
			 }

			 initInputList.remove(0);
			 if(initInputList.isEmpty())
			 {
				 initInputList=finalInputList;
				 if(finalInputList.size()>0){
					 finalInputList=new ArrayList<Integer>();
				 }
				 else{
					 return latestRow;
				 }
				 counter++;
			 }
		 }
		 return latestRow;
	 }

	 /**
	  * Retrieves row using sum from the data structure.
	  *
	  * @param inputArray the array to process
	  * @return the computed integer result
	  */
	 private static int getRowUsingSum(int[][] inputArray) {
		 int min=Integer.MAX_VALUE;
		 int index=-1;
		 // Iterate through all elements
		 for (int i = 0; i < inputArray.length; i++) {
			 int sum=0;
			 // Inner loop to check combinations
			 for (int j = 0; j < inputArray.length; j++) {
				 sum+=inputArray[i][j];
			 }
			 if(sum<min){
				 min=sum;
				 index=i;
			 }
		 }
		 return (index);
	 }

	 /**
	  * Performs printArray operation.
	  *
	  * @param inputArray the array to process
	  */
	 private static void printArray(int[][] inputArray) {
		 // Iterate through all elements
		 for (int i = 0; i < inputArray.length; i++) {
			 Arrays.sort(inputArray[i]);
			 System.out.println(Arrays.toString(inputArray[i]));
		 }

	 }

	 /**
	  * Performs buildInputArray operation.
	  *
	  * @param noOfRows the noOfRows parameter
	  * @param noOfColumns the noOfColumns parameter
	  * @return the resulting array
	  */
	 private static int[][] buildInputArray(Integer noOfRows, Integer noOfColumns) {
		 int inputArray[][]=new int[noOfRows][noOfColumns];
		 for (int i = 0; i < noOfRows; i++) {
			 // Inner loop to check combinations
			 for (int j = 0; j < noOfColumns; j++) {
				 inputArray[i][j]=new Random().nextInt(2);
			 }
		 }
		 return inputArray;
	 }

 }