package LeetCodePerformancePractice;

import java.util.HashMap;

/**
 * Implementation of Bulls And Cows algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BullsAndCows {
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
	 * Retrieves hint from the data structure.
	 *
	 * @param secret the secret parameter
	 * @param guess the guess parameter
	 * @return the resulting string
	 */
	public static String getHint(String secret, String guess) {
		HashMap<Character, Integer> elementCount1=new HashMap<>();
		HashMap<Character, Integer> elementCount2=new HashMap<>();

		int bullCount=0,cowCount=0;
		// Iterate through all elements
		for (int i = 0; i < secret.length(); i++) {
			char c1=secret.charAt(i);
			char c2=guess.charAt(i);
			if(c1==c2)
			{
				bullCount++;
			}
			else{
				if(elementCount1.containsKey(c1))
				{
					elementCount1.put(c1,elementCount1.get(c1)+1);
				}
				else{
					elementCount1.put(c1, 1);
				}
				if(elementCount2.containsKey(c2))
				{
					elementCount2.put(c2,elementCount2.get(c2)+1);
				}
				else{
					elementCount2.put(c2, 1);
				}
			}
		}
		Object[] arr=elementCount1.keySet().toArray();
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			if(elementCount2.containsKey(arr[i]))
			{
				cowCount+=Math.min(elementCount1.get(arr[i]), elementCount2.get(arr[i]));
			}
		}
		return bullCount+"A"+cowCount+"B";
	}

}
