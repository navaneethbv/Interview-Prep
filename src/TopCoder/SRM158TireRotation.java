package TopCoder;

import java.util.HashMap;

/*
 * SRM 158 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1791&rd=4598
 */

/**
 * Implementation of SRM158 Tire Rotation algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM158TireRotation {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)  {
		System.out.println(getCycle("ABCD","ABCD"));
		System.out.println(getCycle("ABCD","DCAB"));
		System.out.println(getCycle("ABCD","CDBA"));
		System.out.println(getCycle("ABCD","ABDC"));
		System.out.println(getCycle("ZAXN","XNAZ"));
	}
	/**
	 * Retrieves cycle from the data structure.
	 *
	 * @param initial the initial parameter
	 * @param current the current parameter
	 * @return the computed integer result
	 */
	public static int getCycle(String initial, String current){
		HashMap<Character, Character> charMap=new HashMap<>();
		int x=(int)'A';
		// Iterate through all elements
		for (int i = 0; i < initial.length(); i++) {
			charMap.put(initial.charAt(i),(char)x);
			x++;
		}
		StringBuilder currString=new StringBuilder();
		// Iterate through all elements
		for (int i = 0; i < current.length(); i++) {
			currString.append(charMap.get(current.charAt(i)));
		}
		current=currString.toString();
		if(current.contentEquals("ABCD")){
			return 1;
		}else if(current.contentEquals("DCAB")){
			return 2;
		}else if(current.contentEquals("BADC")){
			return 3;
		}else if(current.contentEquals("CDBA")){
			return 4;
		}
		return -1;
	}
}
