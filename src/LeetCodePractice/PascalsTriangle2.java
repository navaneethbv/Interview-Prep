package LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Pascals Triangle2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PascalsTriangle2 {

	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;
		TreeLinkNode(int x) { val = x; }
	}

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
	 * Retrieves row from the data structure.
	 *
	 * @param numRows the numRows parameter
	 * @return the list of results
	 */
	public static List<Integer> getRow(int numRows) {
		List<List<Integer>> outputList=new ArrayList<List<Integer>>();
		for (int i = 0; i <=numRows; i++) {
			// Check for null/base case
			if(outputList.size()==0){
				ArrayList<Integer> newList=new ArrayList<>();
				newList.add(1);
				outputList.add(newList);
			}
			else{
				ArrayList<Integer> aList=(ArrayList<Integer>) outputList.get(outputList.size()-1);
				ArrayList<Integer> newList=new ArrayList<>();
				// Inner loop to check combinations
				for (int j = 0; j < aList.size(); j++) {
					// Check for null/base case
					if(j==0 )
					{
						newList.add(aList.get(0));
					}
					else{
						newList.add(aList.get(j-1)+aList.get(j));
					}
				}
				newList.add(aList.get(0));
				outputList.add(newList);
			}
		}
		return outputList.get(outputList.size()-1);
	}

}

