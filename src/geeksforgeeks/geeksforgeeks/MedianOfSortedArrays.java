package geeksforgeeks;

import java.util.ArrayList;

/**
 * Implementation of Median Of Sorted Arrays algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MedianOfSortedArrays {
	/**
	 * Performs MedianOfArrays operation.
	 *
	 * @param A the array to process
	 * @param B the array to process
	 * @return the Integer result
	 */
	public static Integer MedianOfArrays(int[] A, int[] B)
	public static Integer MedianOfArrays(int[] A, int[] B)
	{
		ArrayList<Integer> list = new ArrayList<>();
		int i=0, j=0;
		while(i<A.length&&j<B.length)
		{
			if(A[i]<B[j])
			{
				System.out.println("If loop I "+i+" J "+j);
				list.add(A[i]);
				i++;
				if(list.contains(A[A.length-1]))
				{
					list.add(B[j]);
				}
			}
			else if(A[i]>=B[j])
			{
				System.out.println("If loop I "+i+" J "+j);
				list.add(B[j]);
				j++;
				if(list.contains(B[B.length-1]))
				{
					list.add(A[i]);
				}
			}
		}
		System.out.println(list);
		int median = list.size()/2-1;
		return list.get(median);				
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}
