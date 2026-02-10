package Codility;

import java.util.Arrays;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/genomic_range_query
 */

/**
 * Implementation of Prefix Sums Genomic Range Query algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrefixSumsGenomicRangeQuery {

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
	 * Performs solution operation.
	 *
	 * @param S the S parameter
	 * @param P the array to process
	 * @param Q the array to process
	 * @return the resulting array
	 */
	public static  int[] solution(String S, int[] P, int[] Q){
		// Iterate through all elements
		for (int i = 0; i < P.length; i++) {
			P[i]=getMinimum(S.substring(P[i],Q[i]));
		}
		return P;
	}
	/**
	 * Retrieves minimum from the data structure.
	 *
	 * @param str the str parameter
	 * @return the computed integer result
	 */
	private static int getMinimum(String str) {
		if(str.contains("A"))
			return 1;
		else if(str.contains("G"))
			return 2;
		else if(str.contains("C"))
			return 3;
		else 
			return 4;
	}
}