package appleInterview;

/**
 * Implementation of Prep Doc Find Two Missing Elements algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocFindTwoMissingElements {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds two missing elements in the data structure.
	 *
	 * @param is the array to process
	 */
	private static void findTwoMissingElements(int[] is) {
		int sum=0;
		int product=1;
		int N=is.length+2;
		int fullSum=0,fullProduct=1;
		// Iterate through all elements
		for (int i = 0; i < is.length; i++) {
			product*=is[i];
			sum+=is[i];
			fullProduct*=i+1;
		}
		fullProduct*=N;
		fullProduct*=N-1;
		fullSum=N*(N+1)/2;
		int SUM=fullSum-sum;
		int PRODUCT=fullProduct/product;
		System.out.println((int)(SUM/2 + Math.sqrt(SUM*SUM - 4*PRODUCT)/(double)2));
		System.out.println((int)(SUM/2 - Math.sqrt(SUM*SUM - 4*PRODUCT)/2));
	}

}
