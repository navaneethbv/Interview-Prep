package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Implementation of a Very Big Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class aVeryBigSum {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		long N=Integer.parseInt(scanner.readLine());
		Long sum=0l;
		String lineArray=scanner.readLine();
		String[] lineSplit=lineArray.split(" ");
		for (int i = 0; i < N; i++) {
			sum+=Long.parseLong(lineSplit[i]);
		}
		System.out.println(sum);
	}
}
