package geeksforgeeks;

import java.util.Arrays;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-34/
 * http://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/
 * Given an array consisting of both positive and negative numbers,
 * 0 is considered as positive, rearrange the elements such that positive
 * and negative numbers are placed alternatively, constraints are that it
 * should be in-place and order of elements should not change.
 */;
/**
 * Implementation of Amazon Interview_34_02 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_34_02 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	 /**
	  * Performs rearrange operation.
	  *
	  * @param inputArray the array to process
	  * @return the resulting array
	  */
	 private static int[] rearrange(int[] inputArray) {
		 int index=-1;
		 // Iterate through all elements
		 for (int i = 0; i < inputArray.length; i++) {
			 if(inputArray[i]<0)
			 {
				 index++;
				 /*inputArray[index]=inputArray[index]^inputArray[i];
				inputArray[i]=inputArray[index]^inputArray[i];
				inputArray[index]=inputArray[index]^inputArray[i];*/
				 int temp=inputArray[index];
				 inputArray[index]=inputArray[i];
				 inputArray[i]=temp;
			 }
		 }
		 int posIndex=index+1;
		 int negIndex=0;
		 while(posIndex>negIndex && posIndex<inputArray.length-1 && inputArray[negIndex]<0){
			 /*inputArray[negIndex]=inputArray[negIndex]^inputArray[posIndex];
			inputArray[posIndex]=inputArray[negIndex]^inputArray[posIndex];
			inputArray[negIndex]=inputArray[negIndex]^inputArray[posIndex];*/
			 int temp=inputArray[negIndex];
			 inputArray[negIndex]=inputArray[posIndex];
			 inputArray[posIndex]=temp;
			 posIndex++;
			 negIndex+=2;
		 }
		 return inputArray;
	 }
 }