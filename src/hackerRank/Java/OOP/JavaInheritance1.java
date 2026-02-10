package hackerRank.Java.OOP;

/*
 * Link:https://www.hackerrank.com/challenges/java-inheritance-1
 */

/**
 * Implementation of Java Inheritance1 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaInheritance1 {

	/**
	 * Inner class Animal for supporting operations.
	 */
	static class Animal{
		void walk()
		{
			System.out.println("I am walking");
		}
	}

	/**
	 * Inner class Bird for supporting operations.
	 */
	static class Bird extends Animal
	{
		void fly()
		{
			System.out.println("I am flying");
		}
		void sing()
		{
			System.out.println("I am singing");
		}
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[])
	{

		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

	}


}
