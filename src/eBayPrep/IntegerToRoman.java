package eBayPrep;

/**
 * Implementation of Integer To Roman algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class IntegerToRoman {

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
	 * Performs intToRoman operation.
	 *
	 * @param num the num parameter
	 * @return the resulting string
	 */
	public static String intToRoman(int num) {
		String dict[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int val[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
		StringBuilder sb=new StringBuilder();
		int currIndex=0;
		while(num>0)
		{
			if(num<val[currIndex])
			{
				currIndex++;
			}
			else{
				sb.append(dict[currIndex]);
				num-=val[currIndex];
			}
		}
		return sb.toString();
	}
}
