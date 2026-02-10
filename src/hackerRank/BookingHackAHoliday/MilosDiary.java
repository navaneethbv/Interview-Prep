package hackerRank.BookingHackAHoliday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * Link:https://www.hackerrank.com/contests/booking-hack-a-holiday/challenges/milos-diary
*/
/**
 * Implementation of Milos Diary algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MilosDiary{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int M=scanner.nextInt();
		int inputArray[]=new int[M];
		for (int i = 0; i < M; i++) {
			inputArray[i]=scanner.nextInt();
		}
		Set<Integer> writtenSet=new HashSet<Integer>();
		ArrayList<Integer> elementList=new ArrayList<>();
		int max=inputArray[0];
		boolean exit=false;
		for (int i = 0; i < inputArray.length; i++) {
			int element=inputArray[i];
			if(writtenSet.isEmpty()){
				writtenSet.add(element);
				elementList.add(element);
			}
			else if(!writtenSet.contains(element)){
				if(element>max)
				{
					max=element;
					writtenSet.add(element);
					elementList.add(element);
				}
				else{
					if(element>elementList.get(elementList.size()-1)-1)
					{
						System.out.println("NO");
						exit=true;
						break;
					}
					else{
						writtenSet.add(element);
						elementList.add(element);
					}
				}
			}
			else{
				System.out.println("NO");
				exit=true;
				break;
			}
		}
		if(!exit)
			System.out.println("YES");
	}
}