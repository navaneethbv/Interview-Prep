package Practice;

import java.util.Scanner;

public class CheckAnagrams {

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

	private static boolean anagrams(String one, String two) {
		char[] array1 = one.toCharArray(); int sumOne = 0, sumTwo = 0;
		char[] array2 = two.toCharArray(); int productOne = 0, productTwo = 0;
		
		if(one.length() == two.length()) {
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
