package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-24/
 * Reverse bits in a binary
 */;
/**
 * Implementation of Amazon Interview_24_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_24_04 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		Integer inputNumber=Integer.parseInt(scanner.nextLine());
		scanner.close();
		String binaryInput=Integer.toBinaryString(inputNumber);
		System.out.println("Output is "+reverseBits(binaryInput));
	 }

	/**
	 * Performs reverseBits operation.
	 *
	 * @param binaryInput the binaryInput parameter
	 * @return the resulting string
	 */
	private static String reverseBits(String binaryInput) {
		String input=(binaryInput);
		input=input.replaceAll("0","2");
		input=input.replaceAll("1","0");
		input=input.replaceAll("2","1");		
		return input;
	}

	

 }