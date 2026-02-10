package Practice;

import java.util.HashSet;

/**
 * Implementation of Repeated Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RepeatedInteger {
	/**
	 * Checks if repeated.
	 *
	 * @param array the array to process
	 * @return the computed integer result
	 */
	public static int isRepeated(int[] array){
		HashSet<Integer> set = new HashSet<Integer>();
		// Iterate through all elements
		for(int i = 0; i < array.length; i++){
			if(!set.contains(array[i])) {
					set.add(array[i]);
			}
			else
				return array[i];
		}
		return -1;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int[] array = {1,4,0,8,12,4,34};
		if(isRepeated(array) != -1){
			System.out.println("The repeated number in the array is "+isRepeated(array));
		}
		else
			System.out.println("There are no repeated numbers in the array");
	}
}
