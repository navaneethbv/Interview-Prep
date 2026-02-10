package eBayPrep;

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
		System.out.println(simplifyPath("/home/"));//-/home
		System.out.println("*******");
		System.out.println(simplifyPath("/a/./b/../../c/"));//-/c
		System.out.println("*******");
		System.out.println(simplifyPath("/home//foo/"));//-/home/foo
		System.out.println("*******");
		System.out.println(simplifyPath("/../"));//-/
		System.out.println("*******");
	}

	/**
	 * Performs simplifyPath operation.
	 *
	 * @param path the path parameter
	 * @return the resulting string
	 */
	public static String simplifyPath(String path) {
		// Check for null/base case
		if(path==null||path.length()==0)
			return path;
		String strArray[]=path.split("/");
		System.out.println("*******");
		Stack<String> stack=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < strArray.length; i++) {
			String str=strArray[i].trim();
			if(!str.contentEquals("/") && !str.contentEquals("")&& !str.contentEquals("."))
			{
				if(str.contentEquals(".."))
				{
					if(!stack.isEmpty())
						stack.pop();
				}
				else{
					stack.push(str);
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		String str="/";
		while(!stack.isEmpty())
		{
			str="/"+stack.pop()+str;
		}
		return str.length()==1?"/":str.substring(0, str.length()-1);
	}

}

