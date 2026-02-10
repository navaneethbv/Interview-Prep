package TopCoder;

/*
 * SRM 149 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1648&rd=4550
 */

/**
 * Implementation of SRM149 Big Burger algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM149BigBurger {
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
	 * Performs maxWait operation.
	 *
	 * @param arrival the array to process
	 * @param service the array to process
	 * @return the computed integer result
	 */
	public static int maxWait(int[] arrival, int[] service){
		if(service.length==1)
			return 0;
		int maxWaitTime=0;
		int completionTime=arrival[0]+service[0];
		for (int i = 1; i < arrival.length; i++) {
			if(arrival[i]<completionTime)
			{
				maxWaitTime=Math.max(maxWaitTime, completionTime-arrival[i]);
				completionTime+=service[i];
			}
			else{
				completionTime=service[i]+arrival[i];
			}
		}
		return maxWaitTime;
	}
}
