package GeeksforGeeksPractice;

/*
 * Link: http://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */
/**
 * Implementation of Max And Min Of Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaxAndMinOfArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds max min in the data structure.
	 *
	 * @param arr the array to process
	 */
	private static void findMaxMin(int[] arr) {
		int max=arr[0],min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min+"/"+max);
	}



}
