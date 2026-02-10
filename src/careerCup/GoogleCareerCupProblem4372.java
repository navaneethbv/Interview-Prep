package careerCup;

/*
 * Link: http://www.careercup.com/question?id=64372
 * Count number of bits 
 */
/**
 * Implementation of Google Career Cup Problem4372 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem4372 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}
	/**
	 * Performs bitCount operation.
	 *
	 * @param val the val parameter
	 * @return the computed integer result
	 */
	private static int bitCount(long val) { 
		val -= (val & 0xaaaaaaaaaaaaaaaaL) >>> 1; 
		val = (val & 0x3333333333333333L) + ((val >>> 2) & 0x3333333333333333L); 
		val = (val + (val >>> 4)) & 0x0f0f0f0f0f0f0f0fL; 
		val += val >>> 8; 
		val += val >>> 16; 
		return ((int)(val) + (int)(val >>> 32)) & 0xff; 
	}

}
