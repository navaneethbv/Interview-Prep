package TopCoder;

/*
 * SRM 144 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1708&rd=4515
 */

/**
 * Implementation of SRM144 Time algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM144Time {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	/*public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs whatTime operation.
	 *
	 * @param seconds the seconds parameter
	 * @return the resulting string
	 */
	public static String whatTime(int seconds){
		int secondsValue=(seconds%60);
		int hoursValue=(seconds/3600);
		int minutesValue=(seconds/60)%60;
		return hoursValue+":"+minutesValue+":"+secondsValue;
	}
}
