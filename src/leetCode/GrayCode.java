package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Link : https://leetcode.com/problems/gray-code/
 */

/**
 * Implementation of Gray Code algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GrayCode {
	/**
	 * Performs grayCode operation.
	 *
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	public static List<Integer> grayCode(int n) {
		List<String> list=new ArrayList<>();
		list.add("0");
		list.add("1");
		List<Integer> listOutput=new ArrayList<>();
		listOutput.add(0);
		if(n<1)
			return listOutput;
		if(n==1)
		{
			return convertedList(list);
		}
		for (int i = 2; i <=n; i++) {
			List<String> tempList1=new ArrayList<>();
			List<String> tempList2=new ArrayList<>();
			// Inner loop to check combinations
			for (int j = 0; j < list.size(); j++) {
				tempList2.add(tempList2.size()-j,"1"+list.get(j));
				tempList1.add(j,"0"+list.get(j));				
			}
			tempList1.addAll(tempList2);
			list=tempList1;
		}
		return convertedList(list);
	}

	/**
	 * Performs convertedList operation.
	 *
	 * @param list the list parameter
	 * @return the list of results
	 */
	private static List<Integer> convertedList(List<String> list) {
		List<Integer> outputList=new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			outputList.add(Integer.parseInt(list.get(i),2));
		}
		return outputList;
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
}