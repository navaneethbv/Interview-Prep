package eBayPrep;

/**
 * Implementation of Best Timeto Buyand Sell Stock algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BestTimetoBuyandSellStock {
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
	 * Performs maxProfit operation.
	 *
	 * @param prices the array to process
	 * @return the computed integer result
	 */
	public static int maxProfit(int[] prices) {
		// Check for null/base case
		if(prices==null||prices.length==0)
			return 0;
		int maxProfit=0;
		int min=prices[0];
		// Iterate through all elements
		for (int i = 0; i < prices.length; i++) {
			maxProfit=Math.max(maxProfit, prices[i]-min);
			min=Math.min(min, prices[i]);
		}
		return maxProfit;
	}
}

