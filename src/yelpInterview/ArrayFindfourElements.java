package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Findfour Elements algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayFindfourElements {
	static boolean[][] visited;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}
	/**
	 * Finds four elements in the data structure.
	 *
	 * @param inputArray the array to process
	 * @param x the x parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findFourElements(int[] inputArray, int x) {
		Arrays.sort(inputArray);
		// Iterate through all elements
		for (int i = 0; i < inputArray.length-3; i++) {
			for (int j = i+1; j < inputArray.length-2; j++) {
				int low=j+1;
				int high=inputArray.length-1;
				int sum=inputArray[i]+inputArray[j];
				while(low<high)
				{	
					int totalSum=sum+inputArray[low]+inputArray[high];
					if(totalSum==x){
						System.out.println(inputArray[i]+"/"+inputArray[j]+"/"+inputArray[low]+"/"+inputArray[high]);
						return true;
					}
					if(totalSum>x)
					{
						high--;
					}
					else
						low++;
				}
			}
		}
		return false;
	}



}