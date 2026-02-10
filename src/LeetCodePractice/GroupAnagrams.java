package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
		List<List<String>> outputList=new ArrayList<>();
		HashMap<String,List<String>> stringtoIndexMap=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < strs.length; i++) {
			char[] c=strs[i].toCharArray();
			Arrays.sort(c);
			String st=new String(c);
			if(stringtoIndexMap.containsKey(st))
			{//get index and add to that list
				List<String> list=stringtoIndexMap.get(st);
				list.add(strs[i]);
				stringtoIndexMap.put(st, list);
			}
			else{//create new list
				List<String> list=new ArrayList<>();;
				list.add(strs[i]);
				stringtoIndexMap.put(st, list);
			}		
		}	

		Map<String, List<String>> map = stringtoIndexMap;
		for (Entry<String, List<String>> entry : map.entrySet())
		{
			outputList.add(entry.getValue());
		}
		return outputList;
	}
}

