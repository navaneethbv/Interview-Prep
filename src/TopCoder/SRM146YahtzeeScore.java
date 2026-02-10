package TopCoder;

import java.util.Map;
import java.util.TreeMap;

/*
 * SRM 146 Div1
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1589
 */

/**
 * Implementation of SRM146 Yahtzee Score algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM146YahtzeeScore {
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
	 * Performs maxPoints operation.
	 *
	 * @param toss the array to process
	 * @return the computed integer result
	 */
	public static int maxPoints(int[] toss){
		TreeMap<Integer,Integer> elementCount=new TreeMap<>();
		// Iterate through all elements
		for (int i = 0; i < toss.length; i++) {
			if(!elementCount.containsKey(toss[i]))
			{
				elementCount.put(toss[i], 1);
			}
			else{
				elementCount.put(toss[i], elementCount.get(toss[i])+1);
			}
		}
		int maxValue=0;
		for (Map.Entry<Integer,Integer> entry : elementCount.entrySet())
		{
			int key=entry.getKey();
			int value=entry.getValue();
			if(key*value>maxValue)
			{
				maxValue=key*value;
			}
		}
		return maxValue;
	}
}
