package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-11/
 * Program to implement atoi function
 */;
/**
 * Implementation of Amazon Interview_11_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_11_04 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int size=Integer.parseInt(scanner.nextLine());
		scanner.close();
		int []inputArray=new int[size];
		for (int i = 0; i < size; i++) {
			inputArray[i]=new Random().nextInt(10);
		}
		printArray(inputArray);
		System.out.println("Integer value is :"+atoi(inputArray));
	}

	/**
	 * Performs atoi operation.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int atoi(int[] inputArray) {
		int output=0;
		int tenCount=1;
		for (int i = inputArray.length-1; i >=0; i--) {
			output+=inputArray[i]*tenCount;
			tenCount*=10;
		}
		return output;
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
 }