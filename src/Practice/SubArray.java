package Practice;

/**
 * Implementation of Sub Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SubArray {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int[] array = {3,4,9,2,15,8,12,21,15,1};
		for(int i = 2; i < 5; i++){
			array[i] = array[i];
			System.out.println(array[i]);
		}
		
	}	
}
