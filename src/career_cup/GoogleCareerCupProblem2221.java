package careerCup;

/*
 * Link: http://www.careercup.com/question?id=62221
 * Identify the regular expression in a given string such that the pattern does not repeat.
 * For example, to identify the pattern 'foo' only once in an input.
 * 'jhkhfoojkkj' should be identified right
 * 'kjhfooaaaaafoo' should not be
 */
/**
 * Implementation of Google Career Cup Problem2221 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem2221 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs doRegex operation.
	 *
	 * @param regexString the regexString parameter
	 * @param mainString the mainString parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean doRegex(String regexString,String mainString) {
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < mainString.length(); i++) {
			// Check for null/base case
			if(mainString.charAt(i)==regexString.charAt(0))
			{
				if(mainString.substring(i,i+regexString.length()).contentEquals(regexString))
					count++;
				if(count>1)
					return false;
			}
		}
		return true;
	}
	
	
}
