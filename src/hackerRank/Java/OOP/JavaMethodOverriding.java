package hackerRank.Java.OOP;

/*
 * Link:https://www.hackerrank.com/challenges/java-method-overriding
 */

/**
 * Implementation of Java Method Overriding algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaMethodOverriding {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param []args the []args parameter
	 */
	public static void main(String []args)
	{
		Sports C1=new Sports();
		Soccer C2=new Soccer();
		System.out.println(C1.get_name());
		C1.get_number_of_team_members();
		System.out.println(C2.get_name());
		C2.get_number_of_team_members();
	}
	/**
	 * Inner class Sports for supporting operations.
	 */
	static class Sports{

		String get_name()
		{
			return "Generic Sports";
		}
		void get_number_of_team_members()
		{
			System.out.println("Each team has n players in "+get_name());
		}
	}

	/**
	 * Inner class Soccer for supporting operations.
	 */
	static class Soccer extends Sports
	{
		String get_name()
		{
			return "Soccer Class";
		}
		void get_number_of_team_members()
		{
			System.out.println("Each team has 11 players in "+get_name());
		}
	}

}
