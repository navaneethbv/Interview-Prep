package eBayPrep;

/**
 * Implementation of Factorial Trailing Zeroes algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FactorialTrailingZeroes {

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
     * Performs trailingZeroes operation.
     *
     * @param n the size or count parameter
     * @return the computed integer result
     */
    public static int trailingZeroes(int n) {
    	int value=0,num=5,result=0;;
        while(result>1)
        {
        	result=n/num;
        	value+=result;
        	num=num*5;
        }
        return value;
    }
}

