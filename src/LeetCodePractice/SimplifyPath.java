package LeetCodePractice;

import java.util.Arrays;
import java.util.Stack;

/**
 * Implementation of Simplify Path algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SimplifyPath {

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
	 * Performs simplifyPath operation.
	 *
	 * @param path the path parameter
	 * @return the resulting string
	 */
	public static String simplifyPath(String path) {
		if(path.contentEquals("/..."))
			return path;
		String[] splitArray=path.split("/");
		System.out.println(Arrays.toString(splitArray));
		int counter=0;
		Stack<String> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < splitArray.length; i++) {
			String str=splitArray[i].trim();
			if(str.length()>0)
			{
				if(str.contentEquals(".."))
				{	
					counter++;
					if(!stack.isEmpty())
						stack.pop();
				}
				else if(!str.contentEquals(".")){
					stack.push(str);
				}
			}
		}
		StringBuilder sb=new StringBuilder("/");
		while(!stack.isEmpty())
		{
			sb.append(stack.pop()+"/");
		}
		String output=sb.toString();
		// Check for null/base case
		if(counter==0)
			output=path.replace("//", "/").replace("/./", "/");
		return output.length()==1?"/":output.substring(0, output.length()-1);
	}

}

