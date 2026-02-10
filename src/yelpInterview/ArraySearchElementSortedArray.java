package yelpInterview;

/**
 * Implementation of Array Search Element Sorted Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArraySearchElementSortedArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Searches for element.
	 *
	 * @param arr1 the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @param key the key value
	 * @return the computed integer result
	 */
	private static int searchElement(int[] arr1,int low,int high, int key) {
		if(low<=high)
		{
			int mid=(low+high)/2;
			if(arr1[mid]==key)
				return mid;

			if(arr1[low]<=arr1[mid])//low to mid is sorted &&key lies in that range
			{
				if(key>=arr1[low] && key<=arr1[mid])
					// Recursively process left and right subtrees
					return searchElement(arr1, low, mid-1, key);
				return searchElement(arr1, mid+1, high, key);
			}
			if(key>=arr1[mid] && key<=arr1[high])
				// Recursively process left and right subtrees
				return searchElement(arr1, mid+1, high, key);
			return searchElement(arr1, low, mid-1, key);
		}
		return -1;
	}




}