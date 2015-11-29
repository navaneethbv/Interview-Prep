package ctci;

import java.util.Scanner;

public class CheckPermutation {
	public static String sort(String str)
	{
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);		
	}
	public static boolean permutation(String s,String t)
	{
		if(s.length()!=t.length())
		{
			return false;
		}
		return sort(s).equals(sort(t));
	}
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
