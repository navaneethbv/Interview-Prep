package geeksforgeeks;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-34/
 * Given an array and two numbers x and y, find minimum distance
 * between two numbers x and y. assume that x and y always exist in
 * array and it may be that x and y are same also
 */;
/**
 * Implementation of Amazon Interview_34_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_34_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	/**
	 * Finds difference in the data structure.
	 *
	 * @param inputArray the array to process
	 * @param x the x parameter
	 * @param y the y parameter
	 * @return the computed integer result
	 */
	private static int findDifference(int[] inputArray, int x, int y) {
		if(x==y)
			return 0;
		else
		{
			int prevX=-1;
			int prevY=-1;
			int prev=-1;
			int diff=Integer.MAX_VALUE;
			// Iterate through all elements
			for (int i = 0; i < inputArray.length; i++) {
				if(inputArray[i]==x && (prev==x||prev==-1)){
					prevX=i;
					prev=x;
				}
				else if(inputArray[i]==y && (prev==y||prev==-1)){
					prevY=i;
					prev=y;
				}
				else if((inputArray[i]==y && prev==x)||(inputArray[i]==x && prev==y)){
					prev=inputArray[i];
					if(inputArray[i]==x)
						prevX=i;
					else
						prevY=i;
					if(Math.abs(prevX-prevY)<diff)
					{
						diff=Math.abs(prevX-prevY);
					}
				}
			}
			return diff;
		}
	}
 }