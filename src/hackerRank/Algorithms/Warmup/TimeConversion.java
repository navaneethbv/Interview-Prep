package hackerRank.Algorithms.Warmup;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/time-conversion
 */
/**
 * Implementation of Time Conversion algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TimeConversion {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(new InputStreamReader(System.in));
		String inputTime=scanner.nextLine();
		String timeArray[]=inputTime.split(":");
		String timeZone=inputTime.charAt(inputTime.length()-2)+"";
		String militaryTime="";
		if(timeZone.equals("P"))
		{	
			if(Integer.parseInt(timeArray[0])<12)
				militaryTime=Integer.parseInt(timeArray[0])+12+":"+timeArray[1]+":"+timeArray[2];
			else
				militaryTime="12:"+timeArray[1]+":"+timeArray[2];
		}
		else{
			if(Integer.parseInt(timeArray[0])<12)
				militaryTime=inputTime;
			else
				militaryTime="00:"+timeArray[1]+":"+timeArray[2];
		}
		militaryTime=militaryTime.replace("P","").replace("M","").replace("A","");
		System.out.println(militaryTime);
	}
}
