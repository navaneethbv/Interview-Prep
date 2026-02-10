package Practice;

import java.util.Arrays;

public class longestSubArrayContainingConsecutiveNumbers {
	public static void main(String[] args) {
		// Find the longest consecutive numbers from input array
		int[] input = {4, 5, 13, 33, 32, 10, 11, 34, 12, 31, 14};
		
		int[] res = findLongestConsecNum(input);
		
		System.out.println(Arrays.toString(res));
	}
	
	static int[] findLongestConsecNum(int[] input) {
		// sorting and find the longest consecutive num : O(nlogn) + O(n)
		// scan all numbers if a number belongs to certain consecutive chain : 1+2+3+...+n-1 = O(n^2)
		
		Arrays.sort(input);
		
		int[] temp = new int[input.length];
		int[] res = new int[input.length];
		temp[0] = input[0];
		int count=1, maxcount = -1;
		for(int i=1; i<input.length; i++) {
			if(input[i]-input[i-1] != 1) {
				if(count > maxcount) {
					maxcount = count;
					for(int j=0; j<temp.length; j++) {
						res[j] = temp[j];
					}
				}
				count = 0;
			}
			temp[count++] = input[i];
		}
		
		return Arrays.copyOf(res, maxcount);
	}
}
