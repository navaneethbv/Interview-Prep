package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-4-3/
 * http://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
 * Write all possible permutations of a array of size z.
 * 
 */;
/**
 * Implementation of Amazon Interview_06_03 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_06_03 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int z=Integer.parseInt(scanner.nextLine());
		int inputArray[]={1, 2, 3, 4};
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
		
	}
}