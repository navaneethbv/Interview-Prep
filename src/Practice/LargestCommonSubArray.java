package Practice;

import java.util.*;

public class LargestCommonSubArray {
	public static void main(String[] args) {
		int[] array1 = {1,2,3,2,3,2};
		int[] array2 = {2,2,3,3,4,5};
		for(int i = 0; i < largestCommonSubArray(array1,array2).length; i++) {
			System.out.print(largestCommonSubArray(array1,array2)[i]);
		}
	}

	private static Object[] largestCommonSubArray(int[] array1, int[] array2) {
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < array1.length; i++) {
			set.add(array1[i]);
		}
		for(int i = 0; i < array2.length; i++) {
			if(set.contains(array2[i])) {
				list.add(array2[i]);
			}			
		}
		return  list.toArray();
	}
}