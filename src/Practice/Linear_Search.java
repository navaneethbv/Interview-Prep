package Practice;

import java.util.Scanner;

/**
 * Implementation of Linear_ Search algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Linear_Search {	
	/**
	 * Searches for .
	 *
	 * @param array the array to process
	 * @param x the x parameter
	 * @return the computed integer result
	 */
	public static int search(int[] array, int x){
		// Iterate through all elements
		for(int i = 0; i < array.length; i++){
			if(array[i] == x){
				return i;
			}
		}
		return -1;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int[] array = {12,44,66,36,98,73};
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be searched");
		int number = scan.nextInt();
		if(search(array,number) != -1){
			System.out.println("Number found at position "+search(array,number));
		}
		else 
			System.out.println("Number is not present in the array");
	}

}
