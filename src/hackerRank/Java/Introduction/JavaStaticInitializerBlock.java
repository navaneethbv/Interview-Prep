package hackerRank.Java.Introduction;

import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/challenges/java-static-initializer-block
 */

/**
 * Implementation of Java Static Initializer Block algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaStaticInitializerBlock {

	static boolean flag=true;  
	static int B,H;
	static{
	    Scanner scanner=new Scanner(System.in);
	    B=Integer.parseInt(scanner.nextLine());
	    H=Integer.parseInt(scanner.nextLine());
	    if(B<=0 || H<=0)
	    {
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag=false;
	    }
	}
}
