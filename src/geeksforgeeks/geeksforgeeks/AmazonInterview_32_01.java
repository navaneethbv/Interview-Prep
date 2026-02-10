package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Scanner;




/*
 * http://www.geeksforgeeks.org/amazon-interview-set-32/
 * http://www.careercup.com/question?id=12998667
 * Verify if the given password is valid/invalid; 
 * 1. must be 5-12 characters long 
 * 2. must contain atleast one number and one lowercase character 
 * 3. a sequence must not be followed by the same sequence
 * (like 123123qs is invalid, 123qs123 is valid)
 */;
/**
 * Implementation of Amazon Interview_32_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_32_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	 /**
	  * Performs verifyPassword operation.
	  *
	  * @param password the password parameter
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean verifyPassword(String password) {
		 if(password.length()>4 && password.length()<13)
		 {
			 if(password.matches(".*\\d.*") && password.matches(".*[a-z].*")){
				 // Iterate through all elements
				 for (int i = 0; i < password.length(); i++) {
					 int counter=0;
					 for (int j = i; j < password.length(); j++) {
						 if((i+counter+1)>0 && (i+counter+1)<password.length()) 	
						 {
							 String startString=password.substring(i,i+counter+1);
							 if(((i+counter+1)>0 && (i+counter+1)<password.length())
									 &&	((i+counter+counter+2)>0 && (i+counter+counter+2)<=password.length()))
							 {	
								 String endString=password.substring(i+counter+1,i+counter+2+counter);
								 if(startString.contentEquals(endString))
									 return false;

							 }
						 }
						 counter++;
					 }
				 }
				 return true;
			 }
		 }
		 return false;
	 }
 }