package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/count-total-set-bits-in-all-numbers-from-1-to-n/
 */
/**
 * Implementation of Amazon Interview_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_01 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int N=Integer.parseInt(scanner.nextLine());
		scanner.close();
		int noOfOnes=0;
		for (int i = 1; i <=N; i++) {
			noOfOnes+=Integer.bitCount(i);
		}
		System.out.println(noOfOnes);
	}
}
