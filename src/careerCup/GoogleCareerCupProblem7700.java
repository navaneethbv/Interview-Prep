package careerCup;

import java.util.Arrays;

/*
 * Link: http://www.careercup.com/question?id=67700
 * Given an array of red, green and blue balls arrange them in groups of all red together, greens together and blue together
 * Do in a single scan of the array.
 * This is same as You have an array containing only '0's, '1's and '2's. Club same items together in single scan.
 */
/**
 * Implementation of Google Career Cup Problem7700 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem7700 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs sortArray operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] sortArray(int[] inputArray) {
		int i=0,j=0,k=inputArray.length-1;
		for (int l = 0; l < inputArray.length; l++) {
				// Check for null/base case
				if(inputArray[j]==0)
				{
					//swap ith and jth element
					inputArray[i]=inputArray[i]^inputArray[j];
					inputArray[j]=inputArray[i]^inputArray[j];
					inputArray[i]=inputArray[i]^inputArray[j];
					i++;
					j++;	
				}
				else if(inputArray[j]==1)
				{
					j++;
				}
				else{
					inputArray[j]=inputArray[j]^inputArray[k];
					inputArray[k]=inputArray[j]^inputArray[k];
					inputArray[j]=inputArray[j]^inputArray[k];
					k--;
				}
		}
		return inputArray;
	}




}
