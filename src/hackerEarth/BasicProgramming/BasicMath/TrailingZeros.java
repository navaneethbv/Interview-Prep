package hackerEarth.BasicProgramming.BasicMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Link:https://www.hackerearth.com/problem/algorithm/trailing-zeros/
/**
 * Implementation of Trailing Zeros algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
*/public class TrailingZeros {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[] ) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int count=0;
		int value=5;
		while(N/value>=1)
		{
			count+=Math.floor(N/value);
			value*=5;
		}
		System.out.println(count);
	}
}
