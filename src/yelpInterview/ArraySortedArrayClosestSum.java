package yelpInterview;

/**
 * Implementation of Array Sorted Array Closest Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArraySortedArrayClosestSum {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int arr[] = {10, 22, 28, 29, 30, 40};
		int x = 54;
		printClosestSum(arr,x);
		arr = new int[]{1, 3, 4, 7, 10};
		x = 15;
		printClosestSum(arr,x);
	}

	/**
	 * Performs printClosestSum operation.
	 *
	 * @param arr the array to process
	 * @param x the x parameter
	 */
	private static void printClosestSum(int[] arr, int x) {
		int l=0,r=arr.length-1;
		int resLow=0,resHigh=0,diff=Integer.MAX_VALUE;
		while(l<r)
		{
			if (Math.abs(arr[l] + arr[r] - x) < diff)
			{
				resLow = l;
				resHigh = r;
				diff = Math.abs(arr[l] + arr[r] - x);
			}
			if (arr[l] + arr[r] > x)
				r--;
			else 
				l++;
		}
		System.out.println(arr[resLow]+"/"+arr[resHigh]);
	}

}