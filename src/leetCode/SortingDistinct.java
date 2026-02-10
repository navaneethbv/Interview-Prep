package leetCode;

import java.util.HashMap;

/*
 * Link : https://codility.com/programmers/task/distinct
 */

public class SortingDistinct {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{2,1,1,2,3,1}));
	}
	public static int solution(int[] A){
		HashMap<Integer, Integer> elementMap=new HashMap<>();
		int count=0;
		for (int i = 0; i < A.length; i++) {
			if(!elementMap.containsKey(A[i]))
			{
				elementMap.put(A[i],A[i]);
				count++;
			}
		}
		return count;
	}
}