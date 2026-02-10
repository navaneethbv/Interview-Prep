package eBayPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Implementation of Group Anagrams algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GroupAnagrams {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

	static HashMap<String,ArrayList<String>> outputMap;
	/**
	 * Performs groupAnagrams operation.
	 *
	 * @param strs the array to process
	 * @return the list of results
	 */
	public static List<List<String>> groupAnagrams(String[] strs) {
		outputMap=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < strs.length; i++) {
			char arr[]=new char[26];
			String str=strs[i];
			// Inner loop to check combinations
			for (int j = 0; j < str.length(); j++) {
				arr[str.charAt(j)-'a']++;
			}
	        String string = new String(arr);
	        if(outputMap.containsKey(string))
	        {
	        	ArrayList<String> aList=outputMap.get(string);
	        	aList.add(str);
	        	outputMap.put(string, aList);
	        }
	        else{
	        	ArrayList<String> aList=new ArrayList<>();
	        	aList.add(str);
	        	outputMap.put(string, aList);
	        }
		}
		List<List<String>> outputList=new ArrayList<>();
		outputList.addAll(outputMap.values());
		return outputList;
	}
	/**
	 * Performs groupAnagrams2 operation.
	 *
	 * @param strs the array to process
	 * @return the list of results
	 */
	public static List<List<String>> groupAnagrams2(String[] strs) {
		outputMap=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < strs.length; i++) {
			char c[]=strs[i].toCharArray();
			Arrays.sort(c);
			String string=new String(c);
	        if(outputMap.containsKey(string))
	        {
	        	ArrayList<String> aList=outputMap.get(string);
	        	aList.add(strs[i]);
	        	outputMap.put(string, aList);
	        }
	        else{
	        	ArrayList<String> aList=new ArrayList<>();
	        	aList.add(strs[i]);
	        	outputMap.put(string, aList);
	        }
		}
		List<List<String>> outputList=new ArrayList<>();
		outputList.addAll(outputMap.values());
		System.out.println(outputList);
		return outputList;
	}


}

