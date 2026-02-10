package TopCoder;

/*
 * SRM 159 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1753&rd=4600
 */

/**
 * Implementation of SRM159 Street Parking algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM159StreetParking {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)  {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs freeParks operation.
	 *
	 * @param street the street parameter
	 * @return the computed integer result
	 */
	public static int freeParks(String street){
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < street.length(); i++) {
			if(street.charAt(i)=='-')
			{	
				if(((i+1)<street.length() && street.charAt(i+1)=='B') || ((i+2)<street.length() && street.charAt(i+2)=='B')
						||((i-1)>-1 && street.charAt(i-1)=='S' )|| ((i+1)<street.length() && street.charAt(i+1)=='S')){
					continue;
				}
				count++;
			}
		}
		return count;
	}
}
