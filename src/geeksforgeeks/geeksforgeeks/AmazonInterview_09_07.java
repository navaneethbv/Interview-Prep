package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-8-2/
 * Given an array of strings, find the string which is made up of maximum number of other strings contained in the same array.
 * e.g. rat, cat, abc, xyz, abcxyz, ratcatabc, xyzcatratabc
 * Answer: xyzcatratabc
 * abcxyz contains 2 other strings,
 * ratcatabc contains 3 other strings,
 * xyzcatratabc contains 4 other strings
 */;
/**
 * Implementation of Amazon Interview_09_07 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_09_07 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new  Scanner(new InputStreamReader(System.in));
		 Integer noOfStrings=Integer.parseInt(scanner.nextLine());
		 ArrayList<String> inputList=new ArrayList<String>();
		 for (int i = 0; i < noOfStrings; i++) {
			 inputList.add(scanner.nextLine());
		 }
		 scanner.close();
		 System.out.println("Max String is : "+findMaxString(inputList));
		 
	 }

	/**
	 * Finds max string in the data structure.
	 *
	 * @param inputList the inputList parameter
	 * @return the resulting string
	 */
	private static String findMaxString(ArrayList<String> inputList) {
		int maxCount=0;
		String outputString="";
		for (int i = 0; i < inputList.size(); i++) {
			String input=inputList.get(i);
			int count=0;
			// Inner loop to check combinations
			for (int j = 0; j < inputList.size(); j++) {
				if(i==j)
					continue;
				else{
					if(input.contains(inputList.get(j))){
						count++;
					}
				}
			}
			if(count>maxCount){
				maxCount=count;
				outputString=input;
			}
		}
		return outputString;
	}

 }