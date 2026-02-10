package career_cup;

import java.util.ArrayList;

/**
 * Implementation of Plus One algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PlusOne {
	
		 /**
		  * Performs plusOne operation.
		  *
		  * @param A the A parameter
		  * @return the list of results
		  */
		 public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		        // the one to be plus
		        int carry = 1;
		        ArrayList<Integer> result = new ArrayList<>(A);
		        int len = A.size();
		        for (int i = len - 1; i >= 0; i--) {
		            // Check for null/base case
		            if (carry == 0) {
		                // no need to check remaining digits
		                break;
		            }
		            int digit = A.get(i); System.out.println(digit);
		            // plus 
		            int num = digit + carry;
		            if (num >= 10) {
		                carry = num / 10;
		                digit = num % 10;
		            } else {
		                carry = 0;
		                digit = num;
		            } 
		            result.set(i, digit);
		            System.out.println("Set"+result);
		        }
		        // if 9 9 9
		        System.out.println(result);
		        if (carry != 0) {
		            result.add(0, 1);
		            System.out.println("Add"+result);
		        }
		        // removing leading zeros
		        int index = 0;
		        System.out.println("Size"+result.size());
		        System.out.println("Size"+result.get(0));
		        while (index < result.size() && result.get(index) == 0) {
		            result.remove(index);
		        }
		        
		        return result;
		 }
	
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)
	{
		ArrayList<Integer> array = new ArrayList<>();
		array.add(9);
		System.out.println(array);
		System.out.println(plusOne(array));
	}
}
