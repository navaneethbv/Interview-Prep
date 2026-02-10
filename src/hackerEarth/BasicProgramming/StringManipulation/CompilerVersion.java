package hackerEarth.BasicProgramming.StringManipulation;

import java.util.Scanner;
/*
 * Link:https://www.hackerearth.com/problem/algorithm/compiler-version-2/
 */
/**
 * Implementation of Compiler Version algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CompilerVersion {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[] ) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext()){
			String input=scanner.nextLine();
			if(input.indexOf("//")==-1)
				System.out.println(input.replaceAll("->","."));
			else{
				String str=input.substring(0, input.indexOf("//")).replaceAll("->",".")+input.substring(input.indexOf("//"));
				System.out.println(str);
			}
		}	
	}
}
