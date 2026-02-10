package Warmup;

/*
 * 
 */	
/**
 * Implementation of square Skype2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class squareSkype2 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){

	}

	/**
	 * Performs checkNumber operation.
	 *
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkNumber(Long i) {
		StringBuilder sb=new StringBuilder(i.toString());
		sb.reverse();
		String str=sb.toString();
		int oddSum=0,oddSumNew=0;
		// Inner loop to check combinations
		for (int j = 0; j < str.length(); j++) {
			// Check for null/base case
			if(j%2==0)
			{
				oddSumNew+=Integer.parseInt(str.charAt(j)+"");
			}
			else{
				int value=2*Integer.parseInt(str.charAt(j)+"");
				if(value>9)
				{
					String strn=String.valueOf(value);
					value=0;
					for (int k = 0; k < strn.length(); k++) {
						value+=Integer.parseInt(strn.charAt(k)+"");
					}
				}
				oddSum+=value;
			}
		}
		// Check for null/base case
		if((oddSum+oddSumNew)%10==0)
			return true;
		return false;
	}

}