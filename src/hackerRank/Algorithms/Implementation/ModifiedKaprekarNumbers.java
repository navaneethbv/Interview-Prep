package hackerRank.Algorithms.Implementation;

import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/kaprekar-numbers
 */
/**
 * Implementation of Modified Kaprekar Numbers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ModifiedKaprekarNumbers {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		int p=Integer.parseInt(scanner.nextLine());
		int q=Integer.parseInt(scanner.nextLine());
		int count=0;
		for (int i = p; i <=q; i++) {
			Long square=(long)i*(long)i;
			String squaredString=square.toString();
			int length=squaredString.length()/2;
			long leftpart=0,rightpart=0;
			if((length*2)%2==0)
			{
				leftpart=Long.parseLong("0"+squaredString.substring(0,length));
				rightpart=Long.parseLong("0"+squaredString.substring(length));
			}
			else{
				leftpart=Long.parseLong("0"+squaredString.substring(0,length-1));
				rightpart=Long.parseLong("0"+squaredString.substring(length-1));
			}
			if(leftpart+rightpart==i){
				System.out.print(i+" ");
				count++;
			}
		}
		if(count==0)
			System.out.println("INVALID RANGE");
	}
}
