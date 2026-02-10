package Warmup;

import java.util.Scanner;

/**
 * Implementation of chocolate Feast algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class chocolateFeast {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	/*public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		long T=Integer.parseInt(scanner.readLine());
		for (int noOfTestCases = 0; noOfTestCases < T; noOfTestCases++) {
			String str[]=scanner.readLine().split(" ");
			int N=Integer.parseInt(str[0]);
			int C=Integer.parseInt(str[1]);
			int M=Integer.parseInt(str[2]);
			int noOfChocolates=N/C;
			int noOfWrappers=noOfChocolates;

			while(noOfWrappers-M>=0){
				int tempChocolateCount=noOfWrappers/M;
				noOfChocolates+=tempChocolateCount;
				noOfWrappers=noOfWrappers%M+tempChocolateCount;
			}
			System.out.println(noOfChocolates);
		}*/
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i++){
			System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
		}
	}

	/**
	 * Performs Solve operation.
	 *
	 * @param N the size or count parameter
	 * @param C the C parameter
	 * @param M the M parameter
	 * @return the computed integer result
	 */
	private static long Solve(int N, int C, int M){
		long noOfChocolates=N/C;
		long noOfWrappers=noOfChocolates;

		while(noOfWrappers-M>=0){
			long tempChocolateCount=noOfWrappers/M;
			noOfChocolates+=tempChocolateCount;
			noOfWrappers=noOfWrappers%M+tempChocolateCount;
		}
		return (noOfChocolates);
	}
}
