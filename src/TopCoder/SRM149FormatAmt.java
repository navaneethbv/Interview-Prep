package TopCoder;

/*
 * SRM 149 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1313&rd=4550
 */



/**
 * Implementation of SRM149 Format Amt algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM149FormatAmt {
	/**
	 * Performs amount operation.
	 *
	 * @param dollars the dollars parameter
	 * @param cents the cents parameter
	 * @return the resulting string
	 */
	public static String amount(int dollars, int cents){
		StringBuilder output=new StringBuilder("");
		String dollarsString=dollars+"";
		StringBuilder dollarString=new StringBuilder(dollars+"");
		dollarString.reverse();
		// Iterate through all elements
		for (int i = 0; i < dollarString.toString().length(); i++) {
			// Check for null/base case
			if(i%3==0){
				output.append(",");
			}
			output.append(dollarString.toString().charAt(i));
		}
		output.reverse();
		dollarString=new StringBuilder();		
		if(cents<10)
		{
			dollarString.append("0");
		}
		dollarString.append(cents+"");
		return ("$"+output.toString()+"."+dollarString.toString()).replace(",.", ".");
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(amount(123456,0));
		System.out.println(amount(49734321,9));
		System.out.println(amount(0,99));
		System.out.println(amount(249,30));
		System.out.println(amount(1000,1));
	}
}
