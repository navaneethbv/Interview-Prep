package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-16/
 * Given a character array find the first element that repeats itself.
 */;
/**
 * Implementation of Amazon Interview_15_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_15_04 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }
	 /**
	  * Finds repeating element map in the data structure.
	  *
	  * @param inputString the inputString parameter
	  * @return the resulting string
	  */
	 private static String findRepeatingElementMap(String inputString) {
		 HashMap<Character,Character> elementMap=new HashMap<Character, Character>();
		 // Iterate through all elements
		 for (int i = 0; i < inputString.length(); i++) {
			 char element=inputString.charAt(i);
			 if(elementMap.containsKey(element))
				 return element+" ";
			 else{
				 elementMap.put(element,element);
			 }
		 }
		 return "No Element is repeating";
	 }

 }