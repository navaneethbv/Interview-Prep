package TopCoder;

/*
 * SRM 170 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1930&rd=4655
 */



/**
 * Implementation of SRM170 Level Up algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM170LevelUp {
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
	 * Performs toNextLevel operation.
	 *
	 * @param expNeeded the array to process
	 * @param received the received parameter
	 * @return the computed integer result
	 */
	public static int toNextLevel(int[] expNeeded, int received){
		int additionalExp=-1;
		// Iterate through all elements
		for (int i = 0; i < expNeeded.length; i++) {
			if(additionalExp==-1)
			{
				additionalExp=expNeeded[0];
			}
			else{
				additionalExp=expNeeded[i]-expNeeded[i-1];
			}
			int diff=received-additionalExp;
			if(diff<0)
				return -received+additionalExp;
			received=received-additionalExp;
		}
		return received;
	}
}
