package geeksforgeeks;

import java.util.Arrays;
import java.util.Random;

/*
 * http://www.geeksforgeeks.org/amazon-interview/
 * Find an element in a sorted rotated integer array.
 */
/**
 * Implementation of Amazon Interview_02_09 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_02_09 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int inputArray[]=new int[10];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i]=new Random().nextInt(10);
		}
		Arrays.sort(inputArray);
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]+" ");
		}
		System.out.println();
		int r=new Random().nextInt(10);
		for (int j = 0; j <r; j++) {
			int[] newArray=Arrays.copyOf(inputArray,inputArray.length);
			for (int i = 0; i < inputArray.length; i++) {
				if(i==0)
					inputArray[i]=newArray[inputArray.length-1];
				else
					inputArray[i]=newArray[i-1];
			}
		}

		System.out.println("Element found is : "+findElement(6,inputArray));
		System.out.println("Element found is : "+findElement(12,inputArray));
		System.out.println("Element found is : "+findElement(2,inputArray));
		
	}

	/**
	 * Finds element in the data structure.
	 *
	 * @param element the element parameter
	 * @param inputArray the array to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findElement(int element, int[] inputArray) {

		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]+" ");
		}
		// Iterate through all elements
		for (int i = 0; i <= inputArray.length/2; i++) {
			if(element==inputArray[inputArray.length-1-i]){
				return true;		
			}
			if(element==inputArray[i]){
				return true;
			}
		}		
		return false;
	}
}
