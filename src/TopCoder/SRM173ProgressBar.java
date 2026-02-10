package TopCoder;

/*
 * SRM 173 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1975&rd=4670
 */

/**
 * Implementation of SRM173 Progress Bar algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM173ProgressBar {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs showProgress operation.
	 *
	 * @param taskTimes the array to process
	 * @param tasksCompleted the tasksCompleted parameter
	 * @return the resulting string
	 */
	public static String showProgress(int[] taskTimes, int tasksCompleted){
		int total=0;
		int completed=0;
		// Iterate through all elements
		for (int i = 0; i < taskTimes.length; i++) {
			if(i<tasksCompleted)
				completed+=taskTimes[i];
			total+=taskTimes[i];
		}
		double percentComplete=20*(completed/(float)total);
		int percent=(int)Math.floor(percentComplete);
		StringBuilder sb=new StringBuilder();
		for (int i = 1; i <=20; i++) {
			if(i<=percent)
				sb.append("#");
			else
				sb.append(".");
		}
		return sb.toString();
	}
}
