package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;






/*
 * http://www.geeksforgeeks.org/amazon-interview-set-23/
 * Give a Building with n floor. A person can take 1 step or 2 step to climb.
 * Find the number of ways to reach nth floor. Code was required
 */;
/**
 * Implementation of Amazon Interview_23_03 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_23_03 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	/**
	 * Retrieves ways from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getWays(Integer n) {
		
		return fibonacci(n);
	}

	/**
	 * Performs fibonacci operation.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int fibonacci(Integer n) {
		// Check for null/base case
		if(n==0||n==1)
			return 1;
		else return fibonacci(n-1)+fibonacci(n-2);
	}
	

	
 }