package hackerRank.Java.OOP;

import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-abstract-class
 */

/**
 * Implementation of Java Abstract Class algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaAbstractClass {

	/**
	 * Inner class Book for supporting operations.
	 */
	abstract static class Book
	{
		String title;
		abstract void setTitle(String s);
		String getTitle()
		{
			return title;
		}

	}

	//Write MyBook class here
	/**
	 * Inner class MyBook for supporting operations.
	 */
	static class MyBook extends Book{
		/**
		 * Sets title in the data structure.
		 *
		 * @param s the s parameter
		 */
		public void setTitle(String s){
			this.title=s;
		}
	}


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param []args the []args parameter
	 */
	public static void main(String []args)
	{
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());

	}

}
