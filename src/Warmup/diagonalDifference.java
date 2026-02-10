package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Implementation of diagonal Difference algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class diagonalDifference {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(scanner.readLine());
		Long sum=0l;
		long forwardDiagonalValue=0,backwardDiagonalValue=0;
		int forwardDiagonalTracker=0,backwardDiagonalTracker=N-1;
		
		for (int i = 0; i < N; i++) {
			String lineArray=scanner.readLine();
			String[] lineVal=lineArray.split(" ");
			forwardDiagonalValue+=Long.parseLong(lineVal[forwardDiagonalTracker]);
			forwardDiagonalTracker++;
			backwardDiagonalValue+=Long.parseLong(lineVal[backwardDiagonalTracker]);
			backwardDiagonalTracker--;
		}
		sum=Math.abs(forwardDiagonalValue-backwardDiagonalValue);
		System.out.println(sum);
	}
}
