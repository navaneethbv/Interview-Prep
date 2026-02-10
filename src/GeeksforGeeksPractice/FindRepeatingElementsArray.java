package GeeksforGeeksPractice;

/*
 * Link: http://www.geeksforgeeks.org/find-the-two-repeating-elements-in-a-given-array/
 */
/**
 * Implementation of Find Repeating Elements Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindRepeatingElementsArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds repeating elements in the data structure.
	 *
	 * @param arr the array to process
	 */
	private static void findRepeatingElements(int[] arr) {
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			if(arr[Math.abs(arr[i])]>0)
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			else
				System.out.println(arr[i]);
		}
		
	}

	
}
