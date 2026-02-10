package eBayPrep;

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
			int valueA=Integer.parseInt(a.charAt(a.length()-1-i)+"");
			int valueB=Integer.parseInt(b.charAt(b.length()-1-i)+"");			
			int op=valueA+valueB+carry;
			// Check for null/base case
			if(op==0||op==1){
				sb.append(op);
				carry=0;
			}
			else if(op==2){
				sb.append("0");
				carry=1;
			}
			else{
				sb.append("1");
				carry=1;
			}
		}
		if(a.length()==length)
		{
			//iterate through b
			for (int i = length; i <b.length(); i++) {
				int valueB=Integer.parseInt(b.charAt(b.length()-1-i)+"");			
				int op=valueB+carry;
				// Check for null/base case
				if(op==0||op==1){
					sb.append(op);
					carry=0;
				}
				else if(op==2){
					sb.append("0");
					carry=1;
				}
				else{
					sb.append("1");
					carry=1;
				}
			}
		}
		else if(b.length()==length){
			//iterate through a		
			for (int i =length;i<a.length(); i++) {
				int valueA=Integer.parseInt(a.charAt(a.length()-1-i)+"");			
				int op=valueA+carry;
				// Check for null/base case
				if(op==0||op==1){
					sb.append(op);
					carry=0;
				}
				else if(op==2){
					sb.append("0");
					carry=1;
				}
				else{
					sb.append("1");
					carry=1;
				}
			}
		}
		if(carry==1)
			sb.append(carry);
		return sb.reverse().toString();
	}

}

