package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/ugly-numbers/
 */
/**
 * Implementation of Ugly Numbers DP algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UglyNumbersDP {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds ugly number dp in the data structure.
	 *
	 * @param N the size or count parameter
	 * @return the computed integer result
	 */
	private static int findUglyNumberDP(int N) {
		int[] ugly=new int[N];
		ugly[0]=1;
		int i2=0,i3=0,i5=0;
		int nextm2=ugly[i2]*2;
		int nextm3=ugly[i3]*3;
		int nextm5=ugly[i5]*5;
		int nextUglyNo=0;
		for (int i = 1; i < N; i++) {
			nextUglyNo=Math.min(nextm2, Math.min(nextm3, nextm5));
			ugly[i]=nextUglyNo;	
			if(nextUglyNo==nextm2)
			{
				i2++;
				nextm2=ugly[i2]*2;
			}
			if(nextUglyNo==nextm3)
			{
				i3++;
				nextm3=ugly[i3]*3;
			}
			if(nextUglyNo==nextm5)
			{
				i5++;
				nextm5=ugly[i5]*5;
			}
			
		}
		return nextUglyNo;
	}

	/**
	 * Finds ugly number naive in the data structure.
	 *
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int findUglyNumberNaive(int i) {
		int count=1;
		int number=1;
		if(i==1)
			return 1;
		else
		{
			while(count<i)
			{
				number++;
				if(findUgly(number))
					count++;
				
			}
		}
		return number;
	}

	/**
	 * Finds ugly in the data structure.
	 *
	 * @param number the number parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findUgly(int number) {
		number=maxDivide(number,2);
		number=maxDivide(number,3);
		number=maxDivide(number,5);
		return number==1;
	}

	/**
	 * Performs maxDivide operation.
	 *
	 * @param number the number parameter
	 * @param i the i parameter
	 * @return the computed integer result
	 */
	private static int maxDivide(int number, int i) {
		while(number%i==0)
			number=number/i;
		return number;
	}



}
