package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-18/
 * Permutation of a string with and without repetition of characters.
 */;
/**
 * Implementation of Amazon Interview_18_03 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_18_03 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 String inputString=scanner.nextLine();
		 scanner.close();
		 printPermutations(inputString);
		 System.out.println();
		 printNonRepeatedPermutations(inputString);
		 
	 }

	/**
	 * Performs printNonRepeatedPermutations operation.
	 *
	 * @param inputString the inputString parameter
	 */
	private static void printNonRepeatedPermutations(String inputString) {
		String outputString="";
		HashMap<Character,Integer> elementMap=new HashMap<Character, Integer>();
		// Iterate through all elements
		for (int i = 0; i < inputString.length(); i++) {
			Character elementChar=inputString.charAt(i);
			if(!elementMap.containsKey(elementChar)){
				elementMap.put(elementChar,1);
				outputString+=elementChar;
			}

		}
		printPermutations(outputString);
		
	}
	/**
	 * Performs printPermutations operation.
	 *
	 * @param str the str parameter
	 */
	public static void printPermutations(String str) { 
		printPermutations("", str); 
	}
	
	/**
	 * Performs printPermutations operation.
	 *
	 * @param prefix the prefix parameter
	 * @param str the str parameter
	 */
	private static void printPermutations(String prefix, String str) {
	    int n = str.length();
	    // Check for null/base case
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	        	printPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
 }