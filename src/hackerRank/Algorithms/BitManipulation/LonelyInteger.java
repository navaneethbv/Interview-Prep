package hackerRank.Algorithms.BitManipulation;

import java.util.Hashtable;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/lonely-integer
 */
/**
 * Implementation of Lonely Integer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LonelyInteger {
	/**
	 * Performs lonelyinteger operation.
	 *
	 * @param a the array to process
	 * @return the computed integer result
	 */
	static int lonelyinteger(int[] a) {
		return 0;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		String str=in.nextLine();
		Integer N=Integer.parseInt(str);
		str=in.nextLine();
		//System.out.println(str);
		//System.exit(1);
		String[] numbers=str.split(" ");
		Hashtable<Integer,Integer> ht=new Hashtable<Integer, Integer>();
		int number=0;
		for (int i = 0; i < numbers.length; i++) {
			int num=Integer.parseInt(numbers[i]);
			Integer x=ht.put(num,1);
			//System.out.println(num+" is added");
			if(x!=null){
				ht.remove(num);
				//System.out.println(num+" is removed");
			}
		}
		res=ht.entrySet().iterator().next().getKey();
		System.out.println(res);




	}
}
