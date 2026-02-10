package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 */
/**
 * Implementation of Fibonacci DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FibonacciDP {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs fibonacci operation.
	 *
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int fibonacci(int i) {
		int fibo[]=new int[i];
		fibo[0]=0;
		fibo[1]=1;
		for (int j = 2; j <i; j++) {
			fibo[j]=fibo[j-1]+fibo[j-2];
		}
		return fibo[i-1];
	}



}
