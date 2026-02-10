package eBayPrep;

/**
 * Implementation of Roman To Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RomanToInteger {

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
	 * Performs romanToInt operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int romanToInt(String s) {
		String dict[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int val[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
		int stringIndex=0;
		int dictIndex=0;
		int value=0;
		while(dictIndex<dict.length)
		{
			String subString="";
			int incrementValue=0;
			if(stringIndex<s.length())
			{
				subString=s.substring(stringIndex,stringIndex+1);
				incrementValue=1;
				if(subString.contentEquals(dict[dictIndex]))
				{
					stringIndex+=incrementValue;
					value+=val[dictIndex];
					continue;
				}
			}
			else
				break;
			
			if(stringIndex+1<s.length())
			{
					subString=s.substring(stringIndex, stringIndex+2);
					incrementValue=2;
					if(subString.contentEquals(dict[dictIndex]))
					{
						stringIndex+=incrementValue;
						value+=val[dictIndex];
						continue;
					}
					else{
						dictIndex++;
					}
			}
			else
				dictIndex++;
		}
		return value;
	}
}
