package hackerRank.Java.OOP;

/*
 * Link:https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword
 */

/**
 * Implementation of Java Method Overriding2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaMethodOverriding2 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param []argh the []argh parameter
	 */
	public static void main(String []argh)
	{
		MotorCycle M=new MotorCycle();
	}

	/**
	 * Inner class BiCycle for supporting operations.
	 */
	static  class BiCycle
	{
		String define_me()
		{
			return "a vehicle with pedals.";
		}
	}

	/**
	 * Inner class MotorCycle for supporting operations.
	 */
	static class MotorCycle extends BiCycle
	{
		String define_me()
		{
			return "a cycle with an engine.";
		}

		MotorCycle()
		{

			System.out.println("Hello I am a motorcycle, I am "+ define_me());
			String temp=super.define_me(); //~~Fix me~~
			System.out.println("My ancestor is a cycle who is "+ temp );
		}

	}

}
