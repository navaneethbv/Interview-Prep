package LeetCodePerformancePractice;

/**
 * Implementation of Count And Say algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountAndSay {
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
	 * Counts the number of and say.
	 *
	 * @param n the size or count parameter
	 * @return the resulting string
	 */
	public static String countAndSay(int n) {
		if(n<1)
			return "";
		String str="1";
		for (int i = 1; i < n; i++) {
			int count=1;
			char c=str.charAt(0);
			StringBuilder sb=new StringBuilder();
			for (int j = 1; j < str.length(); j++) {
				char ch=str.charAt(j);
				if(ch==c)
					count++;
				else
				{
					sb.append(count+""+c);
					c=ch;
					count=1;
				}
			}
			sb.append(count+""+c);
			str=sb.toString();
		}
		return str;
	}
}

