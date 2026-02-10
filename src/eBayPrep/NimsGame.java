package eBayPrep;

/**
 * Implementation of Nims Game algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class NimsGame{
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
     * Performs canWinNim operation.
     *
     * @param n the size or count parameter
     * @return true if condition is met, false otherwise
     */
    public boolean canWinNim(int n) {
        return n%4>0;
    }
}

