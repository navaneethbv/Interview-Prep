package yelpInterview;

/**
 * Implementation of Array Check Elements Consecutive algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayCheckElementsConsecutive {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int arr[] = {5, 2, 3, 1, 4};
		System.out.println(checkElementsConsecutive(arr));
		arr = new int[] {83, 78, 80, 81, 79, 82};
		System.out.println(checkElementsConsecutive(arr));
		arr = new int[]{34, 23, 52, 12, 3 };
		System.out.println(checkElementsConsecutive(arr));
		arr = new int[]{7, 6, 5, 5, 3, 4};
		System.out.println(checkElementsConsecutive(arr));
	}

	/**
	 * Performs checkElementsConsecutive operation.
	 *
	 * @param arr the array to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkElementsConsecutive(int[] arr) {
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
		}
		if(max-min!=arr.length-1)
			return false;
		boolean b[]=new boolean[arr.length];
		// Iterate through all elements
		for (int i = 0; i < b.length; i++) {
			b[max-arr[i]]=true;
		}
		// Iterate through all elements
		for (int i = 0; i < b.length; i++) {
			if(!b[i])
				return false;
		}
		return true;
	}


}