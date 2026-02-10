package Warmup;
/**
 * Implementation of google Assessment1 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class googleAssessment1 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs geMaxValue operation.
	 *
	 * @param value the value value
	 * @return the computed integer result
	 */
	private static int geMaxValue(int value) {
		System.out.println(value);
		int max=Integer.MIN_VALUE;
		String str=value+"";
		char c=str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if(c==str.charAt(i)){
				String str1=str.substring(0,i)+str.substring(i+1);
				max=Math.max(max, Integer.parseInt(str1));
			}
			else{
				c=str.charAt(i);
			}
		}
		return max;
	}
	


}
