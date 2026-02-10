package hackerRank.Algorithms.Strings;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
/*
 * Link:https://www.hackerrank.com/challenges/find-strings
 */
/**
 * Implementation of Find Strings algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindStrings {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfStrings=Integer.parseInt(scanner.nextLine().trim());
		ArrayList<String> stringList=new ArrayList<>();
		for (int i = 0; i < noOfStrings; i++) {
			stringList.add(scanner.nextLine().replaceAll(" ",""));
		}
		stringList=findLexicographUnionSet(stringList);
		Object arr[]=(stringList.toArray());
		Arrays.sort(arr);
		int noOfTestCases=Integer.parseInt(scanner.nextLine().replaceAll(" ",""));
		for (int i = 0; i < noOfTestCases; i++) {
			int index=Integer.parseInt(scanner.nextLine().replaceAll(" ",""));
			if(index>stringList.size()){
				System.out.println("INVALID");
				continue;
			}
			System.out.println(findStringIndexed(index-1,stringList));
		}
	}

	/**
	 * Finds string indexed in the data structure.
	 *
	 * @param index the index parameter
	 * @param stringList the stringList parameter
	 * @return the resulting string
	 */
	private static String findStringIndexed(int index,ArrayList<String> stringList) {
		return stringList.get(index);
	}

	/**
	 * Finds lexicograph union set in the data structure.
	 *
	 * @param stringList the stringList parameter
	 * @return the list of results
	 */
	private static ArrayList<String> findLexicographUnionSet(ArrayList<String> stringList) {
		ArrayList<String> outputList=new ArrayList<String>();
		HashSet<String> stringSet=new HashSet<String>();
		for (int i = 0; i < stringList.size(); i++) {
			ArrayList<String> splitStringList=getListOfString(stringList.get(i));
			// Inner loop to check combinations
			for (int j = 0; j < splitStringList.size(); j++) {
				if(!stringSet.contains(splitStringList.get(j).replaceAll(" ","")))
				{
					outputList.add(splitStringList.get(j).replaceAll(" ",""));
					stringSet.add(splitStringList.get(j).replaceAll(" ",""));
				}
			}
		}
		return outputList;
	}

	/**
	 * Retrieves list of string from the data structure.
	 *
	 * @param string the string parameter
	 * @return the list of results
	 */
	private static ArrayList<String> getListOfString(String string) {
		ArrayList<String> stringList=new ArrayList<String>();
		HashSet<String> stringSet=new HashSet<String>();
		// Iterate through all elements
		for (int i = 0; i < string.length(); i++) {
			String s=string.substring(i).trim();
			// Inner loop to check combinations
			for (int j = 0; j < s.length(); j++) {
				String split=s.substring(0, j+1).trim().replaceAll(" ","");
				if(!stringSet.contains(split.trim()))
				{
					stringList.add(split.trim());
					stringSet.add(split.trim());
				}
			}
		}
		return stringList;
	}
}
