package appleInterview;

import java.util.HashSet;

public class _01PrepDocRepeatedInteger {
	public static void main(String[] args) {
		int[] arr=new int[]{1,4,0,4,6,3}; 
		if(repeatedInteger(arr) == -1) {
			System.out.println("No duplicates found");
		} else {
			System.out.println(repeatedInteger(arr));
		}
	}

	private static int repeatedInteger(int[] arr) {
		HashSet<Integer> set=new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i]))
				return arr[i];
			else
				set.add(arr[i]);
		}
		return -1;
	}
}
