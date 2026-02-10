package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
/**
 * Implementation of Largest Contigous Sub Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LargestContigousSubArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds largest sub array in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findLargestSubArray(int[] inputArray) {
		int maxSoFAr=0,maxEndingHere=0;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			maxEndingHere=maxEndingHere+inputArray[i];
			if(maxEndingHere<0)
				maxEndingHere=0;
			maxSoFAr=Math.max(maxSoFAr, maxEndingHere);
		}
		return maxSoFAr;
	}

}
