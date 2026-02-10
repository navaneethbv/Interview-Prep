package GeeksforGeeksPractice;

/*
 * Link: http://www.geeksforgeeks.org/equilibrium-index-of-an-array/
 */
/**
 * Implementation of Equilibrium Index Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class EquilibriumIndexArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds equlibrium point in the data structure.
	 *
	 * @param arr the array to process
	 */
	private static void findEqulibriumPoint(int[] arr) {
		int sum=0,leftSum=0;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			sum=sum-arr[i];
			if(leftSum==sum){
				System.out.println(i);
				break;
			}
			leftSum+=arr[i];
		}
		
	}

	
}
