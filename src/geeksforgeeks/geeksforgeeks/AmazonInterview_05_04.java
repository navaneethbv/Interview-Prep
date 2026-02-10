package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-4-2/
 * Given an array of infinite size containing 0/1 only and in sorted order, find position of first one. 
 */
/**
 * Implementation of Amazon Interview_05_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_05_04 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int size=Integer.parseInt(scanner.nextLine());
		int inputArray[]=new int[size];
		scanner.close();
		int x=new Random().nextInt(size);
		Arrays.fill(inputArray,0);
		for (int i = 0; i < inputArray.length; i++) {
			if(i>x)
				inputArray[i]=1;
		}
		int prevIndex=0,findIndex=5;
		if(size<100){
			for (int i = 0; i < inputArray.length; i++) {
				System.out.print(inputArray[i]);
			}
			System.out.println();
		}
		while(true){
			int index=findfFirstOne(inputArray,prevIndex,findIndex);
			if(index==-1){
				prevIndex=findIndex;
				findIndex+=5;
				if(findIndex>=size)
					findIndex=size-1;
			}
			else{
				int finalIndex=prevIndex+index+1;
				if(inputArray[finalIndex]==1){
					System.out.println("Input is"+(x+1));
					if(inputArray[finalIndex-1]==1)
						System.out.println("Output is"+(finalIndex-1));
					else
						System.out.println("Output is"+finalIndex);
					break;
				}
				else{
					prevIndex-=3;
					findIndex-=3;

				}
			}
		}

	}

	/**
	 * Finds first one in the data structure.
	 *
	 * @param inputArray the array to process
	 * @param prevIndex the prevIndex parameter
	 * @param finalindex the finalindex parameter
	 * @return the computed integer result
	 */
	private static int findfFirstOne(int[] inputArray,int prevIndex,int finalindex) {
		boolean foundOne=false;
		while(foundOne==false){
			// Check for null/base case
			if(inputArray[finalindex]==0)
				return -1;
			else{
				return doBinarySearch(Arrays.copyOfRange(inputArray,prevIndex, finalindex));
			}
		}
		return 100;
	}

	/**
	 * Performs doBinarySearch operation.
	 *
	 * @param arrayOfRange the array to process
	 * @return the computed integer result
	 */
	private static int doBinarySearch(int[] arrayOfRange) {
		int startIndex=0;
		int endIndex=arrayOfRange.length-1;
		int mid=0;
		while(startIndex<endIndex){
			mid=(startIndex+endIndex)/2;
			if(arrayOfRange[mid]==1){
				endIndex=mid-1;
			}
			// Check for null/base case
			else if(arrayOfRange[mid]==0){
				startIndex=mid+1;
			}
		}
		return mid;
	}
}