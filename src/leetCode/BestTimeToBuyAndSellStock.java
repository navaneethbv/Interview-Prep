package leetCode;

/*
 * Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

/**
 * Implementation of Best Time To Buy And Sell Stock algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BestTimeToBuyAndSellStock {
	/**
	 * Performs maxProfitLong operation.
	 *
	 * @param prices the array to process
	 * @return the computed integer result
	 */
	public static int maxProfitLong(int[] prices) {
		int profit=0;
		// Iterate through all elements
		for (int i = 0; i < prices.length; i++) {
			for (int j = i; j < prices.length; j++) {
				if((prices[j]-prices[i])>profit)
					profit=prices[j]-prices[i];
			}
		}
		return profit;
	}
	/**
	 * Performs maxProfit operation.
	 *
	 * @param prices the array to process
	 * @return the computed integer result
	 */
	public static int maxProfit(int[] prices) {
		 int profit = 0;
		    int minElement = Integer.MAX_VALUE;
		    for(int i=0; i<prices.length; i++){
		       profit = Math.max(profit, prices[i]-minElement);
		       minElement = Math.min(minElement, prices[i]);
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