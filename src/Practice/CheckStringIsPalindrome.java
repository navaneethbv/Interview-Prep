package Practice;

import java.util.*;

public class CheckStringIsPalindrome {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String word = scan.nextLine();
		
		if(stringIsPalindrome(word))
			System.out.println("The given string is a palindrome");
		else
			System.out.println("The given string is not a palindrome");
	}
	
	public static boolean stringIsPalindrome(String word) {
		StringBuilder sb = new StringBuilder();
		for(int i = word.length() - 1; i >= 0; i--) {
			sb.append(word.charAt(i));
		}
		if(sb.toString().equals(word)) {
			return true;
		}
		return false;
	}
}
