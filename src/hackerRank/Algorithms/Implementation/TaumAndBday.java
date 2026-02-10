package hackerRank.Algorithms.Implementation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/taum-and-bday
 */
/**
 * Implementation of Taum And Bday algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TaumAndBday {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int noOfTestCases=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOfTestCases; i++) {
			String lineArray[]=scanner.nextLine().split(" ");
			long B=Long.parseLong(lineArray[0]);
			long W=Long.parseLong(lineArray[1]);
			lineArray=scanner.nextLine().split(" ");
			long X=Long.parseLong(lineArray[0]);
			long Y=Long.parseLong(lineArray[1]);
			long Z=Long.parseLong(lineArray[2]);
			if(X>(Y+Z))
			{
				System.out.println(W*Y+B*(Y+Z));
			}else if(Y>(X+Z))
			{
				System.out.println(B*X+W*(X+Z));			
			}
			else{
				System.out.println(W*Y+B*(X));
			}
		}
	}
}
