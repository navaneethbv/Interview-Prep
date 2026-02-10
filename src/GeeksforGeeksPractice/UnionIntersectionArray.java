package GeeksforGeeksPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Link: http://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/
 */
/**
 * Implementation of Union Intersection Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UnionIntersectionArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds union intersection in the data structure.
	 *
	 * @param arr1 the array to process
	 * @param arr2 the array to process
	 */
	private static void findUnionIntersection(int[] arr1, int[] arr2) {
		Map<Integer,Integer> elementMap=new HashMap<>();
		
		// Iterate through all elements
		for (int i = 0; i < arr1.length; i++) {
			if(elementMap.containsKey(arr1[i]))
				elementMap.put(arr1[i],elementMap.get(arr1[i])+1);
			else
				elementMap.put(arr1[i],1);
		}
		// Iterate through all elements
		for (int i = 0; i < arr2.length; i++) {
			if(elementMap.containsKey(arr2[i]))
				elementMap.put(arr2[i],elementMap.get(arr2[i])+1);
			else
				elementMap.put(arr2[i],1);
		}
		ArrayList<Integer> unionList=new ArrayList<>();
		ArrayList<Integer> intersectionList=new ArrayList<>();
		for (Iterator iterator = elementMap.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry<Integer, Integer> m=(Entry<Integer, Integer>) iterator.next();
			if(m.getValue()>1)
			{
				intersectionList.add(m.getKey());
			}
			unionList.add(m.getKey());
		}
		System.out.println(Arrays.toString(unionList.toArray()));
		System.out.println(Arrays.toString(intersectionList.toArray()));		
	}

	
}
