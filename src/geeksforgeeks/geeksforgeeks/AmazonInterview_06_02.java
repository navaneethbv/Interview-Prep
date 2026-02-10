package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-4-3/
 * Given an array randomize it,
 * 
 */;
/**
 * Implementation of Amazon Interview_06_02 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_06_02 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int size=Integer.parseInt(scanner.nextLine());
		scanner.close();
		int inputArray[]=new int[size];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i]=new Random().nextInt(i+1);
		}
		System.out.println(Arrays.toString(inputArray));
		HashMap<Integer, Integer> indexMap=new HashMap<Integer, Integer>();
		int outputArray[]=new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			int randomNumber=new Random().nextInt(inputArray.length);
			if(indexMap.containsKey(randomNumber)){
				i=i-1;
			}else{
				indexMap.put(randomNumber,i);
				outputArray[i]=inputArray[randomNumber];
			}
		}
		System.out.println(Arrays.toString(outputArray));
	}
}