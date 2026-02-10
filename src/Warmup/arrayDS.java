package Warmup;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/arrays-ds 
 */	
/**
 * Implementation of array DS algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class arrayDS {

	  /**
	   * Main method to test the functionality of the class with various test cases.
	   *
	   * @param args the array to process
	   */
	  public static void main(String[] args) {
	        Scanner scanner=new Scanner(new InputStreamReader(System.in));
	        int N=Integer.parseInt(scanner.nextLine());
	        String inputArray[]=scanner.nextLine().split(" ");
	        scanner.close();
	        for(int i=N-1;i>=0;i--)
	        {
	        System.out.print(inputArray[i]+" ");    
	        }
	    }

}