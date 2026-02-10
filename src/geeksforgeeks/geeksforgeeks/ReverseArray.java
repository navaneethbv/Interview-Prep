package geeksforgeeks;

/**
 * Implementation of Reverse Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseArray {
	/**
	 * Performs reverseArray operation.
	 *
	 * @param arr the array to process
	 * @param start the start parameter
	 * @param end the end parameter
	 */
	public static void reverseArray(int[] arr, int start, int end)
	{
		 int temp;
		    while (start < end)
		    {
		        temp = arr[start];   
		        arr[start] = arr[end];
		        arr[end] = temp;
		        start++;
		        end--;
		    }   
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)
	{
		int A[] = {1, 2, 3, 4, 5, 6};
		reverseArray(A, 0, A.length-1);
		int i;
		  for (i=0; i < A.length; i++)
		   System.out.print(A[i]+" ");
	}
}
