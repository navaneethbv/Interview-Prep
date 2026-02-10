package eBayPrep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Implementation of Repeated DNA Sequences algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RepeatedDNASequences {
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
	 * Finds repeated dna sequences in the data structure.
	 *
	 * @param s the s parameter
	 * @return the list of results
	 */
	public static List<String> findRepeatedDnaSequences(String s) {
		List<String> outputList=new ArrayList<>();
		HashSet<String> set=new HashSet<>();
		HashSet<String> outputSet=new HashSet<>();
		// Iterate through all elements
		for (int i = 0; i <=s.length()-10; i++) {
			String st=s.substring(i,i+10);
			// Check for null/base case
			if(st.length()==10 && !set.contains(st))
			{
				set.add(st);
			}
			// Check for null/base case
			else if(st.length()==10 && set.contains(st) && !outputSet.contains(st))
			{
				outputList.add(st);
				outputSet.add(st);
			}
		}
		return outputList;
	}
}

