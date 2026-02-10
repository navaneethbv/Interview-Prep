package yelpInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Implementation of Array Union Intersection algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayUnionIntersection {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs intersection operation.
	 *
	 * @param arr1 the array to process
	 * @param arr2 the array to process
	 * @return the resulting array
	 */
	private static int[] intersection(int[] arr1, int[] arr2) {
		Set<Integer> set=new HashSet<>();
		int length=arr1.length>arr2.length?arr1.length:arr2.length;
		// Iterate through all elements
		for (int i = 0; i < length; i++) {
			if(i<arr1.length)
				set.add(arr1[i]);
			if(i<arr2.length)
				set.add(arr2[i]);
		}
		Iterator<Integer> itr=set.iterator();
		arr1=new int[set.size()];
		int counter=0;
		while(itr.hasNext())
		{
			arr1[counter]=itr.next();
			counter++;
		}
		return arr1;
	}

	/**
	 * Performs union operation.
	 *
	 * @param arr1 the array to process
	 * @param arr2 the array to process
	 * @return the resulting array
	 */
	private static int[] union(int[] arr1, int[] arr2) {
		Set<Integer> set=new HashSet<>();
		Set<Integer> outputSet=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		// Iterate through all elements
		for (int i = 0; i < arr2.length; i++) {
			if(set.contains(arr2[i]))
				outputSet.add(arr2[i]);
		}
		Iterator<Integer> itr=outputSet.iterator();
		arr1=new int[outputSet.size()];
		int counter=0;
		while(itr.hasNext())
		{
			arr1[counter]=itr.next();
			counter++;
		}
		return arr1;
	}




}