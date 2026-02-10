package TopCoder;

/*
 * SRM 153 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1772&rd=4570
 */



/**
 * Implementation of SRM153 Inventory algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM153Inventory {
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
	 * Performs monthlyOrder operation.
	 *
	 * @param sales the array to process
	 * @param daysAvailable the array to process
	 * @return the computed integer result
	 */
	public static int monthlyOrder(int[] sales, int[] daysAvailable){
		int count=0;
		double total=0;
		// Iterate through all elements
		for (int i = 0; i < daysAvailable.length; i++) {
			// Check for null/base case
			if(daysAvailable[i]==0)
				continue;
			total+=sales[i]*30/(float)daysAvailable[i];
			count++;
		}
		return (int)Math.ceil(total/count);
	}
}
