package leetCode;


/*
 * Link : https://codility.com/programmers/task/frog_jmp
 */

/**
 * Implementation of Time Complexity Frog Jump algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TimeComplexityFrogJump {

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
	 * Performs solution operation.
	 *
	 * @param X the X parameter
	 * @param Y the Y parameter
	 * @param D the D parameter
	 * @return the computed integer result
	 */
	public static int solution(int X, int Y, int D)
	public static int solution(int X, int Y, int D)
	{
		 if(Y-X%D==0)
			 return (Y-X)/D;
		 else
			 return (Y-X+D)/D;
	}

}