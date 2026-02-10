package LeetCodePerformancePractice;

/**
 * Implementation of Count Numbers Unique Digits algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountNumbersUniqueDigits {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Counts the number of numbers with unique digits.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	public static int countNumbersWithUniqueDigits(int n) {
		int[] arr=new int[n+1];
		arr[0]=1;
		for(int i=1;i<=n;i++)
		{
			arr[i]=9;
			for(int j=9;j>=11-i;j--){
				arr[i]*=j;
			}
		}
		int result=0;
		for(int i=0;i<arr.length;i++)
			result+=arr[i];
		return result;
	}
}
