package geeksforgeeks;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int number)
	{
		for(int i=2;i<=Math.sqrt(number);i++)
		{
			if(number%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(isPrime(number))
			System.out.println("The number is prime");
		else
			System.out.println("The number is not a prime");
	}
}
