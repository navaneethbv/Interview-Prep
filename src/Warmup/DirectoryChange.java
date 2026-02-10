package Warmup;

import java.util.Arrays;
import java.util.Stack;

/*
 * Link:https://www.careercup.com/question?id=5130528848084992
 */
/**
 * Implementation of Directory Change algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DirectoryChange {


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

	/**
	 * Finds directory in the data structure.
	 *
	 * @param source the source parameter
	 * @param command the command parameter
	 * @return the resulting string
	 */
	public static String findDirectory(String source,String command){
		String sourceArray[]=source.split("/");
		Stack<String> directoryStructure=new Stack<>();
		// Iterate through all elements
		for (int i = 0; i < sourceArray.length; i++) {
			directoryStructure.push(sourceArray[i]);
		}
		String splitArray[]=command.split("/");
		// Iterate through all elements
		for (int i = 0; i < splitArray.length; i++) {
			if(splitArray[i].contentEquals("..")){
				if(!directoryStructure.isEmpty())
					directoryStructure.pop();
			}else{
				directoryStructure.push(splitArray[i]);
			}
		}
		String sb=new String();
		while(!directoryStructure.isEmpty())
		{

			sb=(directoryStructure.pop()+"/")+sb;
		}
		System.out.println(sb.toString());
		return sb.toString();
	}



	/*
	/**
	 * Retrieves directory from the data structure.
	 *
	 * @param src the src parameter
	 * @param destination the destination parameter
	 */
	public static void getDirectory(String src, String destination){

		Stack<String> directoryStack = new Stack<String>();

		String[] listDestination = destination.split("/");
		String[] listHost = src.split("/");

		if(!destination.startsWith("/")){
			for(String str : listHost){
				if(!(str.matches(".."))){
					directoryStack.push(str);
				}
				else if((str.matches(".."))){
					directoryStack.pop();
				}
			}
		}

		for(String str : listDestination){
			if(!(str.matches(".."))){
				directoryStack.push(str);
			}
			else if((str.matches(".."))){
				directoryStack.pop();
			}
		}

		System.out.println(directoryStack);
	}*/
	}
}






