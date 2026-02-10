package hackerRank.Java.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-string-compare
 */

/**
 * Implementation of Java String Compare algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaStringCompare {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String inputString=scanner.nextLine();
		int K=Integer.parseInt(scanner.nextLine());
		ArrayList<String> stringList=new ArrayList<String>();
		for(int i=0;i<inputString.length()-K+1;i++)
		{
			stringList.add(inputString.substring(i,i+K));
		}
		Object[] sortedArray=stringList.toArray();
		Arrays.sort(sortedArray);
		System.out.println(sortedArray[0]);
		System.out.println(sortedArray[sortedArray.length-1]);
	}
}
