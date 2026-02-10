package appleInterview;

/**
 * Implementation of Prep Doc Number Of Ones Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocNumberOfOnesInteger {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds ones bit in the data structure.
	 *
	 * @param x the x parameter
	 * @return the computed integer result
	 */
	private static int findOnesBit(Integer x) {
		int count=0;
		while(x>0)
		{
			count += x & 1;
			x >>= 1;
		}
		return count;
	}

	/**
	 * Finds ones in the data structure.
	 *
	 * @param x the x parameter
	 * @return the computed integer result
	 */
	private static int findOnes(Integer x) {
		System.out.println(Integer.toBinaryString(x));
		return Integer.bitCount(x);
	}

}
