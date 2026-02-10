package LeetCodePerformancePractice;

/**
 * Implementation of Add Binary algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AddBinary {
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
	 * Adds binary to the data structure.
	 *
	 * @param a the a parameter
	 * @param b the b parameter
	 * @return the resulting string
	 */
	public static String addBinary(String a, String b) {
		int carry=0;
		int length=Math.min(a.length(), b.length());
		StringBuilder sb=new StringBuilder();
		// Iterate through all elements
		for (int i = 0;i<length;i++) {
			int aVal=Integer.parseInt(a.charAt(a.length()-1-i)+"");
			int bVal=Integer.parseInt(b.charAt(b.length()-1-i)+"");
			int sum=aVal+bVal+carry;
			if(sum<=1){
				carry=0;
			}
			else if(sum==2)
			{
				sum=0;
				carry=1;
			}
			else{
				sum=1;
				carry=1;
			}
			sb.append(sum);
		}
		if(a.length()!=b.length() && a.length()>length)
		{
			for (int i = length;i<a.length();i++) {
				int aVal=Integer.parseInt(a.charAt(a.length()-1-i)+"");
				int sum=aVal+carry;
				if(sum<=1){
					carry=0;
				}
				else if(sum==2)
				{
					sum=0;
					carry=1;
				}
				else{
					sum=1;
					carry=1;
				}
				sb.append(sum);
			}
		}else if(a.length()!=b.length() && b.length()>length)
		{
			for (int i = length;i<b.length();i++) {
				int bVal=Integer.parseInt(b.charAt(b.length()-1-i)+"");
				int sum=bVal+carry;
				if(sum<=1){
					carry=0;
				}
				else if(sum==2)
				{
					sum=0;
					carry=1;
				}
				else{
					sum=1;
					carry=1;
				}
				sb.append(sum);
			}
		}
		if(carry==1)
			sb.append("1");
		return sb.reverse().toString();
	}

}

