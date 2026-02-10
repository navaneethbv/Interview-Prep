package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


/*
 * http://www.geeksforgeeks.org/amazon-interview/
 *  Check if a character link list is palindrome or not.
 */
/**
 * Implementation of Amazon Interview_02_02 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_02_02 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		LinkedList<Character> characterList=new LinkedList<Character>();
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		String inputString=scanner.nextLine();
		scanner.close();
		for (int i = 0; i < inputString.length(); i++) {
			characterList.add(inputString.charAt(i));
		}
		System.out.println("Character is a palindrome ? "+palindromeCheck(characterList));
	}

	/**
	 * Performs palindromeCheck operation.
	 *
	 * @param characterList the characterList parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean palindromeCheck(LinkedList<Character> characterList) {
		Stack<Character> stack=new Stack<Character>();
		for (int i = 0; i < characterList.size(); i++) {
			stack.push(characterList.get(i));
		}
		for (int i = 0; i < characterList.size()/2; i++) {
			if(stack.pop()!=characterList.get(i)){
				return false;
			}
		}
		return true;
	}
}
