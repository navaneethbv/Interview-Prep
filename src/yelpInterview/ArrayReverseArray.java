package yelpInterview;

import java.util.Arrays;
import java.util.Stack;

/**
 * Implementation of Array Reverse Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayReverseArray {
	static int inputArray[];
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		inputArray = new int[]{1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(inputArray));
		inputArray=reverseArray(inputArray);
		System.out.println(Arrays.toString(inputArray));
		reverseArrayRecusive(inputArray,0);
		System.out.println(Arrays.toString(inputArray));
	}
	/**
	 * Performs reverseArrayRecusive operation.
	 *
	 * @param inputArray the array to process
	 * @param index the index parameter
	 */
	private static void reverseArrayRecusive(int[] inputArray,int index) {
		if(index==inputArray.length-index-1 || index>(inputArray.length-1)/2)
			return;
		else{
			inputArray[index]=inputArray[inputArray.length-index-1] ^ inputArray[index];
			inputArray[inputArray.length-index-1]=inputArray[inputArray.length-index-1] ^ inputArray[index];
			inputArray[index]=inputArray[inputArray.length-index-1] ^ inputArray[index];
			reverseArrayRecusive(inputArray,index+1);
		}
	}
	/**
	 * Performs reverseArray operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] reverseArray(int[] inputArray) {
		Stack<Integer> arrayStack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			arrayStack.push(inputArray[i]);
		}
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i]=arrayStack.pop();
		}
		return inputArray;
	}

}