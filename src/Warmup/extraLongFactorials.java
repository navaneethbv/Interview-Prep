package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Implementation of extra Long Factorials algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class extraLongFactorials {
		/**
		 * Main method to test the functionality of the class with various test cases.
		 *
		 * @param args the array to process
		 */
		public static void main(String[] args) throws Exception {
			BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
			int N=Integer.parseInt(scanner.readLine());
			BigInteger outputvalue=new BigInteger("1");
			for (int i = 1; i <= N; i++) {
				outputvalue=outputvalue.multiply(new BigInteger(String.valueOf(i)));
			}
			System.out.println(outputvalue);
		}
}
