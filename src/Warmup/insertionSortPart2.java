package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.hackerrank.com/challenges/insertionsort2
/**
 * Implementation of insertion Sort Part2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class insertionSortPart2 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		int s=Integer.parseInt(scanner.readLine());
		String inputLine=scanner.readLine();
		String inputArray[]=inputLine.split(" ");
		for (int i = 1; i < s; i++) {
			String[] partiallySortedArray=insertionSort1(Arrays.copyOf(inputArray,i+1));
			for (int j = 0; j < partiallySortedArray.length; j++) {
				inputArray[j]=partiallySortedArray[j];
			}
			printArray(inputArray);
		}
		
	}
	/**
	 * Performs printArray operation.
	 *
	 * @param inputArray the array to process
	 */
	private static void printArray(String[] inputArray) {
		// Iterate through all elements
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]+" ");
		}
		System.out.println();
	}
	/**
	 * Performs insertionSort1 operation.
	 *
	 * @param inputArray the array to process
	 * @return the resulting array
	 */
	public static String[] insertionSort1(String[] inputArray){
		int rightPositionElement=Integer.parseInt(inputArray[inputArray.length-1]);
		int positionCheck=inputArray.length-2;
		int previousElement=0,presentElement=Integer.parseInt(inputArray[positionCheck]);
		int index=-1;
		String[] modifiedArray=Arrays.copyOf(inputArray,inputArray.length);
		for (int i = modifiedArray.length-2; i >=0; i--) {
			presentElement=Integer.parseInt(inputArray[i]);
			if(previousElement!=presentElement){
				if(presentElement>rightPositionElement)
				{
					// Inner loop to check combinations
					for (int j = 0; j < modifiedArray.length; j++) {
						if(Integer.parseInt(inputArray[j])==presentElement)
							modifiedArray[j+1]=(inputArray[j]);
					}
				}
				else
				{
					index=i;
					break;
				}
			}
			previousElement=presentElement;
		}
		modifiedArray[index+1]=rightPositionElement+"";
		return modifiedArray;
	}
}
