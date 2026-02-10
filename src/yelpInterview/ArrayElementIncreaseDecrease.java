package yelpInterview;

/**
 * Implementation of Array Element Increase Decrease algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayElementIncreaseDecrease {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int[] inputArray=new int[]{8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
		System.out.println(findElement(inputArray));
		inputArray=new int[]{1, 3, 50, 10, 9, 7, 6};
		System.out.println(findElement(inputArray));
		inputArray=new int[]{10, 20, 30, 40, 50};
		System.out.println(findElement(inputArray));
		inputArray=new int[]{120, 100, 80, 20, 0};
		System.out.println(findElement(inputArray));
	}

	/**
	 * Finds element in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findElement(int[] inputArray) {
		// Recursively process left and right subtrees
		return findElementUtil(inputArray,0,inputArray.length-1);
	}

	/**
	 * Finds element util in the data structure.
	 *
	 * @param inputArray the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @return the computed integer result
	 */
	private static int findElementUtil(int[] inputArray, int low, int high) {
		if(low==high)
			return inputArray[low];
		if(low+1==high)
			return Math.max(inputArray[low], inputArray[high]);
		if(low<=high){
			int mid=(low+high)/2;
			if((inputArray[mid]>inputArray[mid-1]) && (inputArray[mid]>inputArray[mid+1]))
				return inputArray[mid];
			else if((inputArray[mid]<inputArray[mid+1]))
				// Recursively process left and right subtrees
				return findElementUtil(inputArray,mid+1,high);
			else
				// Recursively process left and right subtrees
				return findElementUtil(inputArray,low,mid-1);
		}
		return -1;
	}

}