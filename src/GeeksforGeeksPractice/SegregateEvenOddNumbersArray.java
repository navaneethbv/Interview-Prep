package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link: http://www.geeksforgeeks.org/segregate-even-and-odd-numbers/
 */
/**
 * Implementation of Segregate Even Odd Numbers Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SegregateEvenOddNumbersArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs segregateNumbers operation.
	 *
	 * @param arr the array to process
	 */
	private static void segregateNumbers(int[] arr) {
		int left=0,right=arr.length-1;
		while(left<right)
		{
			while(arr[left]%2==0)
			{
				left++;
			}
			while(arr[right]%2!=0)
			{
				right--;
			}
			if(left>=right)
				break;
			arr[left]=arr[left]^arr[right];
			arr[right]=arr[left]^arr[right];
			arr[left]=arr[left]^arr[right];
		}
		System.out.println(Arrays.toString(arr));
	}

	
}
