package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link:http://www.geeksforgeeks.org/two-elements-whose-sum-is-closest-to-zero/
 */
/**
 * Implementation of Elements Zero Sum Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ElementsZeroSumArray {
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
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findElementsSum(int[] arr) {
		int l=0,r=arr.length-1;
		Arrays.sort(arr);
		int minSum=Integer.MAX_VALUE,sum=Integer.MAX_VALUE;
		System.out.println(Arrays.toString(arr));
		while(l<r)
		{
			sum=arr[l]+arr[r];
			if(Math.abs(sum)<Math.abs(minSum))
				minSum=sum;
			// Check for null/base case
			if(arr[l]+arr[r]==0)
				return 0;
			else if(arr[l]+arr[r]>0)
				r--;
			else
				l++;
		}
		return minSum;
	}
}
