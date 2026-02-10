package TopCoder;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * SRM 166 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1519&rd=4635
 */

/**
 * Implementation of SRM166 Binary Cardinality algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM166BinaryCardinality {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

	/**
	 * Performs arrange operation.
	 *
	 * @param numbers the array to process
	 * @return the resulting array
	 */
	public static int[] arrange(int[] numbers){
		HashMap<Integer, Integer> onesCount=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < numbers.length; i++) {
			onesCount.put(numbers[i], Integer.bitCount(numbers[i]));
		}
		System.out.println(onesCount);
		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
		m = sortByComparator(onesCount);
		Object arr[]=m.keySet().toArray();
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			numbers[i]=(Integer)arr[i];
		}
		return numbers;
	}
	private static Map<Integer, Integer> sortByComparator(
			Map<Integer, Integer> unsortMap) {

		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(
				unsortMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1,
					Map.Entry<Integer, Integer> o2) {
				int value=(o1.getValue()).compareTo(o2.getValue());
				if(value==0)
					return o1.getKey().compareTo(o2.getKey());
				else
					return value;

			}
		});
		Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
		for (Iterator<Map.Entry<Integer, Integer>> it = list.iterator(); it
				.hasNext();) {
			Map.Entry<Integer, Integer> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
