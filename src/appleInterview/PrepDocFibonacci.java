package appleInterview;

/**
 * Implementation of Prep Doc Fibonacci algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocFibonacci {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds recursive fibonacci in the data structure.
	 *
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int findRecursiveFibonacci(int i) {
		if(i<2)
			return 1;
		else
			// Recursively process left and right subtrees
			return findRecursiveFibonacci(i-1)+findRecursiveFibonacci(i-2);
	}

	/**
	 * Finds fibonacci in the data structure.
	 *
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static  int findFibonacci(int i) {
		if(i<2)
			return 1;
		int fib0=1,fib1=1;
		for (int j = 2; j <=i; j++) {
			int sum=fib0+fib1;
			fib0=fib1;
			fib1=sum;
		}
		return fib1;
	}

}
