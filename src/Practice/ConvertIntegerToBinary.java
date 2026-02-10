package Practice;

/**
 * Implementation of Convert Integer To Binary algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ConvertIntegerToBinary {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs integerToBinary operation.
	 *
	 * @param num the num parameter
	 */
	private static void integerToBinary(int num) {
		int binary[] = new int[40];
	     int index = 0;
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	         System.out.print(binary[i]);
	       }
	}
}
