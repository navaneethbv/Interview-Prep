package geeksforgeeks;

import java.util.Scanner;

/**
 * Implementation of Prime Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrimeNumber {
	/**
	 * Checks if prime.
	 *
	 * @param number the number parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isPrime(int number)
	public static boolean isPrime(int number)
	{
		for(int i=2;i<=Math.sqrt(number);i++)
		{
			if(number%i==0)
				return false;
		}
		return true;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
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
