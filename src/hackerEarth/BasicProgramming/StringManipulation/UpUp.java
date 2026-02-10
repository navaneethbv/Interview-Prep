package hackerEarth.BasicProgramming.StringManipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Link:https://www.hackerearth.com/problem/algorithm/upup/
 */
/**
 * Implementation of Up Up algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class UpUp {
    /**
     * Main method to test the functionality of the class with various test cases.
     *
     * @param args[] the args[] parameter
     */
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lineArr[] = br.readLine().split(" ");
        for(int i=0;i<lineArr.length;i++){
        	if(lineArr[i].length()>0 && (lineArr[i].charAt(0)+"").matches("[a-z]"))
        	{
        		System.out.print((lineArr[i].charAt(0)+"").toUpperCase()+""+lineArr[i].substring(1)+" ");
        	}
        	else
        		System.out.print(lineArr[i]+" ");
        }
    }
}
