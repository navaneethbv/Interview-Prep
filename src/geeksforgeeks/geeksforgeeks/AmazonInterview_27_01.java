package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;


/*
 * http://www.geeksforgeeks.org/amazon-interview-set-27/
 * There is a dictionary already implemented. Write a method,
 * which takes input String without space,
 * to prints all subsets of the input string which is present in dictionary.
 * Example: Dictionary  a
 * Input- aaabaa
 * Output- a,a,a,aa,aa,aaa,a,a,aa
 */;
/**
 * Implementation of Amazon Interview_27_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_27_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 String dictionary="a";//scanner.nextLine();
		 String input="aaabaa";//scanner.nextLine();
		 scanner.close();
		 getPermutations(dictionary,input);
	 }

	/**
	 * Retrieves permutations from the data structure.
	 *
	 * @param dictionary the dictionary parameter
	 * @param input the input parameter
	 */
	private static void getPermutations(String dictionary, String input) {
		int counter=0;
		// Iterate through all elements
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)!=dictionary.charAt(0))
			{
				getPermutationString(dictionary,counter);
				counter=0;
			}
			else{
				counter++;
			}
		}
		if(counter!=0)
			getPermutationString(dictionary,counter);
	}

	/**
	 * Retrieves permutation string from the data structure.
	 *
	 * @param dictionary the dictionary parameter
	 * @param counter the counter parameter
	 */
	private static void getPermutationString(String dictionary, int counter) {
		StringBuffer sb=new StringBuffer();
		for (int i = counter; i > 0; i--) {
			sb.append(dictionary);
			// Inner loop to check combinations
			for (int j = 0; j < i; j++) {
				System.out.println(sb.toString());
			}
		}
		
	}

	
 }