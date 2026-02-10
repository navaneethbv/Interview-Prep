package GeeksforGeeksPractice;

import java.util.HashMap;

/*
 * Link : http://www.geeksforgeeks.org/check-given-array-contains-duplicate-elements-within-k-distance/
 */
/**
 * Implementation of Array Element Distance Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayElementDistanceCheck {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int k=3;
		int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
		System.out.println(findDuplicates(arr,k));
		arr=new int[]{1, 2, 3, 1, 4, 5};
		System.out.println(findDuplicates(arr,k));
		arr=new int[]{1, 2, 3, 4, 5};
		System.out.println(findDuplicates(arr,k));
		arr=new int[]{1, 2, 3, 4, 4};
		System.out.println(findDuplicates(arr,k));
	}

	/**
	 * Finds duplicates in the data structure.
	 *
	 * @param arr the array to process
	 * @param k the k value
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findDuplicates(int[] arr, int k) {
		HashMap<Integer, Integer> elementMap=new HashMap<Integer, Integer>();
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			int element=arr[i];
			if(elementMap.containsKey(element))
			{
				if(i-elementMap.get(element)>(k))
				{
					elementMap.put(element, i);
				}
				else{
					return true;
				}
			}
			else{
				elementMap.put(element, i);
			}
		}
		return false;
	}



}
