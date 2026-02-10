package Warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implementation of words Reversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class wordsReversal {


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String inputArray[]=str.split(" ");
		System.out.println(Arrays.toString(inputArray));
		StringBuilder sb=new StringBuilder();
		for (int i =inputArray.length-1; i >=0; i--) {
			if(i!=0)
				sb.append(inputArray[i]+" ");
			else 
				sb.append(inputArray[i]);
		}
		System.out.println(sb.toString());
		System.out.println(Reverse(str));
	}
	/**
	 * Performs Reverse operation.
	 *
	 * @param str the str parameter
	 * @return the resulting string
	 */
	private static String Reverse(String str) {
		char charArray[] = str.toCharArray();
		// Iterate through all elements
		for (int i = 0; i <str.length(); i++){
			if(charArray[i] == ' ')
				// Recursively process left and right subtrees
				return Reverse(str.substring(i + 1)) + str.substring(0, i) + " ";
		}

		return str + " ";
	}
}






