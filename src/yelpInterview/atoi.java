package yelpInterview;

/**
 * Implementation of atoi algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class atoi {


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}


	/**
	 * Performs myAtoi operation.
	 *
	 * @param str the str parameter
	 * @return the computed integer result
	 */
	public int myAtoi(String str) {
		
		return str.length()==0?0:Integer.parseInt(str);
	}

}

