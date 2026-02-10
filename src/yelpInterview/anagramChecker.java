package yelpInterview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implementation of anagram Checker algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class anagramChecker {


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		String str=scanner.nextLine();
		char[] c=str.toCharArray();
		Arrays.sort(c);
		str=new String(c);
		boolean breaker=false;
		for (int i = 1; i <n; i++) {
			String str1=scanner.nextLine();
			char[] c1=str1.toCharArray();
			Arrays.sort(c1);
			str1=(new String(c1));
			if(!str.equals(str1)){
				System.out.println("false");
				breaker=true;
				break;
			}
		}
		if(!breaker)
			System.out.println("true");
	}
}






