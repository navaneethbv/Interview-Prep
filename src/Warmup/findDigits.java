package Warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Problem Statement Link:https://www.hackerrank.com/challenges/find-digits
 */

/**
 * Implementation of find Digits algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class findDigits {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		int noOfTests=Integer.parseInt(bufferedReader.readLine());
		String num[]=new String[noOfTests];
		//String count[]=new String[noOfTests];
		for (int i = 0; i < num.length; i++) {   
			//test comment
			int count1=0;
			num[i]=bufferedReader.readLine();
			for (int j = 0; j < num[i].length(); j++) {
				if(num[i].charAt(j)!='0'){
					if((Integer.parseInt(num[i])%Integer.parseInt(Character.toString(num[i].charAt(j))))==0){
						count1++;
					}
				}
			}
			System.out.println(count1);
		}
	}
}
