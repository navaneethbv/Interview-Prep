package Warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * Implementation of intro To Tutorial Challenges algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class introToTutorialChallenges {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
		int V=Integer.parseInt(scanner.readLine());
		int n=Integer.parseInt(scanner.readLine());
		String numbersList=scanner.readLine();
		String numbersArray[]=numbersList.split(" ");
		for (int i = 0; i < numbersArray.length; i++) {
			if(Integer.parseInt(numbersArray[i])==V){
				System.out.println(i);
				break;
			}
		}
	}
}
