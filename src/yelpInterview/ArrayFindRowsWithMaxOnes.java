package yelpInterview;

/**
 * Implementation of Array Find Rows With Max Ones algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayFindRowsWithMaxOnes {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int inputArray[][]=new int[][]{ {0, 0, 0, 1},
			{0, 1, 1, 1},
			{1, 1, 1, 1},
			{0, 0, 0, 0}};
			System.out.println(findMaxOnes(inputArray));
	}

	/**
	 * Finds max ones in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findMaxOnes(int[][] inputArray) {
		int count=0;
		int outputIndex=-1;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			int index=findStartPoint(inputArray[i],0,inputArray[0].length-1,1);
			if(index!=-1)
			{
				if(count<inputArray[0].length-index)
				{
					count=inputArray[0].length-index;
					outputIndex=i;
				}
			}
		}
		return outputIndex;
	}

	/**
	 * Finds start point in the data structure.
	 *
	 * @param arr the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @param key the key value
	 * @return the computed integer result
	 */
	private static int findStartPoint(int[] arr,int low,int high,int key) {
		if(low<=high){
			int mid=(low+high)/2;
			// Check for null/base case
			if((mid==0 ||arr[mid-1]<arr[mid]) && arr[mid]==key)
				return mid;
			if(arr[mid]<key){
				// Recursively process left and right subtrees
				return findStartPoint(arr, mid+1, high, key);
			}
			else{
				// Recursively process left and right subtrees
				return findStartPoint(arr, low, mid-1, key);
			}
		}
		return -1;
	}
}