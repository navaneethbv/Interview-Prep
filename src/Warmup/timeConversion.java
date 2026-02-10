package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Implementation of time Conversion algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class timeConversion {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		String timeInput=scanner.readLine();
		String timeZone=(timeInput.substring(timeInput.length()-2,timeInput.length()));
		if(timeZone.equals("AM")){
			int hours=Integer.parseInt(timeInput.substring(0, 2));
			if(hours==12){
				System.out.println("00"+timeInput.substring(2,timeInput.length()-2));
			}
			else{
			System.out.println(timeInput.substring(0,timeInput.length()-2));
			}
		}
		else
		{
			int hours=Integer.parseInt(timeInput.substring(0, 2));
			if(hours!=12)
			hours+=12;
			System.out.println(hours+timeInput.substring(2,timeInput.length()-2));
		}
	}
}
