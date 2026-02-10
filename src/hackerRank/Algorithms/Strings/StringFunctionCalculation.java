package hackerRank.Algorithms.Strings;

import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
/*
 * Link:https://www.hackerrank.com/challenges/string-function-calculation
 */
/**
 * Implementation of String Function Calculation algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StringFunctionCalculation {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds m ax string function in the data structure.
	 *
	 * @param input the input parameter
	 * @return the computed integer result
	 */
	private static int findMAxStringFunction(String input) {
		int max=0;
		HashSet<String> setString=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				String subStringInput=input.substring(i,j+1);
				if(!setString.contains(subStringInput))
				{
					setString.add(subStringInput);
					int count=countOccurences(input,subStringInput);
					if(count*subStringInput.length()>max)
						max=count*subStringInput.length();
				}
			}
		}
		return max;
	}

	/**
	 * Counts the number of occurences.
	 *
	 * @param mainString the mainString parameter
	 * @param pattern the pattern parameter
	 * @return the computed integer result
	 */
	private static int countOccurences(String mainString,String pattern) {
		if(mainString.indexOf(pattern)!=-1)
		{
			int count=0;
			int index=mainString.indexOf(pattern, 0);
			while(index!=-1 && index<mainString.length())
			{
				count++;
				index=mainString.indexOf(pattern, index+1);
			}
			return count;
		}
		else
			return -1;
	}
}
