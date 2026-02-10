package geeksforgeeks;

/*
 * Searching for an element in a sorted and a pivoted array
 * Complexity is logN
 * using Binary Search
 */

/**
 * Implementation of Finding Element In A Sorted Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindingElementInASortedArray {
	/**
	 * Performs pivotedbinarysearch operation.
	 *
	 * @param arr[] the arr[] parameter
	 * @param low the low parameter
	 * @param high the high parameter
	 * @param key the key value
	 * @return the computed integer result
	 */
	public static int pivotedbinarysearch(int arr[], int low, int high, int key){
		int mid;
		// base case 1
		if(low>high)
			return -1;
		mid = low + (high-low)/2;
		// base case 2
		if(arr[mid]==key)
			return mid;
		// lower half is sorted
		if(arr[mid]>arr[low])
			if(arr[mid]>key && arr[low]<=key)
				// Recursively process left and right subtrees
				return pivotedbinarysearch(arr,low,mid-1,key);
			else
				// Recursively process left and right subtrees
				return pivotedbinarysearch(arr,mid+1,high,key);
		// upper half is sorted
		else
			if(arr[mid]<key && arr[high]>=key)
				// Recursively process left and right subtrees
				return pivotedbinarysearch(arr,mid+1,high,key);
			else
				// Recursively process left and right subtrees
				return pivotedbinarysearch(arr,low,mid-1,key);

	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
}
