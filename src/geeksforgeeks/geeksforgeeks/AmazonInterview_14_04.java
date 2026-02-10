package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-13-2/
 * http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 * Kadane's Algorithm
 */;
/**
 * Implementation of Amazon Interview_14_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_14_04 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner =new Scanner(new InputStreamReader(System.in));
		int size=Integer.parseInt(scanner.nextLine());
		scanner.close();
		int inputArray[]= new int[size];
		inputArray=buildArray(inputArray,inputArray.length);
		printArray(inputArray);
		System.out.println("Max Sum (Normal) is :"+findMaxSum(inputArray));
		System.out.println("Max Sum (Kadane) is :"+findMaxSumKadane(inputArray));
		
	}
	/**
	 * Finds max sum kadane in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findMaxSumKadane(int[] inputArray) {
		int max_so_far = 0,max_ending_here = 0;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			max_ending_here+=inputArray[i];
			if(max_ending_here<0)
				max_ending_here=0;
			if(max_so_far<max_ending_here)
				max_so_far = max_ending_here;
		}
		return max_so_far;
	}
	/**
	 * Finds max sum in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findMaxSum(int[] inputArray) {
		int sum=0;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			sum+=inputArray[i];
			if(sum<0)
				sum=0;
		}
		return sum;
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
	 * Performs buildArray operation.
	 *
	 * @param inputArray the array to process
	 * @param size the size parameter
	 * @return the resulting array
	 */
	private static int[] buildArray(int[] inputArray,int size) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			int value=new Random().nextInt(size*3);
			inputArray[i]=value%size==0?-1*value:value;
		}
		return inputArray;
	}

 }