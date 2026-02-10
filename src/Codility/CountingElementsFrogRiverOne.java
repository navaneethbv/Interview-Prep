package Codility;

import java.util.HashMap;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/frog_river_one
 */

/**
 * Implementation of Counting Elements Frog River One algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountingElementsFrogRiverOne {

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
	 * Performs solution operation.
	 *
	 * @param X the X parameter
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	public static int solution(int X, int[] inputArray)
	public static int solution(int X, int[] inputArray)
	{	
		HashMap<Integer,Integer> elementMap=new HashMap<Integer,Integer>();
		int elementCount=0;
		for (int i = 0; i < inputArray.length; i++) {
			int element=inputArray[i];
			if(element>=1 && element<=X)
			{
				if(!elementMap.containsKey(element)){
					elementMap.put(element, element);
					elementCount++;
				}
				
				if(elementCount==X)
					return i;
			}
		}
		return -1;
	}
}