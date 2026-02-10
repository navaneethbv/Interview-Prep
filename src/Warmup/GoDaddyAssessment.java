package Warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Implementation of Go Daddy Assessment algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoDaddyAssessment {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs sortIntersect operation.
	 *
	 * @param f the array to process
	 * @param m the array to process
	 * @return the resulting array
	 */
	static int[] sortIntersect(int[] f,int[] m){
		HashMap<Integer, Integer> elementCount=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < f.length; i++) {
			if(elementCount.containsKey(f[i])){
				elementCount.put(f[i], elementCount.get(f[i])+1);
			}
			else{
				elementCount.put(f[i], 1);
			}
		}
		ArrayList<Integer> aList=new ArrayList<>();
		// Iterate through all elements
		for (int i = 0; i < m.length; i++) {
			if(elementCount.containsKey(m[i]) && elementCount.get(m[i])>0){
				elementCount.put(m[i], elementCount.get(m[i])-1);
				aList.add(m[i]);
			}
		}
		Object[] output=(aList.toArray());
		Arrays.sort(output,Collections.reverseOrder());
		int op[]=new int[output.length];
		// Iterate through all elements
		for (int i = 0; i < output.length; i++) {
			op[i]=(int) output[i];
		}
		return op;
	}
}
