package yelpInterview;

/**
 * Implementation of Algo Permutations Of String algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AlgoPermutationsOfString {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs printPermutations operation.
	 *
	 * @param string the string parameter
	 */
	private static void printPermutations(String string) {
		permute(string,0,string.length()-1);
	}

	/**
	 * Performs permute operation.
	 *
	 * @param string the string parameter
	 * @param l the l parameter
	 * @param r the r parameter
	 */
	private static void permute(String string, int l, int r) {
		if(l==r)
		{
			System.out.println(string);
		}
		else{
			for (int i = l; i <=r; i++) {
				string=swap(string,l,i);
				permute(string,l+1,r);
				string=swap(string,l,i);
			}
		}

	}

	/**
	 * Performs swap operation.
	 *
	 * @param string the string parameter
	 * @param l the l parameter
	 * @param r the r parameter
	 * @return the resulting string
	 */
	private static String swap(String string, int l, int r) {
		if(l==r)
			return string;
		string=string.substring(0,l)+string.charAt(r)+string.substring(l+1,r)+string.charAt(l)+string.substring(r+1);
		return string;
	}

}

