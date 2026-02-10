package TopCoder;

/*
 * SRM 525 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=11635
 */

/**
 * Implementation of SRM525 Rainy Road algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM525RainyRoad {
	
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(isReachable2(new String[]{".W.."
			,"...."}));
		System.out.println(isReachable2(new String[]{".W.."
				,"..W."}));
		System.out.println(isReachable2(new String[]{".W..W.."
				,"...WWW."}));
		System.out.println(isReachable2(new String[]    	
				{"..",
				"WW"}));
		System.out.println(isReachable2(new String[]    	
				{".WWWW."
				,"WWWWWW"}));
		
		System.out.println(isReachable2(new String[]    	
				{".W.W.W." 
				,"W.W.W.W"}));
		
		System.out.println(isReachable2(new String[]    	
				{".............................................W."
				,".............................................W."}));
		
	}
	/**
	 * Checks if reachable.
	 *
	 * @param road the array to process
	 * @return the resulting string
	 */
	public static String isReachable(String[] road){
		int index=0;
		// Iterate through all elements
		for (int i = 0; i < road[0].length(); i++) {
			// Check for null/base case
			if(road[0].charAt(i)=='W' && road[1].charAt(i)=='W')
				return "NO";

			// Check for null/base case
			if(road[0].charAt(i)=='.' && road[1].charAt(i)=='.')
			{
				index=2;
			}
			else if(index==2){
				// Check for null/base case
				if(road[0].charAt(i)=='.' || road[1].charAt(i)=='.')
				{
					index=road[0].charAt(i)=='.'?0:1;
				}
			}
			else{
				// Check for null/base case
				if(index==0 && road[0].charAt(i)=='W')
					return "NO";
				else if(index==1 && road[1].charAt(i)=='W')
					return "NO";
			}
		}

		return index==0||index==2?"YES":"NO";
	}
	/**
	 * Checks if reachable2.
	 *
	 * @param road the array to process
	 * @return the resulting string
	 */
	public static String isReachable2(String[] road){
		// Iterate through all elements
		for (int i = 0; i < road[0].length(); i++) {
			// Check for null/base case
			if(road[0].charAt(i)=='W' && road[1].charAt(i)=='W'){
				return "NO";
			}
		}
		return road[0].charAt(road[0].length()-1)=='.'?"YES":"NO";
	}
}
