package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-2/
 * Find the next greater element for every element in array.
 * 
 */;
/**
 * Implementation of Amazon Interview_07_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_07_04 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 int size=Integer.parseInt(scanner.nextLine());
		 scanner.close();
		 int inputArray[]=new int[size];
		 for (int i = 0; i < size; i++) {
			 inputArray[i]=new Random().nextInt(3*size);
		 }

		 for (int i = 0; i < size; i++) {
			 System.out.print(inputArray[i]+",");
		 }
		 System.out.println();
		 getNextGreaterElementShort(inputArray);
		 getNextGreaterElementLong(inputArray);
	 }

	/**
	 * Retrieves next greater element short from the data structure.
	 *
	 * @param inputArray the array to process
	 */
	private static void getNextGreaterElementShort(int[] inputArray) {
		// TODO Auto-generated method stub
		
		int[] temporaryArray=Arrays.copyOf(inputArray,inputArray.length);
		Arrays.sort(temporaryArray);
		ArrayList<Integer> inputList=new ArrayList<Integer>();
		// Iterate through all elements
		for (int i = 0; i < temporaryArray.length; i++) {
			inputList.add(temporaryArray[i]);
		}
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			int element=inputArray[i];
			int elementIndex=inputList.indexOf(element);
			if(elementIndex!=inputArray.length-1){
				System.out.println("Element is :"+element+" Next greater element(Short) is :"+temporaryArray[elementIndex+1]);
			}
		}
	}

	/**
	 * Retrieves next greater element long from the data structure.
	 *
	 * @param inputArray the array to process
	 */
	private static void getNextGreaterElementLong(int[] inputArray) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			 int element=inputArray[i];
			 int diff=Integer.MAX_VALUE;
			 int index=0;
			// Inner loop to check combinations
			for (int j = 0; j < inputArray.length; j++) {
				if(j==i)
					continue;
				if((inputArray[j]-element)<diff && (inputArray[j]-element)>0){
					diff=inputArray[j]-element;
					index=j;
				}
			}
			System.out.println("Element is :"+element+" Next greater element(Long) is :"+inputArray[index]);
		}
	}
 }