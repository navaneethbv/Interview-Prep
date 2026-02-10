package Warmup;

/*
 */	
/**
 * Implementation of recursive String Reverse algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class recursiveStringReverse {


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
	 * Performs reverseString operation.
	 *
	 * @param inputstring the inputstring parameter
	 * @return the resulting string
	 */
	public static String reverseString(String inputstring)
	public static String reverseString(String inputstring)
	{
		if(inputstring.length()==1)
			return inputstring;
		else{
			return inputstring.charAt(inputstring.length()-1)+reverseString(inputstring.substring(0,inputstring.length()-1));
		}
		
	}

}
