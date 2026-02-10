package geeksforgeeks;


/*
 * http://www.geeksforgeeks.org/amazon-interview-set-36/
 * Given an array of positive numbers, find the maximum sum
 * of a subsequence with the constraint that no 2 numbers in
 * the sequence should be adjacent in the array.
 * So 3 2 7 10 should return 13 (sum of 3 and 10) or
 * 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).
 */;
/**
 * Implementation of Amazon Interview_36_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_36_01 {
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
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findMaxSum(int[] inputArray) {
		int incl=inputArray[0];
		int excl=0;
		for (int i = 1; i < inputArray.length; i++) {
			int temp=(incl>excl)?incl:excl;
			incl=excl+inputArray[i];
			excl=temp;
		}
		return (incl>excl)?incl:excl;
	}
 }