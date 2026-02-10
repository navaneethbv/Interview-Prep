package TopCoder;

import java.util.Arrays;
import java.util.HashMap;

/*
 * SRM 684 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=14184&rd=16688
 */

/**
 * Implementation of SRM684 Istr algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM684Istr {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(count("aba",1));		
		System.out.println(count("abacaba",0));
		System.out.println(count("abacaba",1));		
		System.out.println(count("abacaba",3));
		System.out.println(count("abc",3));		
		System.out.println(count("wersrsresesrsesrawsdsw",11));
	}
	/**
	 * Counts the number of .
	 *
	 * @param s the s parameter
	 * @param k the k value
	 * @return the computed integer result
	 */
	public static int count(String s, int k){
		HashMap<Character,Integer> elementCount=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(elementCount.containsKey(c)){
				elementCount.put(c, elementCount.get(c)+1);
			}
			else{
				elementCount.put(c,1);
			}
		}
		Object[] valuesArray=elementCount.values().toArray();
		int value=0;
		for (int i = 0; i < k; i++) {
			Arrays.sort(valuesArray);
			valuesArray[valuesArray.length-1]=(int)valuesArray[valuesArray.length-1]-1;
		}
		// Iterate through all elements
		for (int i = 0; i < valuesArray.length; i++) {
			value+=(int)valuesArray[i]*(int)valuesArray[i];
		}
		return value;
	}
}
