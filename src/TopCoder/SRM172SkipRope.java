package TopCoder;

import java.util.Arrays;

/*
 * SRM 172 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1968&rd=4665
 */



/**
 * Implementation of SRM172 Skip Rope algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM172SkipRope {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(partners(new int[]{102, 99, 104},100)));
		System.out.println(Arrays.toString(partners(new int[]{102, 97, 104},100)));
		System.out.println(Arrays.toString(partners(new int[]{101, 100, 99},100)));
		System.out.println(Arrays.toString(partners(new int[]{75, 117, 170, 175, 168, 167, 167, 142, 170, 85, 89, 170},169 )));
		System.out.println(Arrays.toString(partners(new int[]{134, 79, 164, 86, 131, 78, 99, 150, 105, 163, 150, 110, 90, 137, 127, 130, 121, 
				93, 97, 131, 170, 137, 171, 153, 137, 138, 92, 103, 149, 110, 156},82)));
	}
	/**
	 * Performs partners operation.
	 *
	 * @param candidates the array to process
	 * @param height the height parameter
	 * @return the resulting array
	 */
	public static int[] partners(int[] candidates, int height){
		int diff=Integer.MAX_VALUE;
		int firstIndex=-1,secondIndex=-1;
		Arrays.sort(candidates);
		// Iterate through all elements
		for (int i = 0; i < candidates.length; i++) {
			int newDiff=candidates[i]-height;
			newDiff=Math.abs(newDiff);
			if(newDiff<=diff)
			{
				diff=newDiff;
				firstIndex=i;
			}
		}
		diff=Integer.MAX_VALUE;
		// Iterate through all elements
		for (int i = 0; i < candidates.length; i++) {
			if(i!=firstIndex){
				int newDiff=candidates[i]-height;
				newDiff=Math.abs(newDiff);
				if(newDiff<=diff)
				{
					diff=newDiff;
					secondIndex=i;
				}
			}
		}
		int[] outputArr=new int[2];
		outputArr[0]=candidates[firstIndex];
		outputArr[1]=candidates[secondIndex];
		Arrays.sort(outputArr);
		return outputArr;
	}
}
