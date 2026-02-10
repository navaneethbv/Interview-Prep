package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;





/*
 * http://www.geeksforgeeks.org/amazon-interview-set-8-2/
 * Given an array. Iterate it for the given number of times. And then return the summation of the resultant elements.
 * Ex: Array is { 1,2,5,6}, N=2
 * After 1st iteration: {2-1, 5-2, 6-5}={1,3,1}
 * After 2nd : {3-1, 1-3}={2,-2}
 * Sum is 2  + (-2) = 0
 * If only one element remains in the array, the element remains the same after applying the iteration. Complete the method.
 */;
/**
 * Implementation of Amazon Interview_09_02 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_09_02 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 Integer size=Integer.parseInt(scanner.nextLine());
		 Integer noOfIterations=Integer.parseInt(scanner.nextLine());
		 scanner.close();
		 int inputArray[]=new int[size];
		 inputArray=constructArray(size, inputArray);
		 System.out.println(Arrays.toString(inputArray));
		 System.out.println("Sum is : "+getSum(inputArray,noOfIterations));
	 }

	/**
	 * Retrieves sum from the data structure.
	 *
	 * @param inputArray the array to process
	 * @param noOfIterations the noOfIterations parameter
	 * @return the computed integer result
	 */
	private static int getSum(int[] inputArray, Integer noOfIterations) {
		ArrayList<Integer> inputList=new ArrayList<Integer>();
		ArrayList<Integer> outputList=new ArrayList<Integer>();
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			inputList.add(inputArray[i]);
		}
		for (int i = 0; i < noOfIterations; i++) {
			if(inputList.size()==1)
				continue;
			// Inner loop to check combinations
			for (int j = 0; j < inputList.size()-1; j++) {
				outputList.add(inputList.get(j+1)-inputList.get(j));
			}
			inputList=outputList;
			outputList=new ArrayList<Integer>();
		}
		// Recursively process left and right subtrees
		return getSumFromList(inputList);
	}

	/**
	 * Retrieves sum from list from the data structure.
	 *
	 * @param inputList the inputList parameter
	 * @return the computed integer result
	 */
	private static int getSumFromList(ArrayList<Integer> inputList) {
		int sum=0;
		for (int i = 0; i < inputList.size(); i++) {
			sum+=inputList.get(i);
		}
		return sum;
	}

	/**
	 * Performs constructArray operation.
	 *
	 * @param size the size parameter
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] constructArray(Integer size, int[] inputArray) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i]=new Random().nextInt(size*3);
		}
		return inputArray;
	}

	
 }