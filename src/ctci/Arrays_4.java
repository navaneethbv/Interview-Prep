package ctci;

import java.io.InputStreamReader;
import java.util.Scanner;

/*Implementation of CTCI 1.5*/
/**
 * Implementation of Arrays_4 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Arrays_4 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs compressedString operation.
	 *
	 * @param inputString the inputString parameter
	 * @return the resulting string
	 */
	public static String compressedString(String inputString){
		String outputString="";
		char previousChar=' ';
		int previousCharCount=0;
		// Iterate through all elements
		for (int i = 0; i < inputString.length(); i++) {
			char currentChar=inputString.charAt(i);
			if(currentChar!=previousChar)
			{
				if(previousChar!=' ')
					outputString+=previousCharCount;
				previousChar=currentChar;
				previousCharCount=1;
				outputString+=currentChar;
			}
			else{
				previousCharCount++;
			}
		}
		outputString+=previousCharCount;
		if(outputString.length()>inputString.length())
			return inputString;
		return outputString;
	}

}
