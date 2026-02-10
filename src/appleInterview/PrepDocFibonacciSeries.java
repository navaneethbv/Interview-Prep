package appleInterview;

import java.util.Arrays;

/**
 * Implementation of Prep Doc Fibonacci Series algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocFibonacciSeries {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs printFiboNacciSeries operation.
	 *
	 * @param i the i parameter
	 */
	private static void printFiboNacciSeries(int i) {
		// Check for null/base case
		if(i==0)return;
		if(i==1){System.out.println(1);return;}
		if(i==2){System.out.println(1+"/"+1);return;}
		int fibo[]=new int[i];
		fibo[0]=1;
		fibo[1]=1;
		for (int j = 2; j < i; j++) {
			fibo[j]=fibo[j-1]+fibo[j-2];
		}
		System.out.println(Arrays.toString(fibo));
	}

}
