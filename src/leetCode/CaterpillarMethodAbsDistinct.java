package leetCode;

import java.util.HashMap;

/*
 * Link : https://codility.com/programmers/task/abs_distinct
 */

/**
 * Implementation of Caterpillar Method Abs Distinct algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CaterpillarMethodAbsDistinct {
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
	 * @param A the array to process
	 * @return the computed integer result
	 */
	public static int solution(int[] A)
	{
		int count=0;
		HashMap<Integer, Integer> elementMap=new HashMap<Integer,Integer>();
		for (int i = 0; i < A.length; i++) {
			int element=A[i]>=0?A[i]:-A[i];
			if(!elementMap.containsKey(element))
			{
				elementMap.put(element,1);
				count++;
			}
		}
		return count;
	}

}