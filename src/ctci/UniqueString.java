package ctci;

import java.util.Scanner;

public class UniqueString {
	public static boolean isUnique(String str)
	{
		if(str.length()>128)
			return false; //Assuming the user wants to check unique characters in ASCII. Else we can use 256 for Extended ASCII.
		boolean char_set [] = new boolean[128];
		for(int i=0;i<str.length();i++)
		{ 
			int val = str.charAt(i);
			 if(char_set[val])
			 {
				 return false;
			 }
			 char_set[val]=true;
		}
		return true;
	}

	public static void main(String[] args) {
		try
		{
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String unique = scanner.next();
			if(isUnique(unique))
			{
				System.out.println("unique");
			}
			else
				System.out.println("Not unique");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
