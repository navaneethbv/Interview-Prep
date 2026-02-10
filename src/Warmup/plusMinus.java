package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Implementation of plus Minus algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class plusMinus {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(scanner.readLine());
		String  line=scanner.readLine();
		String lineArray[]=line.split(" ");
		int posCount=0,negCount=0,zeroCount=0;
		for(int i=0;i<lineArray.length;i++){
			if(Integer.parseInt(lineArray[i])>0)
				posCount++;
			else if(Integer.parseInt(lineArray[i])<0)
				negCount++;
			else
				zeroCount++;
		}

		System.out.printf("%.3f",((double)posCount/N));
		System.out.println();
		System.out.printf("%.3f",((double)negCount/N));
		System.out.println();
		System.out.printf("%.3f",((double)zeroCount/N));
		
	}
}
