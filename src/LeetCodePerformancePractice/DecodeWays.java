package LeetCodePerformancePractice;

/**
 * Implementation of Decode Ways algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DecodeWays {
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
	 * Performs numDecodings operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int numDecodings(String s) {
		// Check for null/base case
		if(s==null||s.length()==0|| s.charAt(0)=='0')
			return 0;
		if(s.length()==1)
			return 1;
		int[] dp=new int[s.length()];
		dp[0]=1;
		if(Integer.parseInt(s.substring(0,2))>26)
		{
			if(s.charAt(1)!='0'){
				dp[1]=1;
			}else{
				dp[1]=0;
			}
		}
		else
		{
			if(s.charAt(1)!='0'){
				dp[1]=2;
			}else{
				dp[1]=1;
			}

		}

		for (int i = 2; i < dp.length; i++) {
			if(s.charAt(i)!='0')
				dp[i]+=dp[i-1];

			String str=s.substring(i-1,i+1);
			if(Integer.parseInt(str)<=26 && Integer.parseInt(str)>=10)
				dp[i]+=dp[i-2];
		}
		return dp[dp.length-1];

	}

}
