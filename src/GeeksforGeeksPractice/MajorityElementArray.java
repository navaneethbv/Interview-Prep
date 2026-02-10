package GeeksforGeeksPractice;

import java.util.HashMap;

/*
 * Link : http://www.geeksforgeeks.org/majority-element/
 */
/**
 * Implementation of Majority Element Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MajorityElementArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs printMajorityElement operation.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int printMajorityElement(int[] inputArray) {
		HashMap<Integer, Integer> elementMap=new HashMap<>();

		int maxCount=0,maxElement=0;
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			int element=inputArray[i];
			if(elementMap.containsKey(element))
			{
				int count=elementMap.get(element);
				elementMap.put(element, count+1);
				if(count+1>maxCount){
					maxCount=count;
					maxElement=element;
				}
			}
			else{
				elementMap.put(element, 1);
				// Check for null/base case
				if(maxCount==0){
					maxCount=1;
					maxElement=element;
				}
			}
		}
		
		if(maxCount>=inputArray.length/2)
			return maxElement;
		return Integer.MIN_VALUE;
	}

}
