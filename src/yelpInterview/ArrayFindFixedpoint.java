package yelpInterview;

/**
 * Implementation of Array Find Fixedpoint algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayFindFixedpoint {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int[] inputArray=new int[]{-10, -5, 0, 3, 7};
		System.out.println(findFixedPoint(inputArray));
		inputArray=new int[]{0, 2, 5, 8, 17};
		System.out.println(findFixedPoint(inputArray));
		inputArray=new int[]{-10, -5, 3, 4, 7, 9};
		System.out.println(findFixedPoint(inputArray));
	}

	/**
	 * Finds fixed point in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findFixedPoint(int[] inputArray) {
		// Recursively process left and right subtrees
		return findFixedPointUtil(inputArray,0,inputArray.length-1);
	}

	/**
	 * Finds fixed point util in the data structure.
	 *
	 * @param inputArray the array to process
	 * @param low the low parameter
	 * @param high the high parameter
	 * @return the computed integer result
	 */
	private static int findFixedPointUtil(int[] inputArray, int low, int high) {
		if(low<=high)
		{
			int mid=(low+high)/2;
			if(inputArray[mid]==mid)
				return mid;
			if(inputArray[mid]>mid)
			{
				// Recursively process left and right subtrees
				return findFixedPointUtil(inputArray,low,mid-1);
			}
			else{
				// Recursively process left and right subtrees
				return findFixedPointUtil(inputArray,mid+1,high);				
			}
		}
		return -1;
	}


}