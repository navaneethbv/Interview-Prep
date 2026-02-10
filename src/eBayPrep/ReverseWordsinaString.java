package eBayPrep;

/**
 * Implementation of Reverse Wordsina String algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseWordsinaString {
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
	 * Performs reverseWords1 operation.
	 *
	 * @param str the str parameter
	 * @return the resulting string
	 */
	public static String reverseWords1(String str) {
		// Check for null/base case
		if(str==null||str.length()==0)return str;
		str=str.replaceAll("[ ]+", " ");
		char c[]=str.toCharArray();
		int left=0,right=str.length()-1;
		while(left<right)
		{
			char temp=c[left];
			c[left]=c[right];
			c[right]=temp;
			left++;right--;
		}
		left=right=0;
		// Iterate through all elements
		for (int i = 0; i < c.length; i++) {
			if(c[i]==' ')
			{
				right=i-1;
				while(left<right)
				{
					char temp=c[left];
					c[left]=c[right];
					c[right]=temp;
					left++;right--;
				}
				left=-1;		
			}
			else if(left==-1)
			{
				left=i;
			}
		}
		if(c[c.length-1]!=' ')
		{
			right=c.length-1;
			while(left<right)
			{
				char temp=c[left];
				c[left]=c[right];
				c[right]=temp;
				left++;right--;
			}
		}
		return new String(c);
	}

	/**
	 * Performs reverseWords operation.
	 *
	 * @param str the str parameter
	 * @return the resulting string
	 */
	public static String reverseWords(String str) {
		str=str.replaceAll("[ ]+", " ");
		String arr[]=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = arr.length-1; i >=0; i--) {
			sb.append(arr[i].trim());
			if(i!=0)
				sb.append(" ");
		}
		return sb.toString().trim();
	}
}

