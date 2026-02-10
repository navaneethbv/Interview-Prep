package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
	/**
	 * Performs groupAnagrams operation.
	 *
	 * @param strs the array to process
	 * @return the list of results
	 */
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map=new HashMap<>();
		List<List<String>> outputList=new ArrayList<>();
		// Iterate through all elements
		for (int i = 0; i < strs.length; i++) {
			String str=strs[i];
			char c[]=new char[26];
			// Inner loop to check combinations
			for (int j = 0; j < str.length(); j++) {
				c[str.charAt(j)-97]++;
			}
			String key=new String(c);
			if(map.containsKey(key))
			{
				map.get(key).add(str);
			}
			else{
				List<String> list=new ArrayList<>();
				list.add(str);
				map.put(key,list);
			}
		}
		Iterator itr=map.values().iterator();
		while(itr.hasNext())
		{
			outputList.add((List<String>) itr.next());
		}
		return outputList;	
	}
}

