package ctci;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*Implementation of Insertion Sort*/
/**
 * Implementation of Algo Insertion Sort algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AlgoInsertionSort{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		String inputStringArray[]=scanner.nextLine().split(",");
		scanner.close();
		int inputArray[]=new int[inputStringArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i]=Integer.parseInt(inputStringArray[i]);
		}
		System.out.println(Arrays.toString(inputArray));
		int outputArray[]=insertionSort(inputArray);
		System.out.println(Arrays.toString(outputArray));
	}

	/**
	 * Performs insertionSort operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	private static int[] insertionSort(int[] inputArray) {

		return null;
	}
}