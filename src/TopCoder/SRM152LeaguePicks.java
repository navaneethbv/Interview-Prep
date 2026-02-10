package TopCoder;

import java.util.Arrays;

/*
 * SRM 152 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1716&rd=4565
 */



/**
 * Implementation of SRM152 League Picks algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM152LeaguePicks {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}
	/**
	 * Performs returnPicks operation.
	 *
	 * @param position the position parameter
	 * @param friends the friends parameter
	 * @param picks the picks parameter
	 * @return the resulting array
	 */
	static int[] returnPicks(int position, int friends, int picks){
		int noOfFriends=friends;
		StringBuilder sb=new StringBuilder();
		boolean increasing=true;
		int friendsCount=1;
		for (int i = 1; i <=picks; i++) {
			if(friendsCount==position)
				sb.append(i+"/");

			if(increasing){
				friendsCount++;
				if(friendsCount>friends)
				{
					friendsCount=friends;
					increasing=false;
				}
			}else{
				friendsCount--;
				if(friendsCount<=0)
				{
					friendsCount=1;
					increasing=true;
				}
			}

		}
		String outputArray[]=(sb.toString().split("/"));
		int outputArr[]=new int[outputArray.length];

		// Iterate through all elements
		for (int i = 0; i < outputArray.length; i++) {
			outputArr[i]=Integer.parseInt(outputArray[i]);
		}
		return outputArr;
	}
}
