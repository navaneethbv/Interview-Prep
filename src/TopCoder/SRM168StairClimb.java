package TopCoder;

/*
 * SRM 149 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1331&rd=4550
 */



/**
 * Implementation of SRM168 Stair Climb algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM168StairClimb {
	/**
	 * Performs stridesTaken operation.
	 *
	 * @param flights the array to process
	 * @param stairsPerStride the stairsPerStride parameter
	 * @return the computed integer result
	 */
	public static int stridesTaken(int[] flights, int stairsPerStride)
	public static int stridesTaken(int[] flights, int stairsPerStride)
	{
		int count=0;
		for(int i=0;i<flights.length;i++){
			if(flights[i]%stairsPerStride==0){
				count+=flights[i]/stairsPerStride;
			}
			else{
				count+=flights[i]/stairsPerStride;
				count++;
			}
			count+=2;
		}
		return count-2;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
}
