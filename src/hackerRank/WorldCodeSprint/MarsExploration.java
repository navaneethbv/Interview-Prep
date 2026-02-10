package hackerRank.WorldCodeSprint;


import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/contests/worldcodesprint/challenges/save-our-ship
 */
/**
 * Implementation of Mars Exploration algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MarsExploration {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		String inputString=(scanner.nextLine());
		int alteredCount=0;
		for (int i = 0; i < inputString.length()/3; i++) {
			if(inputString.charAt(i*3)!='S')
				alteredCount++;
			if(inputString.charAt(i*3+1)!='O')
				alteredCount++;
			if(inputString.charAt(i*3+2)!='S')
				alteredCount++;
		}
		System.out.println(alteredCount);
	}
}
