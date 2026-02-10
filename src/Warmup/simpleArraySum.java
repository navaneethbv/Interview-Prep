package Warmup;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link: https://www.hackerrank.com/challenges/simple-array-sum
*/	
/**
 * Implementation of simple Array Sum algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class simpleArraySum {


	    /**
	     * Main method to test the functionality of the class with various test cases.
	     *
	     * @param args the array to process
	     */
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scanner=new Scanner(new InputStreamReader(System.in));
	        int N=Integer.parseInt(scanner.nextLine());
	        String inputArray[]=(scanner.nextLine().split(" "));
	        int sum=0;
	        for(int i=0;i<inputArray.length;i++)
	        {
	            sum+=Integer.parseInt(inputArray[i]);
	        }
	        System.out.println(sum);
	    }
	
	
	
}
