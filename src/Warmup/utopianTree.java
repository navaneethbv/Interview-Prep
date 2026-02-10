package Warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implementation of utopian Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class utopianTree {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			Integer noOfTestCases=Integer.parseInt(br.readLine());

			for (int i = 0; i < noOfTestCases; i++) {
				int initHeight=1;
				int height=initHeight;
				Integer val=Integer.parseInt(br.readLine());
				for (int j = 1; j <= val; j++) {
					if(j%2!=0){
						height=height*2;
					}
					else if(j%2==0){
						height=height+1;
					}	
				}
				System.out.println(height);
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
