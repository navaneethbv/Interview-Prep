package TopCoder;

import java.util.Arrays;

/*
 * SRM 158 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1789&rd=4598
 */

/**
 * Implementation of SRM158 Base Mystery algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM158BaseMystery {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)  {
		System.out.println(Arrays.toString(getBase("1+1=2")));
		System.out.println(Arrays.toString(getBase("1+1=10")));
		System.out.println(Arrays.toString(getBase("1+1=3")));
		System.out.println(Arrays.toString(getBase("ABCD+211=B000")));
		System.out.println(Arrays.toString(getBase("ABCD+322=B000")));
		System.out.println(Arrays.toString(getBase("1+0=1")));
		System.out.println(Arrays.toString(getBase("GHIJ+1111=HJ00")));
		System.out.println(Arrays.toString(getBase("1234+8765=9999")));
	}
	/**
	 * Retrieves base from the data structure.
	 *
	 * @param equation the equation parameter
	 * @return the resulting array
	 */
	public static int[] getBase(String equation){

		return null;
	}
}
