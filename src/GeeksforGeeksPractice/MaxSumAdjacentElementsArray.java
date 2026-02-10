package GeeksforGeeksPractice;

/*
 * http://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
 */
/**
 * Implementation of Max Sum Adjacent Elements Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MaxSumAdjacentElementsArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds max sum in the data structure.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findMaxSum(int[] arr) {
		int incl=arr[0],excl=0;
		for (int i = 1; i < arr.length; i++) {
			int excl_new= excl>incl?excl:incl;
			incl=excl+arr[i];
			excl=excl_new;
		}
		return excl>incl?excl:incl;
	}

	
}
