package yelpInterview;

/**
 * Implementation of Array Number Of Occurences algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayNumberOfOccurences {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int arr[] = {1, 1, 2, 2, 2, 2, 3,};
		int  x = 2;
		System.out.println(findNoOfOccurences(arr,x));
		arr = new int[]{1, 1, 2, 2, 2, 2, 3,};
		x = 3;
		System.out.println(findNoOfOccurences(arr,x));
		arr = new int[]{1, 1, 2, 2, 2, 2, 3,};
		x = 1;
		System.out.println(findNoOfOccurences(arr,x));
		arr = new int[]{1, 1, 2, 2, 2, 2, 3,};
		x = 4;
		System.out.println(findNoOfOccurences(arr,x));
	}

	/**
	 * Finds no of occurences in the data structure.
	 *
	 * @param arr the array to process
	 * @param x the x parameter
	 * @return the computed integer result
	 */
	private static int findNoOfOccurences(int[] arr, int x) {
		int first=findFirstIndex(arr,0,arr.length-1,x);
		if(first==-1)
			return -1;
		int last=findLastIndex(arr,first,arr.length-1,x);
		return last-first+1;
	}

	/**
	 * Finds first index in the data structure.
	 *
	 * @param arr the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @param x the x parameter
	 * @return the computed integer result
	 */
	private static int findFirstIndex(int[] arr, int low, int high, int x) {
		if(low<=high)
		{
			int mid=(low+high)/2;
			// Check for null/base case
			if((mid==0||arr[mid-1]<x)&&arr[mid]==x)
				return mid;
			if(arr[mid]<x)
			{
				// Recursively process left and right subtrees
				return findFirstIndex(arr, mid+1, high,  x);
			}else{
				// Recursively process left and right subtrees
				return findFirstIndex( arr, low,mid-1,  x);
			}
		}
		return -1;
	}

	/**
	 * Finds last index in the data structure.
	 *
	 * @param arr the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @param x the x parameter
	 * @return the computed integer result
	 */
	private static int findLastIndex(int[] arr, int low, int high, int x) {
		if(low<=high)
		{
			int mid=(low+high)/2;
			if((mid==arr.length-1||arr[mid+1]>x)&&arr[mid]==x)
				return mid;
			if(!(x < arr[mid]))
			{
				// Recursively process left and right subtrees
				return findLastIndex(arr, mid+1, high,  x);
			}else{
				// Recursively process left and right subtrees
				return findLastIndex( arr, low,mid-1,  x);
			}
		}
		return -1;
	}

}