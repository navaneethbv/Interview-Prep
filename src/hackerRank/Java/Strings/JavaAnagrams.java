package hackerRank.Java.Strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-anagrams
 */

/**
 * Implementation of Java Anagrams algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaAnagrams {

	  /**
	   * Checks if anagram.
	   *
	   * @param A the A parameter
	   * @param B the B parameter
	   * @return true if condition is met, false otherwise
	   */
	  static boolean isAnagram(String A, String B) {
	      char aArray[]=A.toLowerCase().toCharArray();
	      Arrays.sort(aArray);
	      char bArray[]=B.toLowerCase().toCharArray();
	      Arrays.sort(bArray);
	      if(new String(aArray).contentEquals(new String(bArray)))
	    	  return true;
	      return false;
	  }
	    /**
	     * Main method to test the functionality of the class with various test cases.
	     *
	     * @param args the array to process
	     */
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        boolean ret=isAnagram(A,B);
	        if(ret)System.out.println("Anagrams");
	        else System.out.println("Not Anagrams");
	        
	    }
}
