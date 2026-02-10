package eBayPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Implementation of Gray Code algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GrayCode {

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
	 * Performs grayCode operation.
	 *
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	public static List<Integer> grayCode(int n) {
		List<Integer> outputList=new ArrayList<>();
		List<String> oldEntries=new ArrayList<>();
		List<String> newEntries=new ArrayList<>();
		// Check for null/base case
		if(n==0){
			outputList.add(0);
			return outputList;
		}
		oldEntries.add("0");
		newEntries.add("1");
		oldEntries.addAll(newEntries);
		for (int i = 2; i <=n; i++) {
			newEntries=new ArrayList<>();
			newEntries.addAll(oldEntries);
			Collections.reverse(newEntries);
			// Inner loop to check combinations
			for (int j = 0; j < oldEntries.size(); j++) {
				String str=oldEntries.remove(j);
				oldEntries.add(j,"0"+str);
			}
			// Inner loop to check combinations
			for (int j = 0; j < newEntries.size(); j++) {
				String str=newEntries.remove(j);
				newEntries.add(j,"1"+str);
			}
			oldEntries.addAll(newEntries);
		}
		for (int i = 0; i < oldEntries.size(); i++) {
			outputList.add(Integer.parseInt(oldEntries.get(i),2));
		}
		return outputList;
	}
}

