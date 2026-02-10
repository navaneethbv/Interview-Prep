package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-14-2/
 * Print all pairs(sets) of prime numbers (p,q) such that p*q <= n, where n is given number
 */;
/**
 * Implementation of Amazon Interview_13_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_13_04 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner =new Scanner(new InputStreamReader(System.in));
		Integer N=Integer.parseInt(scanner.nextLine());
		scanner.close();
		ArrayList<Integer> primeList=printPrimes(N);
		printSets(primeList,N);
	}

	/**
	 * Performs printSets operation.
	 *
	 * @param primeList the primeList parameter
	 * @param N the size or count parameter
	 */
	private static void printSets(ArrayList<Integer> primeList,Integer N) {
		for (int i = 0; i < primeList.size(); i++) {
			int firstElement=primeList.get(i);
			// Inner loop to check combinations
			for (int j = 0; j < primeList.size(); j++) {
				int secondElement=primeList.get(j);
				if(firstElement*secondElement<N)
					System.out.print("("+firstElement+","+secondElement+")"+",");
			}
		}
		System.out.println();
	}

	/**
	 * Performs printPrimes operation.
	 *
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	private static ArrayList<Integer> printPrimes(Integer n) {
		ArrayList<Integer> primeList=findPrimes(n);
		for (int i = 0; i < primeList.size(); i++) {
			System.out.print(primeList.get(i)+",");
		}
		System.out.println();
		return primeList;
	}

	/**
	 * Finds primes in the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	private static ArrayList<Integer> findPrimes(Integer n) {
		ArrayList<Integer> primeList=new ArrayList<Integer>();
		for (int i = 3; i <= n/3; i=i+2) {
			if(isPrime(i)){
				primeList.add(i);
			}
		}
		return primeList;
		
	}

	/**
	 * Checks if prime.
	 *
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPrime(int i) {
		for (int j = 3; j < i/2; j=j+2) {
			// Check for null/base case
			if(i%j==0 && i!=j)
				return false;
		}
		return true;
	}

 }