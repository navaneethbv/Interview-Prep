package yelpInterview;

/**
 * Implementation of Array Count Ones Array Sorted algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayCountOnesArraySorted {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int arr[] ={1, 1, 0, 0, 0, 0, 0};
		System.out.println(countOnes(arr));
		arr = new int[]{1, 1, 1, 1, 1, 1, 1};
		System.out.println(countOnes(arr));
		arr = new int[]{0, 0, 0, 0, 0, 0, 0};
		System.out.println(countOnes(arr));
	}

	/**
	 * Counts the number of ones.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int countOnes(int[] arr) {
		// Recursively process left and right subtrees
		return countOnesUtil(arr,0,arr.length-1)+1;
	}

	/**
	 * Counts the number of ones util.
	 *
	 * @param arr the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @return the computed integer result
	 */
	private static int countOnesUtil(int[] arr, int low, int high) {
		if(low<=high)
		{
			int mid=(low+high)/2;
			if((mid==arr.length-1 || arr[mid+1]<1) && arr[mid]==1)
				return mid;
			if(arr[mid]<1)
			{
				// Recursively process left and right subtrees
				return countOnesUtil(arr,low,mid-1);
			}
			else
				// Recursively process left and right subtrees
				return countOnesUtil(arr,mid+1,high);
		}
		return -1;
	}



}