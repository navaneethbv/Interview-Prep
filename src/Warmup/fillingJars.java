package Warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implementation of filling Jars algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class fillingJars {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		String fLine[]=(scanner.readLine().split(" "));
		long N=Long.parseLong(fLine[0]);
		long M=Long.parseLong(fLine[1]);
		long total=0l;
		for (long noOfOperations = 0; noOfOperations < M; noOfOperations++) {
			String operationsLine[]=scanner.readLine().split(" ");
			long a=Long.parseLong(operationsLine[0]);
			long b=Long.parseLong(operationsLine[1]);
			long noOfCandies=Long.parseLong(operationsLine[2]);
			total+=(b-a+1)*noOfCandies;
		}
		System.out.println((long)Math.floor(total/N));
	}
}
