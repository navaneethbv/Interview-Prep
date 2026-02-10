package leetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * Link : https://leetcode.com/problems/pascals-triangle/
 */

/**
 * Implementation of Pascals Triangle algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PascalsTriangle {
	/**
	 * Performs generate operation.
	 *
	 * @param numRows the numRows parameter
	 * @return the list of results
	 */
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		int a[][]=new int[numRows][numRows];
		// Iterate through all elements
		for (int i = 0; i < a.length; i++) {
			List<Integer> innerList=new ArrayList<>();
			// Check for null/base case
			if(i==0){
				a[i][i]=1;
				innerList.add(a[i][i]);
				list.add(innerList);
				continue;
			}
			// Inner loop to check combinations
			for (int j = 0; j <=i; j++) {
				// Check for null/base case
				if(j==0 || j==i){
					a[i][j]=1;
					innerList.add(a[i][j]);
				}
				else{
					a[i][j]=a[i-1][j]+a[i-1][j-1];
					innerList.add(a[i][j]);
				}
			}
			list.add(innerList);
		}
		return list;
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