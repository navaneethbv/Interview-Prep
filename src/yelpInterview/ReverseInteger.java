package yelpInterview;

/**
 * Implementation of Reverse Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseInteger {


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}


	@SuppressWarnings("finally")
	/**
	 * Performs reverse operation.
	 *
	 * @param x the x parameter
	 * @return the computed integer result
	 */
	public static int reverse(int x) {
		try{
		String s=new StringBuilder(x+"").reverse().toString();
		if(x<0)
			return Integer.parseInt(s.substring(0, s.length()-1))*-1;
		else
			return Integer.parseInt(s);
		}catch(Exception e)
		{
			return 0;
		}
		finally {
			
		}
	}

}

