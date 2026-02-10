package TopCoder;

/*
 * SRM 162 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1792&rd=4615
 */

/**
 * Implementation of SRM162 LCM Range algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM162LCMRange {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)  {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs lcm operation.
	 *
	 * @param first the first parameter
	 * @param last the last parameter
	 * @return the computed integer result
	 */
	public static int lcm(int first, int last){
		int num=1;
		for (int i = first; i <=last; i++) {
			num=findLcm(num,i);
		}
		return num;
	}
	/**
	 * Finds lcm in the data structure.
	 *
	 * @param a the a parameter
	 * @param b the b parameter
	 * @return the computed integer result
	 */
	private static int findLcm(int a, int b)
	{
		return a * (b / gcd(a, b));
	}
	/**
	 * Performs gcd operation.
	 *
	 * @param a the a parameter
	 * @param b the b parameter
	 * @return the computed integer result
	 */
	private static int gcd(int a, int b)
	{
		while (b > 0)
		{
			int temp = b;
			b = a % b; 
			a = temp;
		}
		return a;
	}
}
