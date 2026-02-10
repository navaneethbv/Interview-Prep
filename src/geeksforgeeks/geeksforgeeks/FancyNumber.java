package geeksforgeeks;

import java.io.*;

import java.util.*;

public class FancyNumber {
	public static void main(String []args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			Map<Character,Character> m = new HashMap<Character,Character>();
			m.put('0', '0');
			m.put('1', '1');
			m.put('6', '9');
			m.put('8', '8');
			m.put('9', '6');
			boolean fancyNumber = true;
			System.out.println("Enter Number");
			String num = br.readLine();

			if(num == null || num.equals(""))
			{
				System.out.println("The number cannot be empty");
			}
			for(int i = 0; i<(num.length()/2)+1; i++)
			{
				if(m.containsKey(num.charAt(i)))
				{
					char ch = m.get(num.charAt(i));
					if(num.charAt(num.length()-(i+1)) != ch)
					{
						fancyNumber = false;
					}
				}
				else
				{
					fancyNumber = false;
				}
			}
			if(fancyNumber)
			{
				System.out.println("Given Number is Fancy number");
			}
			else
			{
				System.out.println("Given Number is not Fancy number");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();

		}
	}
}