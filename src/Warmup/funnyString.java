package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Implementation of funny String algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class funnyString {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.readLine());
		for (int i = 0; i < noOfTestCases; i++) {
			String input=scanner.readLine();
			String reverse=new StringBuilder(input).reverse().toString();
			Boolean flag=false;
			for (int j = 1; j < input.length(); j++) {
				int inputDiff=(int)input.charAt(j)-(int)input.charAt(j-1);
				int reverseDiff=(int)reverse.charAt(j)-(int)reverse.charAt(j-1);
				if(Math.abs(inputDiff)!=Math.abs(reverseDiff)){
					System.out.println("Not Funny");
					flag=true;
					break;
				}
			}
			if(flag==false)
				System.out.println("Funny");
		}
	}

}
