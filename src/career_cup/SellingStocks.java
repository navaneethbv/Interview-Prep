package career_cup;

/**
 * Implementation of Selling Stocks algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SellingStocks {
		/**
		 * Performs maxProfit operation.
		 *
		 * @param prices the array to process
		 * @return the computed integer result
		 */
		public static int maxProfit(int [] prices)
		public static int maxProfit(int [] prices)
		{
			int sell = 0, prev_sell=0;
			int buy = Integer.MIN_VALUE, prev_buy;
			for(int price: prices)
			{
				prev_buy = buy;
				System.out.println(prev_buy);
				buy = Math.max(prev_sell - price, prev_buy);
				System.out.println(buy);
				prev_sell = sell;
				System.out.println(prev_sell);
				sell = Math.max(prev_buy + price, prev_sell); 
				System.out.println(sell);
			}
			return sell;
		}
		/**
		 * Main method to test the functionality of the class with various test cases.
		 *
		 * @param args the array to process
		 */
		public static void main(String[] args)
		{
			int[] price = {11,53};
			System.out.println("The max profit is "+maxProfit(price));
		}
}
