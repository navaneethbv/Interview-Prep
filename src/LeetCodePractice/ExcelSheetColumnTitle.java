package LeetCodePractice;

import java.util.HashMap;

/**
 * Implementation of Excel Sheet Column Title algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ExcelSheetColumnTitle {

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
	 * Performs convertToTitle operation.
	 *
	 * @param n the size or count parameter
	 * @return the resulting string
	 */
	public static String convertToTitle(int n) {
		HashMap<Integer, String> elemMap=new HashMap<>();
		for (int i = 1; i <=26; i++) {
			elemMap.put(i, (char)(64+i)+"");
		}	
		if(n<=26)
			return elemMap.get(n);
		StringBuilder sb=new StringBuilder();
		while(n>0)
		{
			n--;
			sb.append(elemMap.get(n%26));
			n=n/26;

		}
		
		return sb.toString();
	}
}

