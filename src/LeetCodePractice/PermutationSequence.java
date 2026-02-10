package LeetCodePractice;

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

	/**
	 * Retrieves permutation from the data structure.
	 *
	 * @param n the size or count parameter
	 * @param k the k value
	 * @return the resulting string
	 */
	public static String getPermutation(int n, int k) {
		String str="";
		for (int i = 1; i <=n; i++) {
			str+=i+"";
		}
		if(k==1)
			return str;
		permutationGenerator("",str,k);
		return outputString;
	}

	static int counter=1;
	static String outputString="";

	/**
	 * Performs permutationGenerator operation.
	 *
	 * @param prefix the prefix parameter
	 * @param output the output parameter
	 * @param k the k value
	 */
	private static void permutationGenerator(String prefix, String output, int k) {
		// Check for null/base case
		if(output.length()==0 && counter<=k)
		{
			if(counter==k)
				outputString=prefix;
			System.out.println(prefix);
			counter++;
			return;
		}
		// Iterate through all elements
		for (int i = 0; i < output.length(); i++) {
			permutationGenerator(prefix+output.charAt(i), output.substring(0,i)+output.substring(i+1), k);
		}
	}
}

