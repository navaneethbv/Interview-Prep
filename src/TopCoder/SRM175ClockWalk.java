package TopCoder;

/*
 * SRM 175 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=2241&rd=4680
 */



/**
 * Implementation of SRM175 Clock Walk algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM175ClockWalk {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(finalPosition("hhthh"));
		System.out.println(finalPosition("hhtht"));
		System.out.println(finalPosition("hthth"));
		System.out.println(finalPosition("hthhhhh"));
		System.out.println(finalPosition("hthhthtththhtttthttthhhthtttthh"));
	}
	/**
	 * Performs finalPosition operation.
	 *
	 * @param flips the flips parameter
	 * @return the computed integer result
	 */
	public static int finalPosition(String flips){
		int value=0;
		// Iterate through all elements
		for (int i = 0; i < flips.length(); i++) {
			if(flips.charAt(i)=='h')
			{
				value+=i+1;
			}else{
				value-=(i+1);
			}
		}
		value=value%12;
		return value<=0?12+value:value;
	}
}
