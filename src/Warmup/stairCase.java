package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Implementation of stair Case algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class stairCase {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(scanner.readLine());
		String hashString="";
		String emptyString="";

		for (int i = 0; i < N; i++) {
			hashString+="#";
			emptyString+=" ";
		}
		for (int i = 0; i < N; i++) {
			String formatHash="%."+i+"s";
			String formatSpace="%."+(N-i-1)+"s";
			System.out.format(formatSpace,emptyString);
			System.out.format(formatHash,hashString);
			System.out.print("#");
			System.out.println();
		}
	}
}
