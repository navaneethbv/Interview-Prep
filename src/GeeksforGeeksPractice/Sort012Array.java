package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link: http://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 */
/**
 * Implementation of Sort012 Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Sort012Array {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs sortArray operation.
	 *
	 * @param arr the array to process
	 */
	private static void sortArray(int[] arr) {
		int low=0,mid=0,high=arr.length-1;
		while(mid<=high)
		{
			// Check for null/base case
			if(arr[mid]==0)
			{
				arr[low]=arr[low]^arr[mid];
				arr[mid]=arr[low]^arr[mid];
				arr[low]=arr[low]^arr[mid];
				low++;
				mid++;
			}
			else if(arr[mid]==1)
				mid++;
			else
			{
				arr[mid]=arr[mid]^arr[high];
				arr[high]=arr[mid]^arr[high];
				arr[mid]=arr[mid]^arr[high];
				high--;
			}
		}
		
	}

}
