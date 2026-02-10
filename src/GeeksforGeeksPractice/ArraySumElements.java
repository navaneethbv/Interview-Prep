package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 */
/**
 * Implementation of Array Sum Elements algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArraySumElements {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds elements sum in the data structure.
	 *
	 * @param inputArray the array to process
	 * @param sum the sum parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findElementsSum(int[] inputArray, int sum) {
		int l=0,r=inputArray.length-1;
		Arrays.sort(inputArray);
		while(l<r)
		{
			if(inputArray[l]+inputArray[r]==sum)
				return true;
			else if(inputArray[l]+inputArray[r]>sum)
				r--;
			else if(inputArray[l]+inputArray[r]<sum)
				l++;
		}	
		return false;
	}



}
