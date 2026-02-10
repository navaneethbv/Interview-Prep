	package hackerRank.HourRank7;
	
	import java.util.Arrays;
import java.util.Scanner;
	
/**
 * Implementation of Nikita And The Game algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
	public class NikitaAndTheGame {
	
	
	
		/**
		 * Main method to test the functionality of the class with various test cases.
		 *
		 * @param args the array to process
		 */
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int T = in.nextInt();
			for (int i = 0; i < T; i++) {
				int noOfElements=in.nextInt();
				int[] inputArray=new int[noOfElements];
				for (int j = 0; j < noOfElements; j++) {
					inputArray[j]=in.nextInt();
				}
				System.out.println(findMaxDivideCount(inputArray));
			}
		}

		/**
		 * Finds max divide count in the data structure.
		 *
		 * @param inputArray the array to process
		 * @return the computed integer result
		 */
		private static int findMaxDivideCount(int[] inputArray) {
			// Check for null/base case
			if(inputArray.length==0||inputArray.length==1)
				return 0;
			int rightSum=0;
			// Iterate through all elements
			for (int i = 0; i < inputArray.length; i++) {
				rightSum+=inputArray[i];
			}
			if(rightSum%2!=0)
				return 0;
			int leftSum=0;
			int i=0;
			boolean equal=false;
			// Iterate through all elements
			for (i = 0; i < inputArray.length; i++) {
				leftSum+=inputArray[i];
				rightSum-=inputArray[i];
				if(leftSum==rightSum){
					equal=true;
					break;
				}
			}
			if(!equal)
				return 0;
			if(leftSum%2!=0)
				return 1;
			if(rightSum%2!=0)
				return 1;
			
			
			// Recursively process left and right subtrees
			return 1+Math.max(findMaxDivideCount(Arrays.copyOfRange(inputArray, 0, i+1)), findMaxDivideCount(Arrays.copyOfRange(inputArray, i+1, inputArray.length)));
		}
	
		
	
	
	
	}
