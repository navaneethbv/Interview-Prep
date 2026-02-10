package Warmup;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/*
 */	
/**
 * Implementation of google Coaching algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class googleCoaching {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

	/**
	 * Finds cycle in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return true if condition is met, false otherwise
	 */
	public static boolean findCycle(int[] inputArray){
		HashMap<Integer,Integer> elementMap=new HashMap<Integer,Integer>();
		int N=inputArray.length;

		int currIndex=0,count=0;
				while(true){
					if(elementMap.containsKey(currIndex))
					{
						// Check for null/base case
						if(currIndex==0 && count==N)
							return true;
						else
							return false;
					}
					elementMap.put(currIndex,1);
					count+=1;
					currIndex=(currIndex+inputArray[currIndex])%N;
				}	
	}
	/**
	 * Finds cycle2 in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return true if condition is met, false otherwise
	 */
	public static boolean findCycle2(int[] inputArray){
		int N=inputArray.length;
		boolean visited[]=new boolean[N];
		int currIndex=0,count=0;
		visited[0]=true;
		while(true){
			if(visited[currIndex]==true)
			{
				// Check for null/base case
				if(currIndex==0 && count==N)
					return true;
				else if(currIndex!=0)
					return false;
			}
			visited[currIndex]=true;
			count+=1;
			currIndex=(currIndex+inputArray[currIndex])%N;
		}	
	}

	/**
	 * Finds cycle3 in the data structure.
	 *
	 * @param inputArray the array to process
	 * @return true if condition is met, false otherwise
	 */
	public static boolean findCycle3(int[] inputArray){
		Set<Integer> elementMap=new TreeSet<Integer>();
		int N=inputArray.length;
		int currIndex=0,count=0;
		while(true){
			if(elementMap.contains(currIndex))
			{
				// Check for null/base case
				if(currIndex==0 && count==N)
					return true;
				else
					return false;
			}
			elementMap.add(currIndex);
			count+=1;
			currIndex=(currIndex+inputArray[currIndex])%N;
		}	
	}

}
