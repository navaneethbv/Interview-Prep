package appleInterview;

/**
 * Implementation of Prep Doc Little Endian To Big Endian algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocLittleEndianToBigEndian {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs bitConverter operation.
	 *
	 * @param str the str parameter
	 * @return the resulting string
	 */
	private static String bitConverter(String str) {
		long value=Long.parseLong(str);
		long b1 = (value >>  0) & 0xff;
		long b2 = (value >>  8) & 0xff;
		long b3 = (value >> 16) & 0xff;
		long b4 = (value >> 24) & 0xff;
		return ( b1 << 24 | b2 << 16 | b3 << 8 | b4 << 0)+"";
	}

	/**
	 * Performs converter operation.
	 *
	 * @param str the str parameter
	 * @return the resulting string
	 */
	private static String converter(String str) {
		StringBuilder sb=new StringBuilder(str);
		str=sb.reverse().toString();
		sb=new StringBuilder();
		// Iterate through all elements
		for (int i = 0; i < str.length(); i+=2) {
			StringBuilder temp=new StringBuilder(str.substring(i,i+2));
			sb.append(temp.reverse().toString());
		}
		return sb.toString();
	}
}
