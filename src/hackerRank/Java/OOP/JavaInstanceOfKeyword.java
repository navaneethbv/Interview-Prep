package hackerRank.Java.OOP;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-instanceof-keyword
 */

/**
 * Implementation of Java Instance Of Keyword algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaInstanceOfKeyword {

	/**
	 * Inner class Student for supporting operations.
	 */
	static class Student{}
	/**
	 * Inner class Rockstar for supporting operations.
	 */
	static class Rockstar{   }
	/**
	 * Inner class Hacker for supporting operations.
	 */
	static class Hacker{}

	/**
	 * Counts the number of .
	 *
	 * @param mylist the mylist parameter
	 * @return the resulting string
	 */
	static String count(ArrayList mylist)
	{
		int a=0,b=0,c=0;
		for(int i=0;i<mylist.size();i++)
		{
			Object element=mylist.get(i);
			if(element instanceof Student)
				a++;
			if(element instanceof Rockstar)
				b++;
			if(element instanceof Hacker)
				c++;
		}
		String ret= Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
		return ret;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param []argh the []argh parameter
	 */
	public static void main(String []argh)
	{
		ArrayList mylist=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			String s=sc.next();
			if(s.equals("Student"))mylist.add(new Student());
			if(s.equals("Rockstar"))mylist.add(new Rockstar());
			if(s.equals("Hacker"))mylist.add(new Hacker());
		}
		System.out.println(count(mylist));
	}
}

