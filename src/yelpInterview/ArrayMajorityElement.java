package yelpInterview;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of Array Majority Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayMajorityElement {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Finds majority element in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the resulting string
	 */
	private static String findMajorityElement(int[] inputArray) {
		HashMap<Integer, Integer> elementCount=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			if(elementCount.containsKey(inputArray[i]))
			{
				elementCount.put(inputArray[i], elementCount.get(inputArray[i])+1);
			}
			else
				elementCount.put(inputArray[i], 1);
		}
		Map<Integer, Integer> map =elementCount;
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>inputArray.length/2)
				return entry.getKey()+"";
		}
		return "NONE";
	}

}

