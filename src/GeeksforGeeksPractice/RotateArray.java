package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/array-rotation/
 */
/**
 * Implementation of Rotate Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RotateArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Rotates the .
	 *
	 * @param arr the array to process
	 * @param times the times parameter
	 */
	private static void rotate(int[] arr, int times) {
		int temp[]=Arrays.copyOfRange(arr, 0, times);
		int count=times;
		// Iterate through all elements
		for (int i = 0; i < arr.length-times; i++) {
			arr[i]=arr[i+times];
			count=i;
		}
		// Iterate through all elements
		for (int i = 0; i < temp.length; i++) {
			arr[count+1]=temp[i];
			count++;
		}
	}

}
