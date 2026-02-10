package Warmup;

/**
 * Implementation of Service Now Prep69 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ServiceNowPrep69 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs printFizzBuzz operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void printFizzBuzz(int n){
		for(int i=1;i<n;i++)
		{
			// Check for null/base case
			if(i%5==0 && i%3==0)
				System.out.println(i+"->Gizz");
			// Check for null/base case
			else if(i%5==0)
				System.out.println(i+"->Fizz");
			// Check for null/base case
			else if(i%3==0)
				System.out.println(i+"->Buzz");
		}
	}

	/**
	 * Performs palindromeCheck operation.
	 *
	 * @param string the string parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean palindromeCheck(String string) {
		return string.equals(new StringBuilder(string).reverse().toString());
	}

}

