package servicenowPrep;

import java.util.HashMap;

/**
 * Implementation of Majority Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MajorityElement
{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}
	static HashMap<Integer, Integer> elementCountMap=new HashMap<>();
	/**
	 * Finds majority element in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findMajorityElement(int[] inputArray) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			if(elementCountMap.containsKey(inputArray[i]))
			{
				elementCountMap.put(inputArray[i], elementCountMap.get(inputArray[i])+1);
			}
			else{
				elementCountMap.put(inputArray[i],1);
			}
		}
		Object[] keyArr=elementCountMap.keySet().toArray();
		int maxCount=0,element=0;
		// Iterate through all elements
		for (int i = 0; i < keyArr.length; i++) {
			if(elementCountMap.get(keyArr[i])>maxCount)
			{
				maxCount=elementCountMap.get(keyArr[i]);
				element=(int) keyArr[i];
			}
		}
		return element;
	}

	
}