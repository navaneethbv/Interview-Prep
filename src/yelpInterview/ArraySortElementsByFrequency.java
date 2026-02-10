package yelpInterview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Implementation of Array Sort Elements By Frequency algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArraySortElementsByFrequency {
	/**
	 * Inner class PositionCount for supporting operations.
	 */
	static class PositionCount{
		int index;
		int count;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

	/**
	 * Performs sortByFrequency operation.
	 *
	 * @param inputArray the array to process
	 */
	private static void sortByFrequency(int[] inputArray) {
		HashMap<Integer,PositionCount> map=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			if(map.containsKey(inputArray[i]))
			{
				PositionCount pc=map.get(inputArray[i]);
				pc.count++;
				map.put(inputArray[i], pc);
			}
			else{
				PositionCount pc=new PositionCount();
				pc.count=1;
				pc.index=i;
				map.put(inputArray[i], pc);
			}
		}
		Map sortedMap = sortByValue(map);
		System.out.println(sortedMap);


	}
	/**
	 * Performs sortByValue operation.
	 *
	 * @param unsortedMap the unsortedMap parameter
	 * @return the Map result
	 */
	public static Map sortByValue(Map unsortedMap) {
		Map sortedMap = new TreeMap(new ValueComparator(unsortedMap));
		sortedMap.putAll(unsortedMap);
		return sortedMap;
	}

	/**
	 * Inner class ValueComparator for supporting operations.
	 */
	static class ValueComparator implements Comparator {
		Map map;

		public ValueComparator(Map map) {
			this.map = map;
		}

		@Override
		/**
		 * Performs compare operation.
		 *
		 * @param keyA the keyA parameter
		 * @param keyB the keyB parameter
		 * @return the computed integer result
		 */
		public int compare(Object keyA, Object keyB) {
			PositionCount pc1=(PositionCount) map.get(keyA);
			PositionCount pc2=(PositionCount) map.get(keyB);
			if(pc1.count==pc2.count){
				return pc1.index>pc2.index?1:-1;
			}
			else{
				return pc1.count>pc2.count?-1:+1;
			}
		}
	}


}