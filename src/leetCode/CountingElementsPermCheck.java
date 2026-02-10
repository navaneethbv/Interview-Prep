package leetCode;

import java.util.HashMap;

/*
 *  Link : https://codility.com/programmers/task/perm_check
 */

/**
 * Implementation of Counting Elements Perm Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountingElementsPermCheck {

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
	 * @param inputArray the array to process
	 * @param N the size or count parameter
	 * @return the computed integer result
	 */
	public static int solution(int[] inputArray,int N)
	{	
		HashMap<Integer,Integer> elementMap=new HashMap<>();
		int elementCount=0;
		for (int i = 0; i < inputArray.length; i++) {
			int element=inputArray[i];
			if(element<=N){
				if(elementMap.containsKey(element))
				{
					return 0;
				}
				else{
					elementMap.put(element, 1);
					elementCount++;
				}
			}
		}
		return elementCount==N?1:0;
	}
}