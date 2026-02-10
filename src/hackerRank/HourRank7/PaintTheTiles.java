	package hackerRank.HourRank7;
	
	import java.util.Scanner;
	
/**
 * Implementation of Paint The Tiles algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
	public class PaintTheTiles {
	
	
	
		/**
		 * Main method to test the functionality of the class with various test cases.
		 *
		 * @param args the array to process
		 */
		public static void main(String[] args) {

		}
	
		/**
		 * Finds strokes in the data structure.
		 *
		 * @param str the str parameter
		 * @return the computed integer result
		 */
		private static int findStrokes(String str) {
			int count=0;
			char c=str.charAt(0);
			count=1;
			char c1 = 0;
			for (int i = 1; i < str.length(); i++) {
				c1=str.charAt(i);
				if(c1!=c)
				{
					c=c1;
					count++;
				}
			}
			return count;
		}
	
	
	
	}
