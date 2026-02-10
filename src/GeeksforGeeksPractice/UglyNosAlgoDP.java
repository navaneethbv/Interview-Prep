package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link: http://www.geeksforgeeks.org/ugly-numbers/
 */
/**
 * Implementation of Ugly Nos Algo DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UglyNosAlgoDP {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds ugly number in the data structure.
	 *
	 * @param number the number parameter
	 * @return the computed integer result
	 */
	private static int findUglyNumber(int number)
	private static int findUglyNumber(int number)
	{
		int[] ugly=new int[number];
		ugly[0]=1;
		int i2=0,i3=0,i5=0;
		int next_multiple2=ugly[i2]*2,next_multiple3=ugly[i3]*3,next_multiple5=ugly[i5]*5;
		
		for (int i = 1; i < number; i++) {
			int nextUglyNumber=Math.min(next_multiple2, Math.min(next_multiple3, next_multiple5));
			ugly[i]=nextUglyNumber;
			if(nextUglyNumber==next_multiple2)
			{
				i2++;
				next_multiple2=ugly[i2]*2;
			}
			if(nextUglyNumber==next_multiple3)
			{
				i3++;
				next_multiple3=ugly[i3]*3;
			}
			if(nextUglyNumber==next_multiple5)
			{
				i5++;
				next_multiple5=ugly[i5]*5;
			}	
		}
		System.out.println(Arrays.toString(ugly));
		
		return ugly[number-1];
	}



}
