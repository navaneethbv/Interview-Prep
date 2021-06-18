package Practice;

import java.util.Scanner;

public class Linear_Search {	
	public static int search(int[] array, int x){
		for(int i = 0; i < array.length; i++){
			if(array[i] == x){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = {12,44,66,36,98,73};
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be searched");
		int number = scan.nextInt();
		if(search(array,number) != -1){
			System.out.println("Number found at position "+search(array,number));
		}
		else 
			System.out.println("Number is not present in the array");
	}

}
