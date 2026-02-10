package hackerEarth.BasicProgramming.StringManipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Link:https://www.hackerearth.com/problem/algorithm/terrible-chandu/
*/
/**
 * Implementation of Terrible Chandu algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TerribleChandu {
	  /**
	   * Main method to test the functionality of the class with various test cases.
	   *
	   * @param args[] the args[] parameter
	   */
	  public static void main(String args[] ) throws Exception {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        for (int i = 0; i < N; i++) {
	            System.out.println(new StringBuilder(br.readLine()).reverse().toString());
	        }

	    }
}
