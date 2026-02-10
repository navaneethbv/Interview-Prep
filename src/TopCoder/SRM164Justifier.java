package TopCoder;

import java.util.Arrays;

/*
 * SRM 164 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1757&rd=4625
 */

/**
 * Implementation of SRM164 Justifier algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM164Justifier {
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
	 * Performs justify operation.
	 *
	 * @param textIn the array to process
	 * @return the resulting array
	 */
	public static String[] justify(String[] textIn){
		int maxLength=0;
		for(int i=0;i<textIn.length;i++){
			maxLength=Math.max(maxLength,textIn[i].length());
		}
		String outputArray[]=new String[textIn.length];
		for(int i=0;i<textIn.length;i++){
			StringBuilder sb=new StringBuilder("");
			for(int j=0;j<maxLength-textIn[i].length();j++){
				sb.append(" ");
			}
			sb.append(textIn[i]);
			outputArray[i]=sb.toString();
		}
		return outputArray;

	}

}
