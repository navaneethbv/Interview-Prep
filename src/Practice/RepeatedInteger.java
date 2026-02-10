package Practice;

import java.util.HashSet;

public class RepeatedInteger {
	public static int isRepeated(int[] array){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < array.length; i++){
			if(!set.contains(array[i])) {
					set.add(array[i]);
			}
			else
				return array[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {1,4,0,8,12,4,34};
		if(isRepeated(array) != -1){
			System.out.println("The repeated number in the array is "+isRepeated(array));
		}
		else
			System.out.println("There are no repeated numbers in the array");
	}
}
