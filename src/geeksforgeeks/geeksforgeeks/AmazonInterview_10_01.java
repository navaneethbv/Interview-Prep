package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-10/
 * Equilibrium point in array, equiPoint = ith index where Sum(Left array) = Sum(right Array).
 */;
/**
 * Implementation of Amazon Interview_10_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_10_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new  Scanner(new InputStreamReader(System.in));
		 Integer size=Integer.parseInt(scanner.nextLine());
		 scanner.close();
		 int inputArray[]=new int[size];
		 inputArray=buildInputArray(inputArray);
		 printArray(inputArray);
		 System.out.println("Equilibrium point is : "+getEquilibriumPoint(inputArray));
	 }

	/**
	 * Retrieves equilibrium point from the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int getEquilibriumPoint(int[] inputArray) {
		int rightSum=0,leftSum=0;
		for (int i = 1; i < inputArray.length; i++) {
			rightSum+=inputArray[i];
		}
		leftSum=inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if(leftSum==rightSum)
				return i;
			else{
				leftSum+=inputArray[i];
				rightSum-=inputArray[i];
			}
		}
		return -1;
	}

	/**
	 * Performs printArray operation.
	 *
	 * @param inputArray the array to process
	 */
	private static void printArray(int[] inputArray) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]+",");
		}
		System.out.println();
	}

	/**
	 * Performs buildInputArray operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] buildInputArray(int[] inputArray) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i]=new Random().nextInt(2);
		}
		return inputArray;
	}
 }