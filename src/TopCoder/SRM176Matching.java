package TopCoder;

import java.util.Arrays;

/*
 * SRM 176 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=2251&rd=4685
 */

/**
 * Implementation of SRM176 Matching algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM176Matching {
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
	 * Finds match in the data structure.
	 *
	 * @param first the array to process
	 * @param second the array to process
	 * @return the resulting array
	 */
	public static String[] findMatch(String[] first, String[] second){
		String outputArr[]=new String[4];
		// Iterate through all elements
		for (int i = 0; i < outputArr.length; i++) {
			if(first[i].contentEquals(second[i]))
				outputArr[i]=first[i];
			else{
				outputArr[i]=findMatching(first[i],second[i],i);
			}
		}
		return outputArr;
	}
	/**
	 * Finds matching in the data structure.
	 *
	 * @param first the first parameter
	 * @param second the second parameter
	 * @param i the i parameter
	 * @return the resulting string
	 */
	private static String findMatching(String first, String second, int i) {
		switch(i){
		case 0:String output="DIAMONDCIRCLESQUIGGLE".replace(first, "").replace(second, "");
		return output;
		case 1: output="BLUEGREENRED".replace(first, "").replace(second, "");
		return output;
		case 2:output="SOLIDSTRIPEDEMPTY".replace(first, "").replace(second, "");
		return output;
		case 3:output="ONETWOTHREE".replace(first, "").replace(second, "");
		return output;
		default:break;
		}
		return "";
	}
}
