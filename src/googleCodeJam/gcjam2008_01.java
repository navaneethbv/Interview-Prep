package googleCodeJam;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Main Link: https://code.google.com/codejam/contests.html
 * Problem Link:https://code.google.com/codejam/contest/32003/dashboard#s=p0	
 * Alien Numbers
 * 
 * 
 * 
 * TO  be done later
 */
/**
 * Implementation of gcjam2008_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class gcjam2008_01 {


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		Integer noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			String inputStringArray[]=scanner.nextLine().split(" ");
			String inputNumber=inputStringArray[0];
			String inputLanguage=inputStringArray[1];
			String outputLanguage=inputStringArray[2];
			int inputIndex=findInputLanguageIndex(inputNumber,inputLanguage);
			String outputNumber=translateInputIndex(inputIndex,outputLanguage);
			System.out.println("Case #"+(i+1)+": "+outputNumber);
		}
		scanner.close();
	}

	/**
	 * Performs translateInputIndex operation.
	 *
	 * @param inputIndex the inputIndex parameter
	 * @param outputLanguage the outputLanguage parameter
	 * @return the resulting string
	 */
	private static String translateInputIndex(int inputIndex, String outputLanguage) {


		return null;
	}

	/**
	 * Finds input language index in the data structure.
	 *
	 * @param inputNumber the inputNumber parameter
	 * @param inputLanguage the inputLanguage parameter
	 * @return the computed integer result
	 */
	private static int findInputLanguageIndex(String inputNumber, String inputLanguage) {
		//make 0 to 9 string array and then check values
		if(inputLanguage.length()==1)
			return inputNumber.length();
		if(inputLanguage.length()<10){
			String inputArray[]=new String[10];
			inputArray[0]=inputLanguage.charAt(0)+"";
			for (int i = 1; i < 10; i++) {
				
			}
		}
		else{

		}



		return 0;
	}
}
