package hackerEarth.BasicProgramming.BasicMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * Link:https://www.hackerearth.com/problem/algorithm/hungry-lemurs/
 */
/**
 * Implementation of Hungry Lemurs algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class HungryLemurs {
    /**
     * Main method to test the functionality of the class with various test cases.
     *
     * @param args[] the args[] parameter
     */
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int noOfLemurs=Integer.parseInt(line[0]);
        int noOfBananas=Integer.parseInt(line[1]);
		if(noOfLemurs>noOfBananas)
		{
			int time=noOfLemurs/noOfBananas;
			int diff=noOfLemurs%noOfBananas;
			if(noOfLemurs-diff>diff)
				time+=noOfLemurs-diff;
			System.out.println(time);
		}
 
    }
}
