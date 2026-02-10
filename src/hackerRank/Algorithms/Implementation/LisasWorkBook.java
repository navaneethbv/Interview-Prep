package hackerRank.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * Link:https://www.hackerrank.com/contests/hourrank-6/challenges/bear-and-workbook
/**
 * Implementation of Lisas Work Book algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
*/public class LisasWorkBook {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		int inputArray[]=new int[n];
		for (int i = 0; i < n; i++) {
			inputArray[i]=scanner.nextInt();
		}
		ArrayList<String[]> pages=new ArrayList<>();
		int totalCount=0;
		for (int i = 0; i < inputArray.length; i++) {
			int value=inputArray[i];
			int count=0;
			while(count<value)
			{
				String[] str=new String[k];
				for (int j = count; j <count+k; j++) {
					if(j+1<=value && j+1==pages.size()+1){
						totalCount++;
					}
				}
				count+=k;
				pages.add(str);
			}
		}
		System.out.println(totalCount);
	}
}
