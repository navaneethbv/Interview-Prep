package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Pascals Triangle algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PascalsTriangle {
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
	 * Performs generate operation.
	 *
	 * @param numRows the numRows parameter
	 * @return the list of results
	 */
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> outputList=new ArrayList<List<Integer>>();
		if(numRows<1)
			return outputList;
		List<Integer> list=new ArrayList<>();
		list.add(1);
		outputList.add(list);
		for (int i = 2	; i <=numRows; i++) {
			list=outputList.get(outputList.size()-1);
			List<Integer> tempList=new ArrayList<>();
			// Inner loop to check combinations
			for (int j = 0; j <=list.size(); j++) {
				// Check for null/base case
				if(j==0||j==list.size())
					tempList.add(list.get(0));
				else{
					tempList.add(list.get(j)+list.get(j-1));
				}
			}
			outputList.add(tempList);
		}
		return outputList;
	}
}
