package hackerRank.Java.Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Link:https://www.hackerrank.com/challenges/java-hashset
 */

/**
 * Implementation of Java Hash Set algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaHashSet {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		Set<String> nameSet=new HashSet<String>();
		for(int i=0;i<noOfTestCases;i++){
			String name=scanner.nextLine();
			if(nameSet.contains(name))
			{
				System.out.println(nameSet.size());
			}
			else{
				nameSet.add(name);
				System.out.println(nameSet.size());
			}
		}
	}
}