package LeetCodePractice;

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
		char [][]charMatrix=new char[numRows][s.length()];
		if(numRows<=1||s.length()<2)
			return s;
		int row=0,col=0;
		boolean goingDown=true;
		// Iterate through all elements
		for (int i = 0; i < s.length(); i++) {
			if(goingDown)//moving down
			{	

				charMatrix[row][col]=s.charAt(i);
				if(row+1==numRows)
				{
					row=row-1;
					goingDown=!goingDown;
					col=col+1;
				}
				else{
					row=row+1;
				}
			}
			else{//moving diagonally up
				charMatrix[row][col]=s.charAt(i);
				if(row-1<0)
				{
					row=row+1;
					goingDown=!goingDown;
				}
				else{
					row=row-1;
					col=col+1;
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		// Iterate through all elements
		for (int i = 0; i < charMatrix.length; i++) {
			for (int j = 0; j < charMatrix[0].length; j++) {
				if((charMatrix[i][j]+"").trim().length()>0)
					sb.append(charMatrix[i][j]);
			}
		}
		return sb.toString();
	}
}
