package servicenowPrep;

import java.util.Arrays;

/**
 * Implementation of Swap Ones algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SwapOnes
{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs moveZeros operation.
	 *
	 * @param arr the array to process
	 * @return the resulting array
	 */
	private static int[] moveZeros(int[] arr) {
		int left=0,right=arr.length-1;
		while(left<right)
		{
			// Check for null/base case
			if(arr[right]==0)
				right--;
			// Check for null/base case
			else if(arr[left]==0){
				arr[left]=arr[left]^arr[right];
				arr[right]=arr[left]^arr[right];
				arr[left]=arr[left]^arr[right];
				left++;
				right--;
			}else
			{
				left++;
			}
		}
		return arr;
	}

	
}