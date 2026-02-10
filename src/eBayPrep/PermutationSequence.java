package eBayPrep;

/**
 * Implementation of Permutation Sequence algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PermutationSequence {


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	
	static int counter=0;
	static String outputString="";
	/**
	 * Retrieves permutation from the data structure.
	 *
	 * @param n the size or count parameter
	 * @param k the k value
	 * @return the resulting string
	 */
	public static String getPermutation(int n, int k) {
		StringBuilder sb=new StringBuilder();
		for (int i = 1; i <=n; i++) {
			sb.append(i);
		}
		outputString="";
		counter=1;
		printPermutation("",sb.toString(),k);
		return outputString;
	}

	/**
	 * Performs printPermutation operation.
	 *
	 * @param prefix the prefix parameter
	 * @param str the str parameter
	 * @param k the k value
	 */
	private static void printPermutation(String prefix,String str,int k) {
		// Check for null/base case
		if(str.length()==0){
			if(counter==k)
				outputString=prefix;
			counter++;
		}
		// Iterate through all elements
		for (int i = 0; i < str.length(); i++) {
			printPermutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1),k);
		}
	}


}

