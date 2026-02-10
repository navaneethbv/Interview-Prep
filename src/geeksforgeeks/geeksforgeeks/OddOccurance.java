package geeksforgeeks;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of Odd Occurance algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class OddOccurance {
	
	/**
	 * Performs oddOccurance operation.
	 *
	 * @param array the array to process
	 */
	public static void oddOccurance(int[] array)
	public static void oddOccurance(int[] array)
	{
		Set<Integer> set = new HashSet<>();
		
			for (int i = 0; i < array.length; i++) {
				if(set.contains(array[i]))
				{
					set.remove(array[i]);
				}
				else
				{
					set.add(array[i]);
				}
			}
			System.out.println("Oddly occuring elements ");

			StringBuilder sb = new StringBuilder();
			for (Integer i : set){
			sb.append(i).append(' ');
			}

			System.out.println(sb.toString());
	}

/**
 * Performs oddOccurance operation.
 *
 * @param array the array to process
 * @return the computed integer result
 */
/*	public static int oddOccurance(int[] array)
/*	public static int oddOccurance(int[] array)
	{
		int i, res = 0;
		for(i=0;i<array.length;i++)
		{
			res = res ^ array[i];
		}
		return res;
	}*/
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
