package careerCup;

import java.util.Arrays;

/*
 * Link: http://www.careercup.com/question?id=245697
 * Given an array of n elements, find if there is a subset of 3 elements sum up to value T with time complexity O(nlgn).
 */
/**
 * Implementation of Google Career Cup Problem5697 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem5697 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds triplets sum in the data structure.
	 *
	 * @param inputArray the array to process
	 * @param sum the sum parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findTripletsSum(int[] inputArray, int sum) {
		Arrays.sort(inputArray);
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			int l=i+1;
			int r=inputArray.length-1;
			while(l<r)
			{
				if(inputArray[i]+inputArray[l]+inputArray[r]==sum)
				{
					return true;
				}
				else if(inputArray[i]+inputArray[l]+inputArray[r]>sum)
				{
					r--;
				}
				else
					l++;
			}
		}
		return false;
	}

}
