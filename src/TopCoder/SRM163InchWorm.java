package TopCoder;

/*
 * SRM 163 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1799&rd=4620
 */



/**
 * Implementation of SRM163 Inch Worm algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM163InchWorm {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)  {
		System.out.println(lunchtime(11,2,4));
		System.out.println(lunchtime(12,6,4));
		System.out.println(lunchtime(20,3,7));
		System.out.println(lunchtime(21,7,3));
		System.out.println(lunchtime(15,16,5));
		System.out.println(lunchtime(1000,3,7));
		System.out.println(lunchtime(1000,7,3));
	}
	/**
	 * Performs lunchtime operation.
	 *
	 * @param branch the branch parameter
	 * @param rest the rest parameter
	 * @param leaf the leaf parameter
	 * @return the computed integer result
	 */
	public static int lunchtime(int branch, int rest, int leaf){
		int count=0;
		int counter=0;
		while(counter<=branch){
			// Check for null/base case
			if(counter==0){
				count++;
				counter+=leaf;
				continue;
			}

			if(counter<rest)
			{
				counter+=leaf;
			}else if(counter>=rest){
				// Check for null/base case
				if(counter%rest==0)
					count++;
				counter+=leaf;
			}
		}
		return count;
	}
}
