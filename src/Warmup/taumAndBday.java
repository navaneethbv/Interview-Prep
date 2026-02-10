package Warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implementation of taum And Bday algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class taumAndBday {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		long T=Long.parseLong(scanner.readLine());
		for (long noOfTestCases = 0; noOfTestCases < T; noOfTestCases++) {
			String flArray[]=scanner.readLine().split(" ");
			long noOfBlackGifts=Integer.parseInt(flArray[0]);
			long noOfWhiteGifts=Integer.parseInt(flArray[1]);
			String slArray[]=scanner.readLine().split(" ");
			long costOfBlackGift=Integer.parseInt(slArray[0]);
			long costOfWhiteGift=Integer.parseInt(slArray[1]);
			long costOfConversion=Integer.parseInt(slArray[2]);
			if(costOfBlackGift>(costOfWhiteGift+costOfConversion))
			{
				//convert white to black and buy white directly
				long finalCostOfWhiteGifts=costOfWhiteGift*noOfWhiteGifts;
				long finalCostOfBlackGifts=(costOfWhiteGift+costOfConversion)*noOfBlackGifts;
				System.out.println(finalCostOfBlackGifts+finalCostOfWhiteGifts);
			}
			else if(costOfWhiteGift>(costOfBlackGift+costOfConversion))
			{
				//convert black to white and buy black directly
				long finalCostOfWhiteGifts=(costOfBlackGift+costOfConversion)*noOfWhiteGifts;
				long finalCostOfBlackGifts=(costOfBlackGift)*noOfBlackGifts;
				System.out.println(finalCostOfBlackGifts+finalCostOfWhiteGifts);
			}
			else{
				//buy directly
				long finalCostOfWhiteGifts=(costOfWhiteGift)*noOfWhiteGifts;
				long finalCostOfBlackGifts=(costOfBlackGift)*noOfBlackGifts;
				System.out.println(finalCostOfBlackGifts+finalCostOfWhiteGifts);
			}
			
		}
	}
}
