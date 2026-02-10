package hackerRank.Java.Introduction;

import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-if-else
 */

/**
 * Implementation of Java If Else algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaIfElse {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();            
		String ans="";
		if(n%2==1){
			ans = "Weird";
		}
		else{
			if(n>20 || (n>=2 && n<=5))
				ans="Not Weird";
			else
				ans="Weird";
		}
		System.out.println(ans);
	}
}
