package yelpInterview;

/**
 * Implementation of Algo Binary Search algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AlgoBinarySearch {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs binSearch operation.
	 *
	 * @param inputArray the array to process
	 * @param key the key value
	 * @return the computed integer result
	 */
	private static int binSearch(int[] inputArray, int key) {
		int low=0,high=inputArray.length-1;
		while(low<high)
		{
			int mid=(low+high)/2;
			if(inputArray[mid]==key)
			{
				return mid;
			}
			else if(inputArray[mid]>key)
			{
				high=mid-1;
			}else if(inputArray[mid]<key)
			{
				low=mid+1;
			}
		}
		return -1;
	}



}

