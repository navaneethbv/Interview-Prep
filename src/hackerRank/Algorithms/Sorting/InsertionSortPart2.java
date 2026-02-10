package hackerRank.Algorithms.Sorting;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/insertionsort1
 */
/**
 * Implementation of Insertion Sort Part2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class InsertionSortPart2 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int size=Integer.parseInt(scanner.nextLine());
		String[] inputArray=scanner.nextLine().split(" ");
		for (int i = 1; i <inputArray.length; i++) {
			insertionSorter(inputArray,i);
		}

	}

	/**
	 * Performs insertionSorter operation.
	 *
	 * @param inputArray[] the array to process
	 * @param index the index parameter
	 */
	public static void insertionSorter(String inputArray[],int index) {
		String[] str=inputArray;
		inputArray=Arrays.copyOfRange(inputArray, 0, index+1);
		int value=Integer.parseInt(inputArray[inputArray.length-1]);
		for (int i = inputArray.length-2; i >=0; i--) {
			int arrayValue=Integer.parseInt(inputArray[i]);
			if(arrayValue>value)
			{
				inputArray[i+1]=String.valueOf(arrayValue);
			}
			else if(arrayValue<value)
			{
				inputArray[i+1]=String.valueOf(value);
				break;
			}
		}
		if(Integer.parseInt(inputArray[0])>value){
			inputArray[0]=String.valueOf(value);
		}
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			str[i]=inputArray[i];
		}
		System.out.println(Arrays.toString(str).replaceAll(",", "").replace("[","").replace("]", ""));
	}
}
