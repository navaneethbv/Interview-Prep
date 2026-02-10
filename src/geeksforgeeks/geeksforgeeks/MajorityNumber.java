package geeksforgeeks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of Majority Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MajorityNumber {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Integer arr[] = { 2, 3, 2, 1, 2, 2, 3, 2, 1 };
		HashMap<Integer,Integer> countMap = new HashMap<>();
		for (Integer integer : arr) {
			Integer count = countMap.get(integer);
			if (count == null) {
				count = 0;
			}
			count++;
			countMap.put(integer, count);
			if (count > arr.length / 2) {
				System.out.println("Majority element: " + integer);
				return;
			}
		}
		System.out.println("NONE");

	}
	/**
	 * Checks if majority.
	 *
	 * @param arr the array to process
	 * @return true if condition is met, false otherwise
	 */
	/*public static boolean isMajority(int[] arr)
	/*public static boolean isMajority(int[] arr)
	{
		int halfsize = arr.length/2;
		Map<Integer, Integer> hash = new HashMap<>();

		for(int i=0;i<arr.length;i++)
		{

			if(hash.containsKey(arr[i]))
			{

				hash.put(arr[i], hash.get(arr[i])+1);

			}
			else

				hash.put(arr[i],1);

		}
		if(Collections.max(hash.values())>halfsize)
		{
			return true;
		}
		return false;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main (String[] args) {
		int[] arr = {2,2,2,3,3,3,3,5,6};

		if(isMajority(arr))
			System.out.println("Majority Number");
		else
			System.out.println("None");
	}
*/}
