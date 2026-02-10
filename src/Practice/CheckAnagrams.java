package Practice;

import java.util.Scanner;

/**
 * Implementation of Check Anagrams algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CheckAnagrams {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String");
		String one = scan.nextLine();
		System.out.println("Enter the second String");
		String two = scan.nextLine();
		
		if(anagrams(one,two)) {
			System.out.println("The two strings are anagrams");
		} else {
			System.out.println("The two strings are not anagrams");
		}
	}

	/**
	 * Performs anagrams operation.
	 *
	 * @param one the one parameter
	 * @param two the two parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean anagrams(String one, String two) {
		char[] array1 = one.toCharArray(); int sumOne = 0, sumTwo = 0;
		char[] array2 = two.toCharArray(); int productOne = 0, productTwo = 0;
		
		if(one.length() == two.length()) {
			// Iterate through all elements
			for(int i = 0; i < array1.length; i++) {
				sumOne += array1[i];
				sumTwo += array2[i];
				productOne *= array1[i];
				productTwo *= array2[i];
			}
			if(sumOne == sumTwo && productOne == productTwo) {
				return true;
			}
		}
		return false;
	}

}
