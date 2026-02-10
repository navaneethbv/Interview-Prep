package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;




/*
 * http://www.geeksforgeeks.org/amazon-interview-set-13/
 * You will be given the number of pairs of parenthesis.
 * Find out the total possible valid unique combinations and there should not be any duplicity.
 */;
/**
 * Implementation of Amazon Interview_13_03 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_13_03 {
	 static int counter=0;
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }
    /**
     * Performs printParenthesis operation.
     *
     * @param n the size or count parameter
     */
    static void printParenthesis(int n){
       printParenthesis("",n,n);       
    }

    /**
     * Performs printParenthesis operation.
     *
     * @param s the s parameter
     * @param open the open parameter
     * @param close the close parameter
     */
    static void printParenthesis(String s,int open,int close){
        if(open>close)
           return;
        // Check for null/base case
        if(open == 0 && close == 0){
        	counter++;
            System.out.println(s);
            return;
        }
        if(open < 0 || close<0)
            return;

        printParenthesis(s + '(',open-1,close);
        printParenthesis(s + ')',open,close-1);
    }

 }