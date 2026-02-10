package LeetCodePerformancePractice;

/**
 * Implementation of Coin Change algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CoinChange {
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
	 * Performs coinChange operation.
	 *
	 * @param coins the array to process
	 * @param amount the amount parameter
	 * @return the computed integer result
	 */
	public static int coinChange(int[] coins, int amount) {
		int dp[]=new int[amount+1];
		dp[0]=0;
		for (int i = 1; i < dp.length; i++) {
			dp[i]=Integer.MAX_VALUE;
		}

		for (int i = 0; i <=amount; i++) {
			// Inner loop to check combinations
			for (int j = 0; j < coins.length; j++) {
				int coin=coins[j];
				if(i+coin<=amount)
				{
					if(dp[i]==Integer.MAX_VALUE)
					{
						dp[i+coin]=dp[coin+i];
					}
					else{
						dp[i+coin] = Math.min(dp[i+coin], dp[i]+1);
					}
				}
			}
		}
		if(dp[amount] >= Integer.MAX_VALUE)
			return -1;
		return dp[amount];
	}


}
