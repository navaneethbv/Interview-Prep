package hackerRank.Java.OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-iterator
 */

/**
 * Implementation of Java Iterator algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaIterator {

	/**
	 * Performs func operation.
	 *
	 * @param mylist the mylist parameter
	 * @return the Iterator result
	 */
	static Iterator func(ArrayList mylist)
	{
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
			Object element = it.next();
			if(element instanceof String)//Hints: use instanceof operator
				break;
		}
		return it;

	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param []argh the []argh parameter
	 */
	public static void main(String []argh)
	{
		ArrayList mylist = new ArrayList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			mylist.add(sc.nextInt());
		}
		mylist.add("###");
		for(int i=0;i<m;i++)
		{
			mylist.add(sc.next());
		}

		Iterator it=func(mylist);
		while(it.hasNext())
		{
			Object element = it.next();
			System.out.println((String)element);
		}

	}
}
