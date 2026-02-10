package hackerRank.Algorithms.Strings;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Link:https://www.hackerrank.com/challenges/pangrams
*/
/**
 * Implementation of Pangram algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Pangram {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		String inputString=scanner.nextLine().replaceAll(" ","").toLowerCase();
		TreeSet<Character> charSet=new TreeSet<>();
		int count=0;
		for (int i = 0; i < inputString.length(); i++) {
			if(!charSet.contains(inputString.charAt(i)))
			{
				charSet.add(inputString.charAt(i));
				count++;
			}
			if(count==26)
			{
				System.out.println("pangram");
				System.exit(0);
			}
		}
		System.out.println("not pangram");
	}
}
