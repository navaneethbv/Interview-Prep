package leetCode;

import java.util.HashMap;

/*
 * Link : https://codility.com/programmers/task/dominator
 */

/**
 * Implementation of Leader Dominator algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LeaderDominator {
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
	public static int solution(int[] A)
	{
		HashMap<Integer, Integer> elementMap=new HashMap<>();
		elementMap.put(A[0], 1);
		int max=1;
		for (int i = 1; i < A.length; i++) {
			int element=A[i];
			if(elementMap.containsKey(element))
			{
				elementMap.put(element,elementMap.get(element)+1);
				if(elementMap.get(element)>max)
				{
					max=elementMap.get(element);
				}
			}
			else{
				elementMap.put(element,1);
			}
		}
		return max>A.length/2?max:-1;
	}
}