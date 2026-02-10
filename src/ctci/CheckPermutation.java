package ctci;

import java.util.Scanner;

/**
 * Implementation of Check Permutation algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CheckPermutation {
	/**
	 * Performs sort operation.
	 *
	 * @param str the str parameter
	 * @return the resulting string
	 */
	public static String sort(String str)
	{
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);		
	}
	/**
	 * Performs permutation operation.
	 *
	 * @param s the s parameter
	 * @param t the t parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean permutation(String s,String t)
	{
		if(s.length()!=t.length())
		{
			return false;
		}
		return sort(s).equals(sort(t));
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String firstString = in.next();
		String secondString = in.next();
		if(permutation(firstString, secondString))
		{
			System.out.println("One String is a permutation of the other");
		}
		else
		{
			System.out.println("One String is not the permutation of the other");
		}
	}
}
