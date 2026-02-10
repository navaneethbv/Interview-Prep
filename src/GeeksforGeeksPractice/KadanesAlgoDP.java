package GeeksforGeeksPractice;

/*
 * Link: http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
/**
 * Implementation of Kadanes Algo DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class KadanesAlgoDP {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds lcs in the data structure.
	 *
	 * @param arr the array to process
	 * @return the computed integer result
	 */
	private static int findLCS(int[] arr) {
		int maxSoFar=0,maxEndingHere=0;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			maxEndingHere+=arr[i];
			if(maxEndingHere<0)
				maxEndingHere=0;
			maxSoFar=Math.max(maxEndingHere, maxSoFar);
		}
		return maxSoFar;
	}

}
