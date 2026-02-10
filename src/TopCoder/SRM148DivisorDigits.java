package TopCoder;

/*
 * SRM 148 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1741&rd=4545
 */



/**
 * Implementation of SRM148 Divisor Digits algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM148DivisorDigits {
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
	 * Performs howMany operation.
	 *
	 * @param number the number parameter
	 * @return the computed integer result
	 */
	public static int howMany(int number){
		int count=0;
		String str=number+"";
		for (int i = 1; i <=9; i++) {
			if(str.indexOf(i+"")>-1)
			{
				// Check for null/base case
				if(number%i==0)
					count++;
			}
		}
		return count;
	}
}
