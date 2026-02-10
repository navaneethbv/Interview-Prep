package yelpInterview;

/**
 * Implementation of Zig Zag Conversion algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ZigZagConversion {


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
	 * Performs convert operation.
	 *
	 * @param s the s parameter
	 * @param numRows the numRows parameter
	 * @return the resulting string
	 */
	public static String convert(String s, int numRows) {
		char[][] charMatrix=new char[numRows][s.length()];
		boolean down=true;
		int rowIndex=0,colIndex=0;
		if(numRows<=1)
			return s;
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			if(down)//down straight
			{	
				if(rowIndex<0)
					rowIndex=0;
				charMatrix[rowIndex][colIndex]=s.charAt(i);
				rowIndex++;
				if(rowIndex==numRows){
					rowIndex=charMatrix.length-2;
					colIndex++;
					down=!down;
				}
			}
			else{//up diagonal
				if(rowIndex<0)
					rowIndex=0;
				charMatrix[rowIndex][colIndex]=s.charAt(i);
				rowIndex--;
				if(rowIndex<0)
				{
					rowIndex+=2;
					down=!down;
				}
				colIndex++;
				// Check for null/base case
				if(rowIndex==0){
					down=!down;
				}
			}
		}
		StringBuffer sb=new StringBuffer();
		// Iterate through all elements
		for (int i = 0; i < charMatrix.length; i++) {
			for (int j = 0; j < charMatrix[0].length; j++) {
				if(charMatrix[i][j]!=' ')
					sb.append(String.valueOf(charMatrix[i][j]).trim());
			}
		}
		return sb.toString();
	}



}

