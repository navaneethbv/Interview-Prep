package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

/**
 * Implementation of pangrams algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class pangrams {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		String input=(scanner.readLine());
		input=input.toLowerCase();
		Hashtable<Character,Character> alphabets=new Hashtable<Character, Character>();		
		for (int i = 0; i < input.length(); i++) {
			if(Character.isAlphabetic(input.charAt(i)))
				alphabets.put(input.charAt(i),input.charAt(i));
		}
		if(alphabets.size()==26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

}
