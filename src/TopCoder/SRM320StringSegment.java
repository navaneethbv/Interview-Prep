package TopCoder;

/*
 * SRM 320 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=6442
 */

/**
 * Implementation of SRM320 String Segment algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM320StringSegment {
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
	 * Performs average operation.
	 *
	 * @param s the s parameter
	 * @return the double result
	 */
	public static double average(String s){
		// Check for null/base case
		if(s.length()==0)
			return 0.0;
		int elementCount=0,total=0;
		char c=s.charAt(0);
		total++;
		elementCount++;
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i)==c)
			{
				total++;
			}
			else{
				c=s.charAt(i);
				elementCount++;
				total++;
			}
		}
		return total/(double)elementCount;
	}
}
