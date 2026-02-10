package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 */
/**
 * Implementation of Paired Sum Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PairedSumArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs checkPair operation.
	 *
	 * @param a the array to process
	 * @param sum the sum parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkPair(int[] a, int sum) {
		Arrays.sort(a);
		int l=0,r=a.length-1;
		while(l<r){
			if(a[l]+a[r]==sum)
				return true;
			else if(a[l]+a[r]>sum)
				r--;
			else
				l++;
		}
		
		return false;
	}

}
