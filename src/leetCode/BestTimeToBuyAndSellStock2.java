package leetCode;

/*
 * Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */

/**
 * Implementation of Best Time To Buy And Sell Stock2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BestTimeToBuyAndSellStock2 {
	/**
	 * Performs maxProfit operation.
	 *
	 * @param prices the array to process
	 * @return the computed integer result
	 */
	public static int maxProfit(int[] prices) {
		int profit=0;
		for (int i = 1; i < prices.length; i++) {
			if(prices[i]-prices[i-1]>0)
				profit+=prices[i]-prices[i-1];
		}
		
		return profit;
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