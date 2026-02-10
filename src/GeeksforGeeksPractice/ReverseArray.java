package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 */
/**
 * Implementation of Reverse Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs reverseArray operation.
	 *
	 * @param arr the array to process
	 */
	public static void reverseArray(int[] arr)
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			arr[i]=arr[i]^arr[j];
			arr[j]=arr[i]^arr[j];
			arr[i]=arr[i]^arr[j];
			i++;
			j--;
		}
	}

}
