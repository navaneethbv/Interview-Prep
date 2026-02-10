package GeeksforGeeksPractice;

/*
 * http://www.geeksforgeeks.org/leaders-in-an-array/
 */
/**
 * Implementation of Leaders Of Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LeadersOfArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs printLeaders operation.
	 *
	 * @param arr the array to process
	 */
	private static void printLeaders(int[] arr) {
		int max=Integer.MIN_VALUE;
		for (int i = arr.length-1; i >=0; i--) {
			if(arr[i]>max)
			{
				System.out.println(arr[i]);
				max=arr[i];
			}
		}
		
	}

	
}
