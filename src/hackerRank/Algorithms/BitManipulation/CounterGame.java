package hackerRank.Algorithms.BitManipulation;

import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/counter-game
 */
/**
 * Implementation of Counter Game algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CounterGame {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			BigInteger N=new BigInteger(scanner.nextLine());
			int winnerId=0;
			while(N.compareTo(new BigInteger("1"))!=0){
				winnerId++;
				winnerId=winnerId%2;
				if(checkForPowerTwo(N)){
					N=N.divide(new BigInteger("2"));
				}
				else{
					N=N.subtract(findNearestPowerTwo(N));
				}
			}
			System.out.println(winnerId==0?"Richard":"Louise");
		}
	}

	/**
	 * Finds nearest power two in the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the BigInteger result
	 */
	private static BigInteger findNearestPowerTwo(BigInteger n) {
		BigInteger num=new BigInteger("1");
		while(num.compareTo(n)==-1){
			num=num.multiply(new BigInteger("2"));
		}
		return num.divide(new BigInteger("2"));
	}

	/**
	 * Performs checkForPowerTwo operation.
	 *
	 * @param n the size or count parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkForPowerTwo(BigInteger n) {
		while(n.compareTo(new BigInteger("1"))!=-1 && n.mod(new BigInteger("2")).compareTo(new BigInteger("0"))==0)
		{
			n=n.divide(new BigInteger("2"));
		}
		return n.compareTo(new BigInteger("1"))==0;
	}
}
