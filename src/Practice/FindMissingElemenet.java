package Practice;

import java.util.Arrays;

public class FindMissingElemenet {

	public static void main(String[] args) {
		int[] array = {8,4,7,3,6,2,9,5,11};
		if(isMissingNumber(array) != -1){
			System.out.println("The missing number is "+isMissingNumber(array));
		}
		else
			System.out.println("There are no missing numbers in the array");
	}
	// Worst case is nlogn
	private static int isMissingNumber(int[] array) {
		Arrays.sort(array);
		for(int i=0;i<array.length;i++){
			if(array[i] + 1 != array[i+1]){
				return array[i] + 1;
			}
		}
		return -1;
	}
}
