package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Implementation of bigger Is Greater algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class biggerIsGreater {
	static HashMap<String,Integer> elementDiffMap;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.readLine());
		elementDiffMap=new HashMap<String, Integer>();
		for (int i = 0; i < noOfTestCases; i++) {
			String w=scanner.readLine();
			
			findLongestSequenceIndexes(w);
			getMaxIndex();
			swapElement();
			sortSuffix();
		}
	}
	/**
	 * Finds longest sequence indexes in the data structure.
	 *
	 * @param w the w parameter
	 */
	private static void findLongestSequenceIndexes(String w) {
		elementDiffMap=new HashMap<String, Integer>();
		char previousElement=w.charAt(0);
		char presentElement=w.charAt(0);
		Boolean decreasingFlag=false;
		int startIndex=0,stopIndex=0;;
		// Iterate through all elements
		for (int i = 0; i < w.length(); i++) {//add fix for the first element
				System.out.println(presentElement);
			if(previousElement>presentElement && !decreasingFlag)
			{	
				startIndex=i-1;
				decreasingFlag=true;
			}else if(previousElement>presentElement && decreasingFlag){
				stopIndex=i;

			}else{
				decreasingFlag=false;
				if(startIndex!=stopIndex)
				{
					elementDiffMap.put(startIndex+"|"+stopIndex, stopIndex-startIndex);
				}
			}
			previousElement=presentElement;
			presentElement=w.charAt(i);
		}
		Object[] keys=elementDiffMap.keySet().toArray();
		Object[] values=elementDiffMap.values().toArray();
		
		// Iterate through all elements
		for (int i = 0; i < keys.length; i++) {
			System.out.println(keys[i]);
			System.out.println(values[i]);
			
		}
	}
	/**
	 * Performs sortSuffix operation.
	 *
	 */
	private static void sortSuffix() {

	}

	/**
	 * Performs swapElement operation.
	 *
	 */
	private static void swapElement() {

	}

	/**
	 * Retrieves max index from the data structure.
	 *
	 */
	private static void getMaxIndex() {

	}

}
//find longest decreasing sequence
//find element greater then pivot but but smaller in the sequence
//swap it
//sort the suffix
