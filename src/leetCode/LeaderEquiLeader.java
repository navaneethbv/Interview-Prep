package leetCode;

import java.util.HashMap;

/*
 * Link : https://codility.com/programmers/task/equi_leader
 */

/**
 * Implementation of Leader Equi Leader algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LeaderEquiLeader {
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
	 * Performs solution operation.
	 *
	 * @param A the array to process
	 * @return the computed integer result
	 */
	public static int solution(int[] A){
		HashMap<Integer, Integer> elementMap=new HashMap<>();
		elementMap.put(A[0], 1);
		int max=1,leaderElement=A[0];
		for (int i = 1; i < A.length; i++) {
			int element=A[i];
			if(elementMap.containsKey(element))
			{
				elementMap.put(element,elementMap.get(element)+1);
				if(elementMap.get(element)>max)
				{
					max=elementMap.get(element);
					leaderElement=element;
				}
			}
			else{
				elementMap.put(element,1);
			}
		}
		int totalLeaders=0;
		// Iterate through all elements
		for (int i = 0; i < A.length; i++) {
			if(A[i]==leaderElement)
			{
				totalLeaders++;
			}
		}
		if(totalLeaders<=A.length/2)
			return 0;
		
		int finalLeaderCount=0,equiLeaders=0;
		// Iterate through all elements
		for (int i = 0; i < A.length; i++) {
			if(A[i] == leaderElement) 
				finalLeaderCount++;
		    int leadersInRightPart = (totalLeaders - finalLeaderCount);
		    if(finalLeaderCount > (i+1)/2   &&   leadersInRightPart > (A.length-i-1)/2){
		      equiLeaders++;
		    }
		}
		return equiLeaders;
	}
}