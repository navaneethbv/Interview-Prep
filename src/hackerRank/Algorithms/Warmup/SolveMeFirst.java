package hackerRank.Algorithms.Warmup;

import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/solve-me-first
*/
/**
 * Implementation of Solve Me First algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SolveMeFirst {

	  /**
	   * Performs solveMeFirst operation.
	   *
	   * @param a the a parameter
	   * @param b the b parameter
	   * @return the computed integer result
	   */
	  static int solveMeFirst(int a, int b) {
	      // Hint: Type return a+b; below
	      return a+b;
	  }

	   
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int a;
	        a = in.nextInt();
	        int b;
	        b = in.nextInt();
	        int sum;
	        sum = solveMeFirst(a, b);
	        System.out.println(sum);
	   }
}
