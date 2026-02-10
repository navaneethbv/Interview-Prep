package geeksforgeeks;

/*
 * Searching for an element in a sorted and a pivoted array
 * Complexity is logN
 * using Binary Search
 */

public class FindingElementInASortedArray {
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
				return pivotedbinarysearch(arr,low,mid-1,key);
			else
				return pivotedbinarysearch(arr,mid+1,high,key);
		// upper half is sorted
		else
			if(arr[mid]<key && arr[high]>=key)
				return pivotedbinarysearch(arr,mid+1,high,key);
			else
				return pivotedbinarysearch(arr,low,mid-1,key);

	}

	public static void main(String[] args) {
		int[] A = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		int key = 6;
		System.out.println("Element found at Index "+pivotedbinarysearch(A, 0, A.length, key));
	}
}
