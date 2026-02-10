package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;


/*
 * http://www.geeksforgeeks.org/amazon-interview-set-37/
 * Given an array of n numbers with repetition of numbers.
 * You need to find the max length of continuous sub array with at max 3 unique elements.
 * For eg
 * array: 1 2 3 1 4 3 4 1 2
 * ans: 6 (3 1 4 3 4 1)
 */;
/**
 * Implementation of Amazon Interview_37_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_37_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	/**
	 * Finds m ax length in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return the computed integer result
	 */
	private static int findMAxLength(int[] inputArray) {
		StringBuffer sb=new StringBuffer();
		int length=3;
		int maxLength=3;
		sb.append(inputArray[0]+""+inputArray[1]+""+inputArray[2]);
		for (int i = 3; i < inputArray.length; i++) {
			if(sb.toString().contains(inputArray[i]+"")){
				sb.deleteCharAt(sb.indexOf(inputArray[i]+""));
				length++;
				sb.append(inputArray[i]);
			}else{
				if(length>maxLength)
					maxLength=length;
				sb.deleteCharAt(0);
				length=3;
				sb.append(inputArray[i]+"");
			}
		}
		
		return maxLength;
	}
 }