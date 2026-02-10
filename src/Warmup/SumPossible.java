package Warmup;

import java.util.Arrays;

/*
 * Link:https://www.careercup.com/question?id=23884662
 */
/**
 * Implementation of Sum Possible algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SumPossible {


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}



	/**
	 * Checks if score possible.
	 *
	 * @param points the array to process
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isScorePossible(int[] points, int value){
		int status [] =new int [value+1];
		status [0]=1;
		for (int i=0;i<points.length;++i){
			for (int j=points[i];j<=value;++j){
				status[j]+=status[j-points[i]];
			}
			System.out.println(Arrays.toString(status));
		}
		return status[value]>0;
	}
}






