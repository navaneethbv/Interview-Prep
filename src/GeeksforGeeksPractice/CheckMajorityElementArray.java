package GeeksforGeeksPractice;

/*
 * Link: http://www.geeksforgeeks.org/check-for-majority-element-in-a-sorted-array/
 */
/**
 * Implementation of Check Majority Element Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CheckMajorityElementArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 3, 3, 3, 10};
		int x = 3;
		System.out.println(checkMajority(arr,x));
		arr = new int[]{1, 1, 2, 4, 4, 4, 6, 6};
		x = 4;
		System.out.println(checkMajority(arr,x));
		arr = new int[]{1, 1, 1, 2, 2};
		x = 1;
		System.out.println(checkMajority(arr,x));
	}

	/**
	 * Performs checkMajority operation.
	 *
	 * @param arr the array to process
	 * @param x the x parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkMajority(int[] arr, int x) {
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==x)count++;
		}
		return count>arr.length/2?true:false;
	}

}
