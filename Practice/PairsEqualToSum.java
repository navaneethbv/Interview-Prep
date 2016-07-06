package Practice;

import java.util.*;

public class PairsEqualToSum {

	public static void main(String[] args) {
		int sum = 22;
		// UnSorted array with no duplicates
		int array[] = { 11, 8, 17, 3 , 9, 7, 13, 5, 15, 6 };
		printPairsEqualToSum(array,sum);
	}

	private static void printPairsEqualToSum(int[] array, int sum) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		int difference = 0;
		if(checkDuplicate(array, sum)) { // To remove faulty condition where sum/2 occurs once.
			set.remove(sum/2);
		}
		for(int i = 0 ; i < array.length; i++) {
			difference = sum - array[i];
			if(set.contains(difference)) {
				System.out.println("Pair of numbers adding to Sum "+sum+" are "+array[i]+" and "+difference);
				set.remove(array[i]);
			}
		}
	}

	private static boolean checkDuplicate(int[] array, int sum) {
		int dupValue = sum / 2; int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == dupValue) {
				count++;
			}
		}
		if(count == 1) {
			return true;
		} else {
			return false;
		}
	}
}
